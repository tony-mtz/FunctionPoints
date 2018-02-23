/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metricssuite;
import com.google.gson.Gson;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.MenuItem;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import org.hildan.fxgson.FxGson;
import utils.ProjectData;
import utils.ProjectObject;

import java.io.*;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.scene.control.Menu;


/**
 *
 * @author tonyd
 */
public class Controller implements Initializable{

    
    
    @FXML
    private MenuItem mLanguage;
    @FXML
    private GridPane gridPane;
    private TabPane tabPane;  
    @FXML
    private Menu metrics;
    
    
    /**
     * Set the setDisable property for metrics on the main menu.
     * @param tf 
     */
    
    @FXML
    public void metricsMenu(boolean tf){
        System.out.println("in metrics menu method");
        metrics.setDisable(tf);
    }
    

    /**
     * tab from file
     */
    @FXML
    private void addTab(ProjectData data) {
        try {
            Context.getInstance().setMenuTab(Boolean.FALSE);
            Tab tab = new Tab("Function Points");
            tabPane.getTabs().add(tab);
            FXMLLoader loader = new FXMLLoader(this.getClass().getResource("FPTab.fxml"));
            tab.setContent(loader.load());
            FPTabController controller = loader.getController();
            controller.initProjectData(data);
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    /**
     * create from main menu
     */
    @FXML
    private void loadTab(){
         try {             
            Context.getInstance().setMenuTab(Boolean.TRUE);
            Tab tab = new Tab("Function Points");            
            tabPane.getTabs().add(tab);
            tab.setContent(FXMLLoader.load(this.getClass().getResource("FPTab.fxml")));

            // TODO: DELETE AND MOVE
            Tab tab2 = new Tab("SMI");
            tabPane.getTabs().add(tab2);
            tab.setContent(FXMLLoader.load(this.getClass().getResource("SMITab.fxml")));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void exit() {       
        Platform.exit();
    }

    @FXML
    void popup(Event event) throws IOException{
            
        VBox vbox = FXMLLoader.load(getClass().getResource("LanguageWindow.fxml"));
        Stage stage = new Stage();
        Scene scene = new Scene(vbox);
        stage.setScene(scene);
        stage.show();
    }
    
    /**
     * Opens new project window
     * Data is saved from NewProjectController btnOk
     * @param event         None
     */
    @FXML
    public void newProject(Event event){
        try {
            VBox vbox = FXMLLoader.load(getClass().getResource("NewProject.fxml"));            
            Stage stage = new Stage();
            Scene scene = new Scene(vbox);
            stage.setScene(scene);
            stage.setTitle("New Project");
            stage.show();
            
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
    
   
    /**
     * Saves project
     * 
     * Currently: still need:
     *            reference language
     *            weighting factors
     *             input total
     *            computed fp
     * 
     *            And select file to save to 
     *            right now it saves to a predefined file in the local folder 
     * 
     * @param event             None
     */
    @FXML
    public void saveProject(Event event){
       
        //chose file name..ect
        //save to gson before writing
        Gson gson = FxGson.create();//new Gson();
        String dataString = gson.toJson(Context.getInstance().getProjectObject(), ProjectObject.class );        
        try{
                File file = new File("temp1" +".ms");
                Writer writer = new BufferedWriter(new FileWriter(file));
                writer.write(dataString);
                writer.flush();            
                System.out.println("Fin Saved");
                System.out.println("Number of tabs: " +Context.getInstance().getProjectObject().projData.size());
        }catch(IOException e){
            System.out.println(e.getMessage());
        }      
        
    }
    /**
     * Load project from selected file
     * 
     * @param event         None
     */
    @FXML
    public void openFile(ActionEvent event){      
        
        Context.getInstance().resetIncr();
        //get file from file chooser        
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Select Project");
        //extension filter
        FileChooser.ExtensionFilter extentionFilter = new FileChooser.ExtensionFilter("ms files (*.ms)", "*.ms");
        fileChooser.getExtensionFilters().add(extentionFilter);        
        File selectedFile = fileChooser.showOpenDialog(null);        

        if(selectedFile != null){
            System.out.println(selectedFile.toString());
            Gson gson = FxGson.create();
            ProjectObject projFile;
            
            try {
                projFile = gson.fromJson(new FileReader(selectedFile.toString()), ProjectObject.class);
                Context.getInstance().setProjectObject(projFile);
                System.out.println("context: " +Context.getInstance().getProjectObject().projData.size());
                int size = Context.getInstance().getProjectObject().projData.size();
                Context.getInstance().setMenuBarName("CECS 543 Metrics Suite - " + projFile.projectName);
                
                closeTabs();
                metricsMenu(false); //metrics option available
                //open smi tab first
                openSMI();
                //populate new tabs if any
                for(int i =0; i<size; i++){
                    addTab(projFile.projData.get(i));
                }
            System.out.println("End of load size data: " +Context.getInstance().getProjectObject().productName);
            //System.out.println("Context size at the end of open: " +Context.getInstance().getProjectObject().projData.size());
            } catch (FileNotFoundException ex) {
                System.out.println(ex.getMessage());
            }
        }else{
            System.out.println("nothing");
        }
    }
 
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        Context.getInstance().setMenuBarName("CECS 543 Metrics Suite");
        Context.getInstance().menuBarNameProperty().addListener((observable, oldValue, newValue) -> {
            Stage stage = (Stage) gridPane.getScene().getWindow();
            stage.setTitle(newValue);
            
            closeTabs();
            tabPane = new TabPane();
            gridPane.add(tabPane, 0,1,1,1);
            metricsMenu(false); //enable metrics menu
            openSMI();
            
        });
        
        
    }
    
    public void closeTabs(){
        System.out.println("about to try close tabs...");
                if(tabPane!=null){
                    System.out.println("closing some open tabs :) .....");
                    System.out.println(tabPane.getTabs().size());
                    tabPane.getTabs().clear();
                }else{
                    System.out.println("NO tabs to close ...");
                }
    }
    
    public void openSMI(){
        try {
                Tab tab = new Tab("SMI Tab");
                tabPane.getTabs().add(tab);
                FXMLLoader loader = new FXMLLoader(this.getClass().getResource("SMITab.fxml"));
                tab.setContent(loader.load());
                SMITabController controller = loader.getController();
                //controller.initProjectData(data);
            } catch (IOException e) {
                e.printStackTrace();
            }
    }
    
}

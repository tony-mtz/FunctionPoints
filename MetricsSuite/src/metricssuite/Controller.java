/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metricssuite;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.beans.binding.Bindings;
import javafx.beans.binding.StringBinding;
import javafx.beans.property.ReadOnlyIntegerProperty;
import static javafx.beans.property.ReadOnlyIntegerProperty.readOnlyIntegerProperty;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.event.Event;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import utils.ProjectObject;

import com.google.gson.*;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Writer;
import javafx.beans.binding.BooleanBinding;
import javafx.scene.Node;
import javafx.scene.layout.AnchorPane;
import org.hildan.fxgson.FxGson;
import utils.ProjectData;


/**
 *
 * @author tonyd
 */
public class Controller implements Initializable{

    
    @FXML
    private MenuItem mLanguage;
    @FXML
    private GridPane gridPane;
//    @FXML
    private TabPane tabPane;   

    /**
     * tab from file
     */
    @FXML
    private void addTab() {
        try {
            Tab tab = new Tab("Function Points");            
            tabPane.getTabs().add(tab);
            tab.setContent(FXMLLoader.load(this.getClass().getResource("FPTab.fxml")));
            Context.getInstance().setMenuTab(Boolean.FALSE);
            
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
     * @param event 
     */
    @FXML
    public void newProject(Event event){
        try {    
            if(tabPane!=null){
                System.out.println(tabPane.getTabs().size());
                tabPane.getTabs().clear();
            }
            tabPane = new TabPane();
            gridPane.add(tabPane, 0,1,1,1);
            
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
     * @param event 
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
     * @param event 
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
            selectedFile.getAbsolutePath();                     
            System.out.println(selectedFile.toString());
            Context.getInstance().setPath(selectedFile.toString());
            System.out.println(Context.getInstance().getPath());
            Gson gson = FxGson.create();
            ProjectObject projFile;            
            try {
                projFile = gson.fromJson(new FileReader(selectedFile.toString()), ProjectObject.class);
                Context.getInstance().setProjectObject(projFile);
                System.out.println("context: " +Context.getInstance().getProjectObject().projData.size());
                int size = Context.getInstance().getProjectObject().projData.size();
                //clear tabs that are opened
                
                if(tabPane!=null){
                    System.out.println(tabPane.getTabs().size());
                    tabPane.getTabs().clear();
                }
                tabPane = new TabPane();
                gridPane.add(tabPane, 0,1,1,1);
                //populate new tabs if any
                for(int i =0; i<size; i++){
                    addTab();                    
                }                
                for(int i =0; i<size; i++){
                SingleSelectionModel<Tab> selectionModel = tabPane.getSelectionModel();
                    selectionModel.select(i);
                    Node n = selectionModel.getSelectedItem().getContent();
                    AnchorPane ap = (AnchorPane) selectionModel.getSelectedItem().getContent();
                    ObservableList<Node> comp = ap.getChildren();
                                        
                    for(Node node: comp){
                        //System.out.println("node id: " +node.getId().toString());
                        if (node instanceof TextField){
                            if(((TextField) node).getId() != null){
                                System.out.println(((TextField) node).getId() +
                                        ((TextField) node).getText());
                                if(((TextField) node).getId().equals("extInp")){                           
                                    ((TextField) node).setText((Integer.toString(Context.getInstance().getProjectObject().projData.get(i).extInputs)));
                                }
                                if(((TextField) node).getId().equals("extOut")){                           
                                    ((TextField) node).setText((Integer.toString(Context.getInstance().getProjectObject().projData.get(i).extOutputs)));
                                }
                                if(((TextField) node).getId().equals("extInq")){                           
                                    ((TextField) node).setText((Integer.toString(Context.getInstance().getProjectObject().projData.get(i).extInquiries)));
                                }
                                if(((TextField) node).getId().equals("intFiles")){                           
                                    ((TextField) node).setText((Integer.toString(Context.getInstance().getProjectObject().projData.get(i).intLogicFiles)));
                                }
                                 if(((TextField) node).getId().equals("extFiles")){                           
                                    ((TextField) node).setText((Integer.toString(Context.getInstance().getProjectObject().projData.get(i).extIntFiles)));
                                }
                                
                            }
                        }else if(node instanceof Toggle){
//                            System.out.print("toggle group: " +((Toggle) node).getToggleGroup().toString());  
//                            System.out.println(((RadioButton)node).getToggleGroup()); 
//                            System.out.println("radiob : " + ((RadioButton)node).getToggleGroup().getSelectedToggle()); 
//                            RadioButton rb = (RadioButton) ((Toggle) node).getToggleGroup().getSelectedToggle();
                            RadioButton rb = (RadioButton) ((Toggle) node).getToggleGroup().getSelectedToggle();
                            
                            //RadioButton rb = (RadioButton)tog;
                            System.out.println(rb.getId()); 
                            System.out.println(Integer.parseInt(rb.getText())); 
                        }else if(node instanceof RadioButton){
//                            System.out.print("toggle group: " +((Toggle) node).getToggleGroup().toString());  
//                            System.out.println(((RadioButton)node).getToggleGroup()); 
//                            System.out.println("radiob : " + ((RadioButton)node).getToggleGroup().getSelectedToggle()); 
//                            RadioButton rb = (RadioButton) ((Toggle) node).getToggleGroup().getSelectedToggle();
                            RadioButton rb = (RadioButton) ( (RadioButton)node).getToggleGroup().getSelectedToggle();
                            //RadioButton rb = (RadioButton)tog;
                            System.out.println(rb.getId()); 
                            System.out.println(Integer.parseInt(rb.getText())); 
                            //if(tog.toggleGroupProperty().getName()){
                            if(((RadioButton) node).getId().equals("rbExtInp6")){                           
                                    ((RadioButton) node).setSelected(true);
                            }
                        }
                                
                    }
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
    }
    
    
    
}

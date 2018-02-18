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

import com.google.gson.Gson;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Writer;
import javafx.beans.binding.BooleanBinding;
import javafx.scene.Node;
import javafx.scene.layout.AnchorPane;
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

    @FXML
    private void addTab() {
        try {
            Tab tab = new Tab("Function Points");
            
            tabPane.getTabs().add(tab);
            tab.setContent(FXMLLoader.load(this.getClass().getResource("FPTab.fxml")));
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    private void loadTab(ProjectData data){
        try{
            Tab tab  = new Tab("Function Points");
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("FPTab.fxml"));
            FPTabController t = loader.getController();
            t.initProjectData(data);
            tabPane.getTabs().add(tab);
            tab.setContent(loader.load());
        }catch(IOException exception){
            
                    
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
       
        //this selects the tab (0) (1) ....(n)
        int index = Context.getInstance().getProjectObject().projData.size();
        //System.out.println(index);
        for(int i =0; i< index; i++){
            SingleSelectionModel<Tab> selectionModel = tabPane.getSelectionModel();
            selectionModel.select(i);
            Node n = selectionModel.getSelectedItem().getContent();
            AnchorPane ap = (AnchorPane) selectionModel.getSelectedItem().getContent();
            ObservableList<Node> comp = ap.getChildren();
            
            for(Node node: comp){
                if (node instanceof TextField){
                    //System.out.println(((TextField) node).getText());
                    //System.out.println(((TextField) node).getId());
                    if(((TextField) node).getId() != null){
//                        System.out.println(((TextField) node).getId() +
//                                ((TextField) node).getText());
                        if(((TextField) node).getId().equals("extInp")){                           
                            Context.getInstance().getProjectObject().projData.get(i).extInputs = Integer.parseInt(((TextField) node).getText());
                        }
                        if(((TextField) node).getId().equals("extOut")){                           
                            Context.getInstance().getProjectObject().projData.get(i).extOutputs = Integer.parseInt(((TextField) node).getText());
                        }
                        if(((TextField) node).getId().equals("extInq")){                           
                            Context.getInstance().getProjectObject().projData.get(i).extInquiries = Integer.parseInt(((TextField) node).getText());
                        }
                        if(((TextField) node).getId().equals("intFiles")){                           
                            Context.getInstance().getProjectObject().projData.get(i).intLogicFiles = Integer.parseInt(((TextField) node).getText());
                        }
                        if(((TextField) node).getId().equals("extFiles")){                           
                            Context.getInstance().getProjectObject().projData.get(i).extIntFiles = Integer.parseInt(((TextField) node).getText());
                        }
                        
                        //still need================
                        //save preference language
                        //weighting factors
                        //input total
                        //computed fp
                    }
                }
            }
        }
              
        //chose file name..ect
        //save to gson before writing
        Gson gson = new Gson();
        String dataString = gson.toJson(Context.getInstance().getProjectObject(), ProjectObject.class );        
        try{
                File file = new File("temp1" +".ms");
                Writer writer = new BufferedWriter(new FileWriter(file));
                writer.write(dataString);
                writer.flush();            
                System.out.println("Fin Saved");
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
        
        
        
    }
    /**
     * Load project from selected file
     * @param event 
     */
    @FXML
    public void openFile(ActionEvent event){      
        
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
            Gson gson = new Gson();
            ProjectObject projFile;
            try {
                projFile = gson.fromJson(new FileReader(selectedFile.toString()), ProjectObject.class);
                
                //reset context
                ProjectObject newProject = new ProjectObject();
                //pass new project to context
                Context.getInstance().setProjectObject(newProject);
                System.out.println("Context proj size: " + Context.getInstance().getProjectObject().projData.size());
                System.out.println("projFile " + projFile.projData.size());
//                Context.getInstance().getProjectObject().setLanguage(projFile.getLanguage());
                Context.getInstance().getProjectObject().comments = projFile.comments;
                Context.getInstance().getProjectObject().creator = projFile.creator;
                Context.getInstance().getProjectObject().productName =projFile.productName;
                Context.getInstance().getProjectObject().projectName = projFile.projectName;
                System.out.println("GSON proj size: " +projFile.projData.size());
              //  System.out.println(projFile.projData.get(0).extInputs+ "....extInputs");

                //check the size and add a new Data, aka - one for each tab.
                for(int i =0; i<projFile.projData.size(); i++){
                    ProjectData data = new ProjectData();
                    data.extInputs = projFile.projData.get(i).extInputs;
                    data.extOutputs = projFile.projData.get(i).extOutputs;
                    data.extInquiries = projFile.projData.get(i).extInquiries;
                    data.intLogicFiles = projFile.projData.get(i).intLogicFiles;
                    data.extIntFiles = projFile.projData.get(i).extIntFiles;
                    data.wfExtInputs = projFile.projData.get(i).wfExtInputs;
                    data.wfExtOutputs = projFile.projData.get(i).wfExtOutputs;
                    data.wfExtInquiries = projFile.projData.get(i).wfExtInquiries;
                    data.wfIntLogicFiles = projFile.projData.get(i).wfIntLogicFiles;
                  for(int j=0; j<14; j++){
                        data.setValueFactorAtIndex(j, projFile.projData.get(i).getValueFactorAtIndex(j));
                    }
                  Context.getInstance().getProjectObject().projData.add(data);
                }
                
                //clear tabs that are opened
//                tabPane.getTabs().clear();
                tabPane = new TabPane();
                gridPane.add(tabPane, 0,1,1,1);
                
                //populate new tabs if any
                for(int i =0; i<projFile.projData.size(); i++){

                    addTab();
//<<<<<<< HEAD
//                FXMLLoader loader = new FXMLLoader();
//                loader.setLocation(getClass().getResource("FPTab.fxml"));
//                FPTabController t = loader.getController();
                
                }
            
                for(int i =0; i<projFile.projData.size(); i++){
                SingleSelectionModel<Tab> selectionModel = tabPane.getSelectionModel();
                    selectionModel.select(i);
                    Node n = selectionModel.getSelectedItem().getContent();
                    AnchorPane ap = (AnchorPane) selectionModel.getSelectedItem().getContent();
                    ObservableList<Node> comp = ap.getChildren();

                    for(Node node: comp){
                        if (node instanceof TextField){
                            if(((TextField) node).getId() != null){
//                                System.out.println(((TextField) node).getId() +
//                                        ((TextField) node).getText());
                                if(((TextField) node).getId().equals("extInp")){                           
                                    ((TextField) node).setText((Integer.toString(Context.getInstance().getProjectObject().projData.get(i).extInputs)));
                                }

                            }
                        }
                    }
//=======
                    FXMLLoader loader = new FXMLLoader();
                    loader.setLocation(getClass().getResource("FPTab.fxml"));
                    FPTabController t = loader.getController();
                    t.initProjectData(projFile.projData.get(i));
//>>>>>>> a5638c4c6eeeb9655b7c9072b69d9c4ebdd31d01
                }
            System.out.println(Context.getInstance().getProjectObject().productName);
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
//        Context.getInstance().getProjectObject().creator = "tonyM!";
       // System.out.println("hello");//Context.getInstance().getProjectObject().creator);
          
    }
    
    
    
}

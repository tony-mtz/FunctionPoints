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
import java.io.FileNotFoundException;
import java.io.FileReader;
import utils.ProjectData;


/**
 *
 * @author tonyd
 */
public class Controller implements Initializable{

    
    @FXML
    private MenuItem mLanguage;
    @FXML
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
     * Load project from selected file
     * @param event 
     */
    @FXML
    public void openFile(ActionEvent event){
       
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Select Project");
        File selectedFile = fileChooser.showOpenDialog(null);
        if(selectedFile != null){
            selectedFile.getAbsolutePath();
        }else{
            System.out.println("nothing");
        }
        
        System.out.println(selectedFile.toString());
        Gson gson = new Gson();
        ProjectObject projFile;
        try {
            projFile = gson.fromJson(new FileReader(selectedFile.toString()), ProjectObject.class);
            
            Context.getInstance().projObject().language= projFile.language;
            Context.getInstance().projObject().comments = projFile.comments;
            Context.getInstance().projObject().creator = projFile.creator;
            Context.getInstance().projObject().productName =projFile.productName;
            Context.getInstance().projObject().projectName = projFile.projectName;
            System.out.println(projFile.projData.size());
            System.out.println(projFile.projData.get(0).extInputs+ "....extInputs");

            //Context.getInstance().projObject().projData.set(0, );//   .get(0).extInputs = projFile.projData.get(0).extInputs;
            System.out.println(Context.getInstance().projObject().projData.get(0).extInputs);
            for(int i =0; i<projFile.projData.size(); i++){
                Context.getInstance().projObject().projData.get(i).extInputs = projFile.projData.get(i).extInputs;
                Context.getInstance().projObject().projData.get(i).extOutputs = projFile.projData.get(i).extOutputs;
                Context.getInstance().projObject().projData.get(i).extInquiries = projFile.projData.get(i).extInquiries;
                Context.getInstance().projObject().projData.get(i).intLogicFiles = projFile.projData.get(i).intLogicFiles;
                Context.getInstance().projObject().projData.get(i).extIntFiles = projFile.projData.get(i).extIntFiles;
                Context.getInstance().projObject().projData.get(i).wfExtInputs = projFile.projData.get(i).wfExtInputs;
                Context.getInstance().projObject().projData.get(i).wfExtOutputs = projFile.projData.get(i).wfExtOutputs;
                Context.getInstance().projObject().projData.get(i).wfExtInquiries = projFile.projData.get(i).wfExtInquiries;
                Context.getInstance().projObject().projData.get(i).wfIntLogicFiles = projFile.projData.get(i).wfIntLogicFiles;
                Context.getInstance().projObject().projData.get(i).wfExtIntFiles = projFile.projData.get(i).wfExtIntFiles;
                for(int j=0; j<14; j++){
                    Context.getInstance().projObject().projData.get(i).vaf.setValue(i,projFile.projData.get(i).vaf.getValue(j));
                }
            }
        System.out.println(Context.getInstance().projObject().productName);
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        
    }
 
    @Override
    public void initialize(URL url, ResourceBundle rb) {
//        Context.getInstance().projObject().creator = "tonyM!";
       // System.out.println("hello");//Context.getInstance().projObject().creator);
          
    }
    
    
    
}

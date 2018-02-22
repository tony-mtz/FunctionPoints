package metricssuite;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.binding.Bindings;
import javafx.beans.binding.BooleanBinding;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.SingleSelectionModel;
import javafx.scene.control.Tab;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import utils.ProjectData;
import utils.ProjectObject;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tonyd
 */
public class NewProjectController implements Initializable{
    
    
    @FXML public Button btnOk;
    @FXML public Button btnCancel;
    @FXML public TextField projName;
    @FXML public TextField productName;
    @FXML public TextField creator;
    @FXML public TextArea comments;
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }
    
    
    /**
     * Populate Context object with new project data
     * @param Event 
     */
    @FXML
    public void createProject(ActionEvent Event){  
        //create new project
        ProjectObject newProject = new ProjectObject();
        //pass new project to context
        Context.getInstance().setProjectObject(newProject);
        
        String projN = projName.getText();
        String prodN = productName.getText();
        String creatorS = creator.getText();
        String commentsTxt = comments.getText();
        
        Context.getInstance().getProjectObject().setCreator(creatorS);
        Context.getInstance().getProjectObject().setProductName(prodN);
        Context.getInstance().getProjectObject().setProjectName(projN);
        Context.getInstance().getProjectObject().setComments(commentsTxt);
        Context.getInstance().setMenuBarName("CECS 543 Metrics Suite - " + projN);

        Stage stage = (Stage) btnOk.getScene().getWindow();      
       
        stage.close();
        System.out.println("closing newproj window");
    }
    
    @FXML
    public void cancelCreate(ActionEvent Event){         
        Stage stage = (Stage) btnCancel.getScene().getWindow();             
        stage.close();
        //maybe open last loade file...
        System.out.println("closing newproj window");
        
    }
    
   
    
}

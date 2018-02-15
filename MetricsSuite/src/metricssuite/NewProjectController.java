package metricssuite;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
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
public class NewProjectController {
    
    
    @FXML public Button btnOk;
    @FXML public TextField projName;
    @FXML public TextField productName;
    @FXML public TextField creator;
    
    public ProjectObject newProject;
    
    @FXML
    public void createProject(ActionEvent Event){
        System.out.println("save!");
        String projN = new String(projName.getText());
        String prodN = new String(productName.getText());
        String creatorS = new String(creator.getText());
        ProjectData data = new ProjectData(); 
        newProject = new ProjectObject(projN, prodN, creatorS);
        newProject.projData.add(data);
        Stage stage = (Stage) btnOk.getScene().getWindow();
        stage.close();
        System.out.println(newProject.creator);
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metricssuite;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
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
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import utils.ProjectObject;


/**
 *
 * @author tonyd
 */
public class Controller implements Initializable{

    
    @FXML
    private MenuItem mLanguage;
    @FXML
    private TabPane tabPane;
    ProjectObject proj = new ProjectObject();

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
    void popup(Event event) throws IOException{
        System.out.println("hello");
        
        VBox vbox = FXMLLoader.load(getClass().getResource("LanguageWindow.fxml"));
        
        Stage stage = new Stage();
        Scene scene = new Scene(vbox);
        stage.setScene(scene);
        stage.show();
    }
    
    @FXML
    private void newProject(Event event){
        try {
            VBox vbox = FXMLLoader.load(getClass().getResource("NewProject.fxml"));            
            Stage stage = new Stage();
            Scene scene = new Scene(vbox);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
       
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
                
                
       
        
    }
    
    
    
}

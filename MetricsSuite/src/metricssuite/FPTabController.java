package metricssuite;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import javax.swing.table.TableColumn;
import javax.swing.text.TableView;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.scene.control.TextField;
import utils.ProjectData;

public class FPTabController implements Initializable{
   @FXML private TextField extInp;
   @FXML private TextField extOut;
   @FXML private TextField extInq;
   @FXML private TextField intFiles;
   @FXML private TextField extFiles;
   @FXML private TextField vafSum;

   @FXML private ToggleGroup externalInputs;

   @FXML private TextField extInpResults;

   public int index;
   private ProjectData data;

    @FXML
    void popup(Event event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("LanguageWindow.fxml"));
        Stage stage = new Stage();
        stage.setScene(new Scene(fxmlLoader.load()));
        LanguageController controller = fxmlLoader.getController();
        controller.initData(index);
        
        stage.show();
    }

    @FXML
    void vafPopup(Event event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("VAFWindow.fxml"));
        Stage stage = new Stage();
        stage.setScene(new Scene(fxmlLoader.load()));
        VAFController controller = fxmlLoader.getController();
        controller.initIndex(index);
        controller.initSliders();
        stage.show();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        index = Context.getInstance().createNewData();
        System.out.println(index);
        data = Context.getInstance().getProjectObject().projData.get(index);
        extInp.setOnAction(event -> {
            int value = Integer.parseInt(extInp.getText());
            data.extInputs = value;
            RadioButton chk = (RadioButton) externalInputs.getSelectedToggle();
            int complexity = Integer.parseInt(chk.getText());
            extInpResults.setText(String.valueOf(complexity*value));
        });
        externalInputs.selectedToggleProperty().addListener((observable, oldValue, newValue) -> {
            RadioButton chk = (RadioButton) externalInputs.getSelectedToggle();
            int complexity = Integer.parseInt(chk.getText());
            data.wfExtInputs = complexity;
            extInpResults.setText(String.valueOf(data.extInputs * complexity));
        });
        
        
        
    }
    
    
    @FXML
    public void setExt(){
        extInp.setText("wwww");
    }
    
    public int getIndex(){
        return index;
    }



}

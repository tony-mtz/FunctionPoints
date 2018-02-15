package metricssuite;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class LanguageController implements Initializable {

    @FXML
    private ChoiceBox languageChoice;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        List<String> testList = new ArrayList<String>();
        testList.add("Test");
        testList.add("Java");
        ObservableList obList = FXCollections.observableList(testList);
        languageChoice.setItems(obList);
    }
}


package metricssuite;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class LanguageController implements Initializable {
    @FXML
    private ToggleGroup languageGroup;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        System.out.println("Default language: " + Context.getInstance().getDefaultLanguage());
        languageGroup.selectedToggleProperty().addListener(new ChangeListener<Toggle>() {
            @Override
            public void changed(ObservableValue<? extends Toggle> observable, Toggle oldValue, Toggle newValue) {
                RadioButton chk = (RadioButton) newValue.getToggleGroup().getSelectedToggle();
                Context.getInstance().setDefaultLanguage(chk.getText());
                System.out.println("New default: " + Context.getInstance().getDefaultLanguage());
            }
        });
    }
}


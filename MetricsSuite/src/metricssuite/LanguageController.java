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
import utils.ProjectData;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class LanguageController implements Initializable {
    @FXML
    private ToggleGroup languageGroup;
    @FXML
    private Button done;
    private ProjectData data;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        System.out.println("Default language: " + Context.getInstance().getDefaultLanguage());
    }

    public void submit() {
        Stage stage = (Stage) done.getScene().getWindow();
        RadioButton selectedRadioButton = (RadioButton) languageGroup.getSelectedToggle();
        String language = selectedRadioButton.getText();
        if(data != null)
            data.language = language;
        else {
            Context.getInstance().setDefaultLanguage(language);
        }
        stage.close();
    }

    public void initData(int index) {
        data = Context.getInstance().getProjectObject().projData.get(index);
    }
}


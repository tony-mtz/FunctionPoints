package metricssuite;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;
import utils.ProjectData;

import java.net.URL;
import java.util.ResourceBundle;

public class LanguageController implements Initializable {
    @FXML
    private ToggleGroup languageGroup;
    @FXML
    private Button done;

    private ProjectData data;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }

    /**
     * Action for submitting selection on language window.
     * Updates language in underlying source.
     */
    public void submit() {
        Stage stage = (Stage) done.getScene().getWindow();
        RadioButton selectedRadioButton = (RadioButton) languageGroup.getSelectedToggle();
        String language = selectedRadioButton.getText();
        if (data != null)
            data.setLanguage(language);
        else {
            Context.getInstance().setDefaultLanguage(language);
        }
        stage.close();
    }

    /**
     * Sets tab to corresponding ProjectData if necessary.
     *
     * @param data Selected ProjectData in projData list.
     */
    public void initData(ProjectData data) {
        this.data = data;
    }
}


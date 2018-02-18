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
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import javax.swing.table.TableColumn;
import javax.swing.text.TableView;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import utils.ProjectData;

public class FPTabController implements Initializable{
    @FXML private TextField extInp;
    @FXML private TextField extOut;
    @FXML private TextField extInq;
    @FXML private TextField intFiles;
    @FXML private TextField extFiles;
    @FXML private TextField vafSum;
    @FXML private TextField fpTotal;

    @FXML private ToggleGroup externalInputs;
    @FXML private ToggleGroup externalOutputs;
    @FXML private ToggleGroup externalInquiries;
    @FXML private ToggleGroup internalLogicalFiles;
    @FXML private ToggleGroup externalLogicalFiles;

    @FXML private TextField extInpResults;
    @FXML private TextField externalOutputResults;
    @FXML private TextField externalInquiriesResults;
    @FXML private TextField internalLogicalFilesResults;
    @FXML private TextField externalLogicalFilesResults;
    @FXML private TextField total;
    @FXML private TextField language;
    @FXML private TextField codeSize;

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
    void calculateFunctionPoints() {
        int total = (int) (data.getTotalFactors() * (0.65 + (0.01 * data.getValueFactorSum())));
        fpTotal.setText(String.valueOf(total));
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

    @FXML
    void computeCodeSize() {
        int size = Integer.parseInt(fpTotal.getText()) * Context.getInstance().getCodeRatio(data.getLanguage());
        codeSize.setText(String.valueOf(size));
    }

    int updateText(TextField field, ToggleGroup group, TextField results) {
        try {
            int value = Integer.parseInt(field.getText());
            if (value < 0) {
                throw new NumberFormatException("Number needs to be positive");
            }
            RadioButton chk = (RadioButton) group.getSelectedToggle();
            int complexity = Integer.parseInt(chk.getText());
            results.setText(String.valueOf(complexity*value));
            return value;
        } catch (NumberFormatException e){
            System.out.println("Invalid input.");
            return -1;
        }
    }

    int getRadioButtonValue(ToggleGroup group) {
        RadioButton chk = (RadioButton) group.getSelectedToggle();
        return Integer.parseInt(chk.getText());
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        index = Context.getInstance().createNewData();
        System.out.println(index);
        data = Context.getInstance().getProjectObject().projData.get(index);
        extInp.setOnAction(event -> {
            int result = updateText(extInp, externalInputs, extInpResults);
            if (result > -1) {
                data.extInputs = result;
                total.setText(String.valueOf(data.getTotalFactors()));
            } else {
                extInp.setText(String.valueOf(data.extInputs));
            }
        });
        externalInputs.selectedToggleProperty().addListener((observable, oldValue, newValue) -> {
            int complexity = getRadioButtonValue(externalInputs);
            data.wfExtInputs = complexity;
            extInpResults.setText(String.valueOf(data.extInputs * complexity));
            total.setText(String.valueOf(data.getTotalFactors()));
        });
        extInpResults.setText((String.valueOf(data.extInputs * data.wfExtInputs)));
        extOut.setOnAction(event -> {
            int result = updateText(extOut, externalOutputs, externalOutputResults);
            if (result > -1) {
                data.extOutputs = result;
                total.setText(String.valueOf(data.getTotalFactors()));
            } else {
                extOut.setText(String.valueOf(data.extOutputs));
            }
        });
        externalOutputs.selectedToggleProperty().addListener((observable, oldValue, newValue) -> {
            int complexity = getRadioButtonValue(externalOutputs);
            data.wfExtOutputs = complexity;
            externalOutputResults.setText(String.valueOf(data.extOutputs * complexity));
            total.setText(String.valueOf(data.getTotalFactors()));
        });
        externalOutputResults.setText((String.valueOf(data.extOutputs * data.wfExtOutputs)));
        extInq.setOnAction(event -> {
            int result = updateText(extInq, externalInquiries, externalInquiriesResults);
            if (result > -1) {
                data.extInquiries = result;
                total.setText(String.valueOf(data.getTotalFactors()));
            } else {
                extInq.setText(String.valueOf(data.extInquiries));
            }
        });
        externalInquiries.selectedToggleProperty().addListener((observable, oldValue, newValue) -> {
            int complexity = getRadioButtonValue(externalInquiries);
            data.wfExtInquiries = complexity;
            externalInquiriesResults.setText(String.valueOf(data.extInquiries * complexity));
            total.setText(String.valueOf(data.getTotalFactors()));
        });
        externalInquiriesResults.setText((String.valueOf(data.extInquiries * data.wfExtInquiries)));
        intFiles.setOnAction(event -> {
            int result = updateText(intFiles, internalLogicalFiles, internalLogicalFilesResults);
            if (result > -1) {
                data.intLogicFiles = result;
                total.setText(String.valueOf(data.getTotalFactors()));
            } else {
                intFiles.setText(String.valueOf(data.intLogicFiles));
            }
        });
        internalLogicalFiles.selectedToggleProperty().addListener((observable, oldValue, newValue) -> {
            int complexity = getRadioButtonValue(internalLogicalFiles);
            data.wfIntLogicFiles = complexity;
            internalLogicalFilesResults.setText(String.valueOf(data.intLogicFiles * complexity));
            total.setText(String.valueOf(data.getTotalFactors()));
        });
        internalLogicalFilesResults.setText((String.valueOf(data.intLogicFiles * data.wfIntLogicFiles)));
        extFiles.setOnAction(event -> {
            int result = updateText(extFiles, externalLogicalFiles, externalLogicalFilesResults);
            if (result > -1) {
                data.extIntFiles = result;
                total.setText(String.valueOf(data.getTotalFactors()));
            } else {
                extFiles.setText(String.valueOf(data.extIntFiles));
            }
        });
        externalLogicalFiles.selectedToggleProperty().addListener((observable, oldValue, newValue) -> {
            int complexity = getRadioButtonValue(externalLogicalFiles);
            data.wfExtIntFiles = complexity;
            externalLogicalFilesResults.setText(String.valueOf(data.extIntFiles * complexity));
            total.setText(String.valueOf(data.getTotalFactors()));
        });
        externalLogicalFilesResults.setText((String.valueOf(data.extIntFiles * data.wfExtIntFiles)));
        data.vafSumProperty().addListener((observable, oldValue, newValue) -> {
            vafSum.setText(String.valueOf(newValue));
        });
        data.languageProperty().addListener((observable, oldValue, newValue) -> language.setText(newValue));
        language.setText(data.getLanguage());
        total.setText(String.valueOf(data.getTotalFactors()));
    }
    
    public int getIndex(){
        return index;
    }
}

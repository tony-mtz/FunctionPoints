package metricssuite;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;
import utils.ProjectData;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

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
    
    @FXML private boolean menuTab = true;

    private int index;
    private ProjectData data;
    
  
    @FXML void menuTrue(boolean bool){
        menuTab = bool;
    }

    /**
     * Creates pop-up window for language selection for current Data object.
     * @param event         None
     * @throws IOException  FXML loading
     */
    @FXML
    void popup(Event event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("LanguageWindow.fxml"));
        Stage stage = new Stage();
        stage.setScene(new Scene(fxmlLoader.load()));
        LanguageController controller = fxmlLoader.getController();
        controller.initData(index);
        
        stage.show();
    }

    /**
     * Calculates the current function points and sets output TextField to result.
     */
    @FXML
    void calculateFunctionPoints() {
        double total = (data.getTotalFactors() * (0.65 + (0.01 * data.getValueFactorSum())));
        fpTotal.setText(String.format("%.1f",total));
        data.setPjfpTotal(total);
    }

    /**
     * Creates pop-up window for ValueFactors with current data object.
     * @param event         None
     * @throws IOException  FXML loading
     */
    @FXML
    void vafPopup(Event event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("VAFWindow.fxml"));
        Stage stage = new Stage();
        stage.setScene(new Scene(fxmlLoader.load()));
        VAFController controller = fxmlLoader.getController();
        controller.initIndex(index);
        controller.initComboBoxes();
        stage.show();
    }

    /**
     * Calculates the code size using language ratios and sets output text field to the value.
     */
    @FXML
    void computeCodeSize() {
        int size = (int) (Double.parseDouble(fpTotal.getText()) * Context.getInstance().getCodeRatio(data.getLanguage()));
        codeSize.setText(String.valueOf(size));
    }

    /**
     * Updates the output result textfield by multiplying the input text
     * by the complexity factor. Checks to make sure input number is valid.
     * @param field     Input field for weighting factor
     * @param group     Complexity ToggleGroup for factor
     * @param results   Result field for setting valid answer
     * @return          value calculated, if invalid returns -1
     */
    private int updateText(TextField field, ToggleGroup group, TextField results) {
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

    /**
     * Gets the value of the selected radiobutton from a toggle group
     * @param group     ToggleGroup of RadioButton
     * @return          Integer value of selected radio button.
     */
    private int getRadioButtonValue(ToggleGroup group) {
        RadioButton chk = (RadioButton) group.getSelectedToggle();
        return Integer.parseInt(chk.getText());
    }

    /**
     * Sets the default output values for each value field and total, along with function points.
     */
    private void setDefaultValues() {
        extInpResults.setText((String.valueOf(data.extInputs * data.wfExtInputs)));
        externalOutputResults.setText((String.valueOf(data.extOutputs * data.wfExtOutputs)));
        externalInquiriesResults.setText((String.valueOf(data.extInquiries * data.wfExtInquiries)));
        externalLogicalFilesResults.setText((String.valueOf(data.extIntFiles * data.wfExtIntFiles)));
        language.setText(data.getLanguage());
        total.setText(String.valueOf(data.getTotalFactors()));
        calculateFunctionPoints();
    }

    /**
     * Sets the text inputs for each value field and
     * toggles each radiobutton corresponding to underlying data.
     */
    private void setDefaultInputs() {
        extInp.setText(String.valueOf(data.extInputs));
        extOut.setText(String.valueOf(data.extOutputs));
        extInq.setText(String.valueOf(data.extInquiries));
        intFiles.setText(String.valueOf(data.intLogicFiles));
        extFiles.setText(String.valueOf(data.extIntFiles));
        vafSum.setText(String.valueOf(data.getValueFactorSum()));
        setToggle( data.wfExtInputs, externalInputs);
        setToggle( data.wfExtOutputs, externalOutputs);
        setToggle( data.wfExtInquiries, externalInquiries);
        setToggle(data.wfIntLogicFiles, internalLogicalFiles);
        setToggle( data.wfExtIntFiles, externalLogicalFiles);
    }

    /**
     * Sets complexity toggles to corresponding data values.
     * @param realValue     Underlying factor value in data
     * @param group         ToggleGroup for complexity factor
     */
    private void setToggle(int realValue, ToggleGroup group) {
        int defaultValue = getRadioButtonValue(group);
        if (defaultValue > realValue) {
            group.selectToggle(group.getToggles().get(2));
        } else if (defaultValue < realValue) {
            group.selectToggle(group.getToggles().get(1));
        }
    }

    /**
     * Initializes FPTab window, sets onAction events for each input field and grabs
     * values from source data.
     * @param url       None
     * @param rb        None
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {

        //for creating new project
        if(Context.getInstance().menuTab()){
            System.out.println("creating new tabs from menu");
             index = Context.getInstance().createNewData();
             data = Context.getInstance().getProjectObject().projData.get(index);
             
        }else{
            System.out.println("tabs from open ");
            data = Context.getInstance().getProjectObject().projData.get(Context.getInstance().incr());
            //for vaf to get the correct ref
            index = Context.getInstance().returnCounter();

           // externalInputs.selectedToggleProperty().

        }
            
        
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
        data.vafSumProperty().addListener((observable, oldValue, newValue) -> {
            vafSum.setText(String.valueOf(newValue));
            Context.getInstance().setSaved(false);
        });
        data.languageProperty().addListener((observable, oldValue, newValue) -> {
            language.setText(newValue);
            Context.getInstance().setSaved(false);
        });
        setDefaultValues();

        calculateFunctionPoints();
    }

    /**
     * Initializes the tab with pre-computed data.
     * @param loadData  ProjectData to load into tab
     */
    public void initProjectData(ProjectData loadData) {
        Context.getInstance().getProjectObject().setProjectData(index, loadData);
        data = loadData;
        setDefaultValues();
        setDefaultInputs();
    }
    
    public int getIndex(){
        return index;
    }

   
}

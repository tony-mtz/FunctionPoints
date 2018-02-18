package metricssuite;

import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;
import javafx.scene.control.Slider;
import utils.ProjectData;

public class VAFController implements Initializable {
    private int index;
    private List items = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4, 5));
    private ProjectData data;
    @FXML
    private Button cancel;
    @FXML
    private Button done;
    @FXML
    private void close() {
        Stage stage = (Stage) cancel.getScene().getWindow();
        stage.close();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        comboBoxes.add(comboZero);
        comboBoxes.add(comboOne);
        comboBoxes.add(comboTwo);
        comboBoxes.add(comboThree);
        comboBoxes.add(comboFour);
        comboBoxes.add(comboFive);
        comboBoxes.add(comboSix);
        comboBoxes.add(comboSeven);
        comboBoxes.add(comboEight);
        comboBoxes.add(comboNine);
        comboBoxes.add(comboTen);
        comboBoxes.add(comboEleven);
        comboBoxes.add(comboTwelve);
        comboBoxes.add(comboThirteen);
    }

    //del
    @FXML ComboBox comboZero;
    @FXML ComboBox comboOne;
    @FXML ComboBox comboTwo;
    @FXML ComboBox comboThree;
    @FXML ComboBox comboFour;
    @FXML ComboBox comboFive;
    @FXML ComboBox comboSix;
    @FXML ComboBox comboSeven;
    @FXML ComboBox comboEight;
    @FXML ComboBox comboNine;
    @FXML ComboBox comboTen;
    @FXML ComboBox comboEleven;
    @FXML ComboBox comboTwelve;
    @FXML ComboBox comboThirteen;
    private ArrayList<ComboBox> comboBoxes = new ArrayList<>();
    @FXML
    private void submit(){
        for(int i = 0; i < comboBoxes.size(); i++) {
            data.setValueFactorAtIndex(i, (int) comboBoxes.get(i).getValue());
        }
        data.setVafSum();
        Stage stage = (Stage) done.getScene().getWindow();
        stage.close();
    }
    public void initIndex(Integer index) {
        this.index = index;
        data = Context.getInstance().getProjectObject().projData.get(index);
    }

    public void initComboBoxes() {
        for (int i=0; i<comboBoxes.size(); i++) {
            ComboBox box = comboBoxes.get(i);
            box.setItems(FXCollections.observableArrayList(items));
            box.setValue(data.getValueFactorAtIndex(i));
        }
    }
}

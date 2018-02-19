package metricssuite;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.stage.Stage;
import utils.ProjectData;

import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;

public class VAFController implements Initializable {
    @FXML private ComboBox<Integer> comboZero;
    @FXML private ComboBox<Integer> comboOne;
    @FXML private ComboBox<Integer> comboTwo;
    @FXML private ComboBox<Integer> comboThree;
    @FXML private ComboBox<Integer> comboFour;
    @FXML private ComboBox<Integer> comboFive;
    @FXML private ComboBox<Integer> comboSix;
    @FXML private ComboBox<Integer> comboSeven;
    @FXML private ComboBox<Integer> comboEight;
    @FXML private ComboBox<Integer> comboNine;
    @FXML private ComboBox<Integer> comboTen;
    @FXML private ComboBox<Integer> comboEleven;
    @FXML private ComboBox<Integer> comboTwelve;
    @FXML private ComboBox<Integer> comboThirteen;

    @FXML private Button cancel;
    @FXML private Button done;

    private List<Integer> items = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4, 5));
    private ArrayList<ComboBox<Integer>> comboBoxes = new ArrayList<>();
    private ProjectData data;
    private int index;

    @FXML
    private void close() {
        Stage stage = (Stage) cancel.getScene().getWindow();
        stage.close();
    }

    /**
     * Saves current value factor selections in underlying data and closes window.
     */
    @FXML
    private void submit(){
        for(int i = 0; i < comboBoxes.size(); i++) {
            data.setValueFactorAtIndex(i, comboBoxes.get(i).getValue());
        }
        data.setVafSum();
        Stage stage = (Stage) done.getScene().getWindow();
        stage.close();
    }

    /**
     * Initializes view and puts each ComboBox in the comboBoxes list.
     * @param url       None
     * @param rb        None
     */
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

    /**
     * Initializes window with ProjectData object.
     * @param index     Index of ProjectData in projData list.
     */
    public void initIndex(Integer index) {
        this.index = index;
        data = Context.getInstance().getProjectObject().projData.get(index);
    }

    /**
     * Initializes each ComboBox with underlying values and sets selections
     * to 0-5.
     */
    public void initComboBoxes() {
        for (int i=0; i<comboBoxes.size(); i++) {
            ComboBox box = comboBoxes.get(i);
            box.setItems(FXCollections.observableArrayList(items));
            box.setValue(data.getValueFactorAtIndex(i));
        }
    }
}

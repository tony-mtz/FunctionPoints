package metricssuite;

import javafx.beans.Observable;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.scene.control.Slider;

public class VAFController implements Initializable {
    private int index;
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
        sliders.add(slider0);
        sliders.add(slider1);
        sliders.add(slider2);
        sliders.add(slider3);
        sliders.add(slider4);
        sliders.add(slider5);
        sliders.add(slider6);
        sliders.add(slider7);
        sliders.add(slider8);
        sliders.add(slider9);
        sliders.add(slider10);
        sliders.add(slider11);
        sliders.add(slider12);
        sliders.add(slider13);
    }

    //del
    @FXML Slider slider0;
    @FXML Slider slider1;
    @FXML Slider slider2;
    @FXML Slider slider3;
    @FXML Slider slider4;
    @FXML Slider slider5;
    @FXML Slider slider6;
    @FXML Slider slider7;
    @FXML Slider slider8;
    @FXML Slider slider9;
    @FXML Slider slider10;
    @FXML Slider slider11;
    @FXML Slider slider12;
    @FXML Slider slider13;
    private ArrayList<Slider> sliders = new ArrayList<Slider>();
    @FXML
    private void submit(){
        for(int i = 0; i < sliders.size(); i++) {
            System.out.println(sliders.get(i).getValue());
        }
        Stage stage = (Stage) done.getScene().getWindow();
        System.out.println("VAF INDEX " + index);
        stage.close();
    }
    public void initData(Integer index) {
        this.index = index;
    }
}

package metricssuite;

import javafx.beans.Observable;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.scene.control.Slider;

public class VAFController implements Initializable {

    @FXML
    private Button cancel;
    private Button done;
    @FXML
    private void close() {
        Stage stage = (Stage) cancel.getScene().getWindow();
        stage.close();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }
    
    //del
    @FXML Slider slider1;
    @FXML
    private void submit(){
        System.out.println(slider1.getValue());
        Stage stage = (Stage) cancel.getScene().getWindow();
        stage.close();
    }
}

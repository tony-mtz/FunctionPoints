package metricssuite;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import javax.swing.table.TableColumn;
import javax.swing.text.TableView;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class FPTabController implements Initializable{

    @FXML
    void popup(Event event) throws IOException {
        VBox vbox = FXMLLoader.load(getClass().getResource("LanguageWindow.fxml"));

        Stage stage = new Stage();
        Scene scene = new Scene(vbox);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void vafPopup(Event event) throws IOException {
        AnchorPane vbox = FXMLLoader.load(getClass().getResource("VAFWindow.fxml"));

        Stage stage = new Stage();
        Scene scene = new Scene(vbox);
        stage.setScene(scene);
        stage.show();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {




    }
}

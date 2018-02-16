package metricssuite;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import javax.swing.table.TableColumn;
import javax.swing.text.TableView;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.scene.control.TextField;

public class FPTabController implements Initializable{
   @FXML private TextField extInp;
   @FXML private TextField extOut;
   @FXML private TextField extInq;
   @FXML private TextField intFiles;
   @FXML private TextField extFiles;
   public int index;

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
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("VAFWindow.fxml"));
        Stage stage = new Stage();
        stage.setScene(new Scene(fxmlLoader.load()));
        VAFController controller = fxmlLoader.getController();
        controller.initData(index);
        stage.show();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        index = Context.getInstance().createNewData();
        System.out.println(index);
    }

   
}

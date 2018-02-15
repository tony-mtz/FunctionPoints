package metricssuite;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import utils.ValueFactor;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.ResourceBundle;

public class VAFController implements Initializable {

    @FXML
    private TableColumn<ValueFactor, String> descCol;
    @FXML
    private TableColumn<ValueFactor, Integer> ratingCol;
    @FXML
    private TableView table;
    private final ObservableList<ValueFactor> data =
            FXCollections.observableArrayList(
                    new ValueFactor("test", 1),
                    new ValueFactor("t2", 5)
            );

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        descCol.setCellValueFactory(new PropertyValueFactory<>("desc"));
        ratingCol.setCellValueFactory(new PropertyValueFactory<>("value"));
        table.setItems(data);
    }
}

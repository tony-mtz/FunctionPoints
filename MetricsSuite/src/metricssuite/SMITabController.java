package metricssuite;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.util.Callback;
import javafx.util.converter.IntegerStringConverter;
import utils.SMI;

import java.net.URL;
import java.util.ResourceBundle;

public class SMITabController implements Initializable{
    @FXML TableView table;
    @FXML private TableColumn SMICol;
    @FXML private TableColumn AddCol;
    @FXML private TableColumn ChangeCol;
    @FXML private TableColumn DelCol;
    @FXML private TableColumn TotalCol;
    @FXML private Button add;

    SMI s1 = new SMI(3, 0, 0, 0);
    SMI s2 = new SMI(10, 1, 0, 3);
    SMI s3 = new SMI(1, 1, 1, 13);
    ObservableList<SMI> list = FXCollections.observableArrayList();

    @FXML
    private void computeSMI () {

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        list.addAll(s1, s2, s3);
        AddCol.setCellValueFactory(new PropertyValueFactory<SMI, Integer>("modulesAdded"));
        AddCol.setCellFactory(TextFieldTableCell.<SMI, Integer>forTableColumn(new IntegerStringConverter()));
        AddCol.setOnEditCommit((EventHandler<TableColumn.CellEditEvent<SMI, Integer>>) event -> event.getTableView().
                getItems().get(event.getTablePosition().getRow()).setModulesAdded(event.getNewValue()));
        ChangeCol.setCellValueFactory(new PropertyValueFactory<SMI, Integer>("modulesChanged"));
        ChangeCol.setCellFactory(TextFieldTableCell.<SMI, Integer>forTableColumn(new IntegerStringConverter()));
        ChangeCol.setOnEditCommit((EventHandler<TableColumn.CellEditEvent<SMI, Integer>>) event -> event.getTableView().
                getItems().get(event.getTablePosition().getRow()).setModulesChanged(event.getNewValue()));
        DelCol.setCellValueFactory(new PropertyValueFactory<SMI, Integer>("modulesDeleted"));
        DelCol.setCellFactory(TextFieldTableCell.<SMI, Integer>forTableColumn(new IntegerStringConverter()));
        DelCol.setOnEditCommit((EventHandler<TableColumn.CellEditEvent<SMI, Integer>>) event -> event.getTableView().
                getItems().get(event.getTablePosition().getRow()).setModulesDeleted(event.getNewValue()));
        TotalCol.setCellValueFactory(new PropertyValueFactory<SMI, Double>("total"));
        TotalCol.setCellFactory(new Callback<TableColumn<SMI, Double>, TableCell<SMI, Double>>() {
            @Override
            public TableCell call(TableColumn<SMI, Double> param) {
                return new TableCell<SMI, Double>() {
                    @Override
                    protected void updateItem(Double item, boolean empty) {
                        super.updateItem(item, empty);
                        if (item == null || empty) {
                            setText(null);
                            setStyle("");
                        } else setText(String.valueOf(item.intValue()));
                    }
                };
            }
        });
        SMICol.setCellValueFactory(new PropertyValueFactory<SMI, Double>("SMI"));
        table.setItems(list);
        table.setEditable(true);
        add.setOnAction(event -> {
            double total = list.get(list.size() - 1).getTotal();
            list.add(new SMI(total));
        });
    }
}

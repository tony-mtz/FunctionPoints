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

    private ObservableList<SMI> list;

    @FXML
    private void computeSMI () {
        SMICol.setCellValueFactory(new PropertyValueFactory<SMI, Double>("SMI"));
        table.refresh();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        list = Context.getInstance().getProjectObject().softMaturityIndex;
        for (SMI smi:list) {
            smi.setBindings();
        }
        AddCol.setCellValueFactory(new PropertyValueFactory<SMI, Integer>("modulesAdded"));
        AddCol.setCellFactory(TextFieldTableCell.<SMI, Integer>forTableColumn(new IntegerStringConverter()));
        AddCol.setOnEditCommit((EventHandler<TableColumn.CellEditEvent<SMI, Integer>>) event -> {
            int position = event.getTablePosition().getRow();
            event.getTableView().getItems().get(position).setModulesAdded(event.getNewValue());
            for (int i = position + 1; i < event.getTableView().getItems().size(); i++) {
                event.getTableView().getItems().get(i).setPreviousTotal(
                        event.getTableView().getItems().get(i - 1).getTotal());
            }
            Context.getInstance().setSaved(false);
        });
        ChangeCol.setCellValueFactory(new PropertyValueFactory<SMI, Integer>("modulesChanged"));
        ChangeCol.setCellFactory(TextFieldTableCell.<SMI, Integer>forTableColumn(new IntegerStringConverter()));
        ChangeCol.setOnEditCommit((EventHandler<TableColumn.CellEditEvent<SMI, Integer>>) event -> {
            int position = event.getTablePosition().getRow();
            event.getTableView().getItems().get(position).setModulesChanged(event.getNewValue());
            Context.getInstance().setSaved(false);
        });
        DelCol.setCellValueFactory(new PropertyValueFactory<SMI, Integer>("modulesDeleted"));
        DelCol.setCellFactory(TextFieldTableCell.<SMI, Integer>forTableColumn(new IntegerStringConverter()));
        DelCol.setOnEditCommit((EventHandler<TableColumn.CellEditEvent<SMI, Integer>>) event -> {
            int position = event.getTablePosition().getRow();
            event.getTableView().getItems().get(position).setModulesDeleted(event.getNewValue());
            for (int i = position + 1; i < event.getTableView().getItems().size(); i++) {
                event.getTableView().getItems().get(i).setPreviousTotal(
                        event.getTableView().getItems().get(i - 1).getTotal());
            }
            Context.getInstance().setSaved(false);
        });
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
        table.setItems(list);
        table.setEditable(true);
        add.setOnAction(event -> {
            double total = 0;
            if (list.size() > 0) {
                total = list.get(list.size() - 1).getTotal();
            }
            list.add(new SMI(total));
            Context.getInstance().setSaved(false);
        });
    }
}

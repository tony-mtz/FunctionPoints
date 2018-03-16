package metricssuite;

import javafx.collections.ObservableList;
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

public class SMITabController implements Initializable {
    @FXML
    TableView<SMI> table;
    @FXML
    private TableColumn<SMI, Double> SMICol;
    @FXML
    private TableColumn<SMI, Integer> AddCol;
    @FXML
    private TableColumn<SMI, Integer> ChangeCol;
    @FXML
    private TableColumn<SMI, Integer> DelCol;
    @FXML
    private TableColumn<SMI, Double> TotalCol;
    @FXML
    private Button add;

    private ObservableList<SMI> list;

    @FXML
    private void computeSMI() {
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        list = Context.getInstance().getProjectObject().softMaturityIndex;
        for (SMI smi : list) {
            smi.setBindings();
        }
        AddCol.setCellValueFactory(new PropertyValueFactory<>("modulesAdded"));
        AddCol.setCellFactory(TextFieldTableCell.forTableColumn(new IntegerStringConverter()));
        AddCol.setOnEditCommit(event -> {
            int position = event.getTablePosition().getRow();
            event.getTableView().getItems().get(position).setModulesAdded(event.getNewValue());
            for (int i = position + 1; i < event.getTableView().getItems().size(); i++) {
                event.getTableView().getItems().get(i).setPreviousTotal(
                        event.getTableView().getItems().get(i - 1).getTotal());
            }
            Context.getInstance().setSaved(false);
        });
        ChangeCol.setCellValueFactory(new PropertyValueFactory<>("modulesChanged"));
        ChangeCol.setCellFactory(TextFieldTableCell.forTableColumn(new IntegerStringConverter()));
        ChangeCol.setOnEditCommit(event -> {
            int position = event.getTablePosition().getRow();
            event.getTableView().getItems().get(position).setModulesChanged(event.getNewValue());
            Context.getInstance().setSaved(false);
        });
        DelCol.setCellValueFactory(new PropertyValueFactory<>("modulesDeleted"));
        DelCol.setCellFactory(TextFieldTableCell.forTableColumn(new IntegerStringConverter()));
        DelCol.setOnEditCommit(event -> {
            int position = event.getTablePosition().getRow();
            event.getTableView().getItems().get(position).setModulesDeleted(event.getNewValue());
            for (int i = position + 1; i < event.getTableView().getItems().size(); i++) {
                event.getTableView().getItems().get(i).setPreviousTotal(
                        event.getTableView().getItems().get(i - 1).getTotal());
            }
            Context.getInstance().setSaved(false);
        });
        TotalCol.setCellValueFactory(new PropertyValueFactory<>("total"));
        TotalCol.setCellFactory(new Callback<>() {
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
        SMICol.setCellValueFactory(new PropertyValueFactory<>("SMI"));
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

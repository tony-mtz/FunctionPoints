package utils;

import javafx.scene.control.ContextMenu;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.control.TreeCell;
import metricssuite.Controller;

public class TextFieldTreeCellImpl extends TreeCell<String> {
    private ContextMenu menu = new ContextMenu();

    public TextFieldTreeCellImpl(Controller controller) {
        MenuItem openMenuItem = new MenuItem("Open");
        menu.getItems().add(openMenuItem);
        openMenuItem.setOnAction(e -> controller.openTab(getText()));
        MenuItem closeMenuItem = new MenuItem("Close");
        menu.getItems().add(closeMenuItem);
        closeMenuItem.setOnAction(e -> controller.closeOpenTab(getText()));
        menu.getItems().add(new SeparatorMenuItem());
        MenuItem deleteMenuItem = new MenuItem("Delete");
        menu.getItems().add(deleteMenuItem);
        deleteMenuItem.setOnAction(e -> {
            if (controller.deleteTab(getText()))
                getTreeItem().getParent().getChildren().remove(getTreeItem());
        });
    }

    @Override
    public void updateItem(String item, boolean empty) {
        super.updateItem(item, empty);

        if (empty) {
            setText(null);
            setGraphic(null);
        } else {
            setText(getItem() == null ? "" : getItem());
            setGraphic(getTreeItem().getGraphic());
            setContextMenu(menu);
        }
    }
}

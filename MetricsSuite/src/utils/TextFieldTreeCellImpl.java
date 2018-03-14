package utils;

import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.control.*;

public class TextFieldTreeCellImpl extends TreeCell<String> {
    private ContextMenu menu = new ContextMenu();

    public TextFieldTreeCellImpl() {
        MenuItem openMenuItem = new MenuItem("Open");
        menu.getItems().add(openMenuItem);
        MenuItem closeMenuItem = new MenuItem("Close");
        menu.getItems().add(closeMenuItem);
        menu.getItems().add(new SeparatorMenuItem());
        MenuItem deleteMenuItem = new MenuItem("Delete");
        menu.getItems().add(deleteMenuItem);
    }

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

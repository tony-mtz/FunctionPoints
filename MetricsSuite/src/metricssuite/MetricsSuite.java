/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metricssuite;

import java.io.IOException;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;
import org.antlr.runtime.RecognitionException;


/**
 * @author tonyd
 */
public class MetricsSuite extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("MainWindow.fxml"));
        GridPane grid = loader.load();
        Scene scene = new Scene(grid);
        Controller controller = loader.getController();
        primaryStage.setScene(scene);
        primaryStage.setTitle(Context.getInstance().getMenuBarName());
        primaryStage.show();
        scene.getWindow().setOnCloseRequest(ev -> {
            if (!controller.shutdown()) {
                ev.consume();
            }
        });
    }

    public static void main(String[] args) {
        launch(args);
    }

}

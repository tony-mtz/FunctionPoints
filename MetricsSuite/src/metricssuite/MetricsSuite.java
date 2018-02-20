/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metricssuite;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;



/**
 *
 * @author tonyd
 */
public class MetricsSuite extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        GridPane grid = FXMLLoader.load(getClass().getResource("MainWindow.fxml"));        
        Scene scene = new Scene(grid);
        primaryStage.setScene(scene);
        primaryStage.setTitle(Context.getInstance().getMenuBarName());
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}

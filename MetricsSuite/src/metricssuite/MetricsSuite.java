/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metricssuite;

import com.google.gson.Gson;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import javafx.application.Application;
import static javafx.application.Application.launch;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import utils.ProjectData;
import utils.ProjectObject;



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

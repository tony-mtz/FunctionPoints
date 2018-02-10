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
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import utils.ProjectData;



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
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
        
        
        //test file save and read
        String projName = "project1";
        
        ProjectData data = new ProjectData();
        //bind to UI input boxes and radio buttons
        data.extInputs = 10;
        data.extOutputs = 10;
        data.extInquiries = 10;
        data.intLogicFiles = 2;
        data.extIntFiles = 0;
        
        data.wfExtInputs = 3;
        data.wfExtOutputs = 3;
        data.wfExtInquiries = 3;
        data.wfIntLogicFiles = 3;
        data.wfExtIntFiles = 3; 
        
        data.language = "C++";
        data.vaf.qestion1 = 5;
        data.vaf.qestion11 =3;
        //ect...default vaf value to 0
        
        //save data to file
        Gson gson = new Gson();
        String dataString = gson.toJson(data, ProjectData.class );        
        try{
                File file = new File(projName +".ms");
                Writer writer = new BufferedWriter(new FileWriter(file));
                writer.write(dataString);
                writer.flush();            
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
        
        //read data from file
        //will read data to UI
        ProjectData outD;
        try {
            outD = gson.fromJson(new FileReader(projName + ".ms"), ProjectData.class);
            System.out.println(outD.language);
            System.out.println(outD.extInputs);
            System.out.println(outD.vaf.qestion1);
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        
        
    }
    
}

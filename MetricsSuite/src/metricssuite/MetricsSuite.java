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
import utils.ProjectObject;



/**
 *
 * @author tonyd
 */
public class MetricsSuite extends Application {
    
    public String title = "CECS 543 Metrics Suite";
    @Override
    public void start(Stage primaryStage) throws Exception {
        
        
        GridPane grid = FXMLLoader.load(getClass().getResource("MainWindow.fxml"));
        
        Scene scene = new Scene(grid);
        primaryStage.setScene(scene);
        //primaryStage.setTitle(title);
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
        
        /**
        *demo save and read for data needed in the Function Points tab
        *You need to use gson-2.8.2.jar, place it in your Libraries folder
        * 
        //test file save and read
        
        ProjectObject proj1= new ProjectObject("Proj1");
        
        String projName = "project1";
        
        //each new window
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
        
        //add to main proj
        proj1.projData.add(data);
        
        //save data to file
        Gson gson = new Gson();
        String dataString = gson.toJson(proj1, ProjectObject.class );        
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
        ProjectObject outD;
        try {
            outD = gson.fromJson(new FileReader(projName + ".ms"), ProjectObject.class);
            System.out.println(outD.language);
            System.out.println(outD.projData.get(0).language);
            System.out.println(outD.projData.get(0).vaf.qestion1);
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        
        */
    }
    
}

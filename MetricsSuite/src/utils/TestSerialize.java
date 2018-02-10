/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import com.google.gson.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
/**
 *
 * @author tony
 */
public class TestSerialize {
    public static void main(String[] args){
        
        //the user will name the new project in the new project window
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

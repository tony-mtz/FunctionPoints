/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.util.ArrayList;

/**
 *
 * @author tonyd
 */
public class ProjectObject {
    
    
    public String projectName;
    public String productName;
    public String creator;
    public String language; 
    public ArrayList <ProjectData> projData;
    
    public ProjectObject(String projectName, String productName, String creator){
          this.projectName = projectName;
          this.productName = productName;
          this.creator = creator;
          language = "Java";
          projData = new ArrayList<>();
          
    }
    
    public ProjectObject(){
          
          language = "Java";
          projData = new ArrayList<>();
          
    }
    
}

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
    public String language; 
    public ArrayList <ProjectData> projData;
    
    public ProjectObject(String projectName){
          this.projectName = projectName;
          language = "Java";
          projData = new ArrayList<>();
          
    }
    
}

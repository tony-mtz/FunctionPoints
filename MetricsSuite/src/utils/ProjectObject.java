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
    public String comments;

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }
    
    public void setComments(String comments){
        this.comments = comments;
        
    }
    public ArrayList <ProjectData> projData;
    
    public ProjectObject(String projectName, String productName, String creator){
          this.projectName = projectName;
          this.productName = productName;
          this.creator = creator;
          language = "Java";
          ProjectData data = new ProjectData();
          projData = new ArrayList<>();
          //do this at tab creation instead
          //projData.add(data);
    }
    
    public ProjectObject(){
          language = "Java";
          projData = new ArrayList<>();

    }

    public int createNewData() {
        ProjectData data = new ProjectData();
        projData.add(data);
        System.out.println("Length: " + projData.size());
        return projData.indexOf(data);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import metricssuite.Context;

import java.util.ArrayList;

/**
 *
 * @author tonyd
 */
public class ProjectObject {
    
    
    public String projectName;
    public String productName;
    public String creator;

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    private String language;
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
    public ObservableList<SMI> softMaturityIndex;
    public ArrayList <ProjectCode> projCode;

    public ProjectObject(String projectName, String productName, String creator){
          this.projectName = projectName;
          this.productName = productName;
          this.creator = creator;
          language = "None";
          projData = new ArrayList<>();
          softMaturityIndex = FXCollections.observableArrayList();
          projCode = new ArrayList<>();
    }
    
    public ProjectObject(){
        language = "None";
        projData = new ArrayList<>();
        softMaturityIndex = FXCollections.observableArrayList();
        projCode = new ArrayList<>();

    }

    public ProjectData createNewData(String name) {
        ProjectData data = new ProjectData(name);
        data.setLanguage(this.language);
        projData.add(data);
        System.out.println("Length: " + projData.size());
        Context.getInstance().setSaved(false);
        return data;
    }

    public ProjectData getDataByName(String name) {
        for (ProjectData data : projData) {
            if (data.getName().equals(name)) {
                return data;
            }
        }
        return null;
    }

    public void removeDataByName(String name) {
        ProjectData removeData = null;
        for (ProjectData data : projData) {
            if (data.getName().equals(name)) {
                removeData = data;
            }
        }
        if (removeData != null)
            projData.remove(removeData);
    }
}

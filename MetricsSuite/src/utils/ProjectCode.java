/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.util.ArrayList;
import java.util.Objects;

/**
 * @author tony
 */
public class ProjectCode {
    private String path;
    private String name;

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ProjectCode(String path, String name) {
        this.path = path;
        this.name = name;
    }


    public boolean equals(String n) {
        if (this.name.equalsIgnoreCase(n)) {
            return true;
        }
        return false;
    }


}

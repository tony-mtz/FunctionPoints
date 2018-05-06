/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metricssuite;

import com.sun.javafx.scene.control.skin.VirtualFlow;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author tony
 */
public class IterFourUtil {
    
    
    public String inheritanceDepth(){
        
        String depthString = "";
//        for (HashMap.Entry<String, String> entry : JavaMetrics.inheritanceTree.entrySet()) { 
//            temp +="Class = " + entry.getKey() + ", Value = " + entry.getValue() +"\n";
//        }       
        
        List<String> list = new ArrayList<>();
        for (HashMap.Entry<String, String> entry : JavaMetrics.inheritanceTree.entrySet()) { 
            //temp +="Class = " + entry.getKey() + ", Value = " + entry.getValue() +"\n";
            list.add(entry.getKey());
        }
        
        for(String key: list){
            int depth =1;
            depthString +="Class: "+key + " ";
            int errorCount =0;
            boolean p = true;
            while(p){             
                if(JavaMetrics.inheritanceTree.get(key) ==null){
                    depthString += "depth: " + depth + "\n";
                    p=false;
                }else{
                    key = JavaMetrics.inheritanceTree.get(key);
                    depth++;
                }
                errorCount++;
                if(errorCount > 1000){
                    System.out.println("a class was not in the list but is in the inheritance tree.");
                    p = false;
                }
            }
        }
        return depthString;
    }
    
}

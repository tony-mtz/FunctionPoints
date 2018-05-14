/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metricssuite;

import java.io.IOException;
import java.util.*;

import java.io.IOException;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;

/**
 *
 * @author tony
 */
public class JavaMetrics {
    static Set<String> uniqueKeywords = new LinkedHashSet<String>();
    static Set<String> uniqueIdentifiers= new LinkedHashSet<String>();    
    static Set<String> uniqueConstants = new LinkedHashSet<String>();
    static Set<String> uniqueSpecial = new LinkedHashSet<String>();
    
    static Set<String> mccabeValues = new LinkedHashSet<String>();
    
    static Set<String> methodNames = new LinkedHashSet<String>();
    
    //number of children
    static LinkedHashMap<String, Integer> classNames = new LinkedHashMap<String, Integer>();
    //depth of inheritance tree
    static HashMap<String, String> inheritanceTree = new HashMap<>();
    static HashMap<String, HashSet<String>> couplingBetweenClasses = new HashMap<>();
    static HashMap<String, HashSet<String>> lackOfCohesion = new HashMap<>();
    
    public static void reset(){
        uniqueKeywords.clear();
        uniqueIdentifiers.clear();
        uniqueConstants.clear();
        uniqueSpecial.clear();
        mccabeValues.clear();
        
        methodNames.clear();
        lackOfCohesion.clear();
    }
    
    public static void resetAll(){
        reset();
        classNames.clear();
    }
   
    
}

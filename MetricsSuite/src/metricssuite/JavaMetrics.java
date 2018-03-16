/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metricssuite;

import com.sun.java_cup.internal.runtime.Symbol;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.Set;
//import jdk.nashorn.internal.ir.Symbol;


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
    
    static Set<Symbol> uIDSym=new LinkedHashSet<Symbol>();
    
    static Set<String> uniqueConstants = new LinkedHashSet<String>();
    static Set<String> uniqueSpecial = new LinkedHashSet<String>();
    
    static Set<String> mccabeValues = new LinkedHashSet<String>();
    
    public static void reset(){
        uniqueKeywords.clear();
        uniqueIdentifiers.clear();
        uIDSym.clear();
        uniqueConstants.clear();
        uniqueSpecial.clear();
        mccabeValues.clear();
    }
   
    
}

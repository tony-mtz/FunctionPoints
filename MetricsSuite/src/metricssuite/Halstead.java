/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metricssuite;

import java.io.IOException;
import java.util.HashMap;
import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;

/**
 *
 * @author tony
 */
public class Halstead {
    
    
    private int whiteSpace = 0;
    private int commentSpaceBytes = 0;
    //percent calculated in controller since it has file size
    private int uniqueOperators = 0;
    private int uniqueOperands = 0;
    private int totalOperators = 0;
    private int totalOperands = 0;    
    private int progLength =0;
    private int vocabulary =0;
    private double volume = 0;
    private double difficulty =0;
    private double effort = 0;
    private double time =0;
    private double timeMin = 0;
    private double timeHour = 0;
    private double personMonths = 0;
    private double bugsExpected =0;
    private String mc = "";
   
    
    private int methodCount =0;

    public String getMc() {
        return mc;
    }

    public double getTimeMin() {
        return timeMin;
    }

    public double getTimeHour() {
        return timeHour;
    }

    public double getPersonMonths() {
        return personMonths;
    }    
    
    public int getTotalOperators() {
        return totalOperators;
    }

    public int getTotalOperands() {
        return totalOperands;
    }

    public int getWhiteSpace() {
        return whiteSpace;
    }

    public int getCommentSpaceBytes() {
        return commentSpaceBytes;
    }

    public int getUniqueOperators() {
        return uniqueOperators;
    }

    public int getUniqueOperands() {
        return uniqueOperands;
    }

    public int getProgLength() {
        return progLength;
    }

    public int getVocabulary() {
        return vocabulary;
    }

    public double getVolume() {
        return volume;
    }

    public double getDifficulty() {
        return difficulty;
    }

    public double getEffort() {
        return effort;
    }

    public double getTime() {
        return time;
    }

    public double getBugsExpected() {
        return bugsExpected;
    }
    
    public int getMethodCount(){        
        return methodCount;
    }
    
    private String children = "";
    public String getChildren(){
        return children;
    }
    public void parse(String name) throws IOException, RecognitionException{
        
        
        JavaJavaLexer lexer = new JavaJavaLexer(new ANTLRFileStream(name, "UTF-8"));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JavaJavaParser parser = new JavaJavaParser(tokens);
        parser.compilationUnit();
        
        
        //=====================================
        whiteSpace = lexer.ws;
        commentSpaceBytes = lexer.commentcount; //divided by something depending on some length? 
        uniqueOperators = JavaMetrics.uniqueKeywords.size() + JavaMetrics.uniqueSpecial.size();
        uniqueOperands = JavaMetrics.uniqueConstants.size() + JavaMetrics.uniqueIdentifiers.size();
        totalOperators = parser.keywordCount + parser.specialcount;
        totalOperands = parser.identcount + lexer.constantcount;
        progLength = totalOperands + totalOperators;
        vocabulary = uniqueOperands + uniqueOperators;
        volume = progLength * (Math.log((double)vocabulary)/Math.log(2));
        difficulty = ((double)uniqueOperators/2) * ( (double)totalOperands/uniqueOperands);
        effort = difficulty * volume;
        time = effort/18;
        timeMin = time/60;
        timeHour = timeMin/60;
        personMonths = timeHour/140;
        bugsExpected = volume/3000;
        for(String s: JavaMetrics.mccabeValues){
            mc += "   " + s + "\n";
        }
        
       
        
        for (HashMap.Entry<String, Integer> entry : JavaMetrics.classNames.entrySet()) { 
            children +="Class Name: " + entry.getKey() + ", Children: " + entry.getValue() +"\n";
        }
        
//        String temp = "";
//        for (HashMap.Entry<String, String> entry : JavaMetrics.inheritanceTree.entrySet()) { 
//            temp +="Class = " + entry.getKey() + ", Value = " + entry.getValue() +"\n";
//        }
//        System.out.println(temp);
//        
        
        methodCount = JavaMetrics.methodNames.size();
        
        
//        System.out.println("MC Matrics........" + JavaMetrics.mccabeValues.toString());

//        String out ="";
//        //get bytes of all comments
//        //traverse tokens
//        for (int index = 0; index < tokens.size(); index++){
//            String l = tokens.toString(index, index);
//            if(l.contains("//") || l.contains("/*"))
//            out +=l;
//            //System.out.println(l);
//        }
        //System.out.println(out);
        //commentSpaceBytes = out.getBytes().length;   
        
    }
   
    
    
    
}

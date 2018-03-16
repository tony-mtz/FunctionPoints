/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metricssuite;

import java.io.IOException;
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
    private String mc = "";

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
    private double bugsExpected =0;
    
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
        totalOperands = parser.identcount;
        progLength = totalOperands + totalOperators;
        vocabulary = uniqueOperands + uniqueOperators;
        volume = progLength * (Math.log(vocabulary)/Math.log(2));
        difficulty = (uniqueOperators/2) * ( totalOperands/uniqueOperands);
        effort = difficulty * volume;
        time = effort/18;
        timeMin = time/60;
        timeHour = timeMin/60;
        //personMonths = ?
        bugsExpected = volume/3000;
        for(String s: JavaMetrics.mccabeValues){
            mc += "   " + s + "\n";
        }
        
    }
    
    
    
}

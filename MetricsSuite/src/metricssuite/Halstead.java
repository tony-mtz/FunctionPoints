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
    
    public void par(String name) throws IOException, RecognitionException{
        JavaJavaLexer lexer = new JavaJavaLexer(new ANTLRFileStream(name, "UTF-8"));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JavaJavaParser parser = new JavaJavaParser(tokens);
        parser.compilationUnit();
        
        
        System.out.println("uniqKeywords: " + JavaMetrics.uniqueKeywords);
        System.out.println("uniqIden: " + JavaMetrics.uniqueIdentifiers);
        System.out.println("uniquiDSym: " + JavaMetrics.uIDSym);
        System.out.println("uniqSpecial: " + JavaMetrics.uniqueSpecial);
        System.out.println("uniqMccabeV: " + JavaMetrics.mccabeValues);
        System.out.println("uniqConst: " + JavaMetrics.uniqueConstants);
        System.out.println("constant " + lexer.constantcount);
        System.out.println("keywds " + parser.keywordCount);
        System.out.println("specials " + parser.specialcount);
        System.out.println("ident c : " + parser.identcount);
        
        
        //=====================================
        lexer.ws = whiteSpace;
        lexer.commentcount = 0;
        uniqueOperators = JavaMetrics.uniqueKeywords.size() + JavaMetrics.uniqueSpecial.size();
        uniqueOperands = JavaMetrics.uniqueConstants.size() + JavaMetrics.uniqueIdentifiers.size();
        totalOperators = parser.keywordCount + parser.specialcount;
        totalOperands = parser.identcount;
        progLength = totalOperands + totalOperators;
        vocabulary = uniqueOperands + uniqueOperators;
      //  volume = progLength * math.logbase2(vocabulary);
        
        
        
//        parser
//        
//    private int commentSpaceBytes = 0;
//    //percent calculated in controller since it has file size
//    private int uniqueOperators = 0;
//    private int uniqueOperands = 0;
//    private int progLength =0;
//    private int vocabulary =0;
//    private double volume = 0;
//    private double difficulty =0;
//    private double effort = 0;
//    private double time =0;
//    private double bugsExpected =0;
        
        
    }
    
    
    
}

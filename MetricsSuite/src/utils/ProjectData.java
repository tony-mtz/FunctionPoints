/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;


import javafx.beans.binding.Bindings;
import javafx.beans.value.ObservableValue;

/**
 *
 * @author tony
 */
public class ProjectData {
    
    public String language;            
    public int extInputs;

    public void setExtInputs(int extInputs) {
        this.extInputs = extInputs;
    }
    public int extOutputs;
    public int extInquiries;
    public int intLogicFiles;
    public int extIntFiles;
    //weighting factors
    public int wfExtInputs;
    public int wfExtOutputs;
    public int wfExtInquiries;
    public int wfIntLogicFiles;
    public int wfExtIntFiles;
    private int[] valueFactors;

    public ProjectData() {
        language = "Java";
        extInputs = 0;
        extOutputs = 0;
        extInquiries = 0;
        intLogicFiles = 0;
        extIntFiles = 0;
        wfExtInputs = 4;
        wfExtOutputs = 5;
        wfExtInquiries = 4;
        wfIntLogicFiles = 10;
        wfExtIntFiles = 7;
        valueFactors = new int[14];
    }

    public ObservableValue changePropertyValueFactors() {
        return Bindings.concat(valueFactors);
    }
    
    public int getExtIn(){
        return extInputs;
    }
    public int getValueFactorAtIndex (int index) {return valueFactors[index];}
    public void setValueFactorAtIndex (int index, int value) {
        valueFactors[index] = value;
    }
    public int getValueFactorSum() {
        int sum = 0;
        for(int i: valueFactors)
            sum += i;
        return sum;
    }
    public int getTotalFactors() {
        return extInputs * wfExtInputs + extOutputs * wfExtOutputs + extInquiries * wfExtInquiries +
                intLogicFiles * wfIntLogicFiles + extIntFiles * wfExtIntFiles;
    }
}


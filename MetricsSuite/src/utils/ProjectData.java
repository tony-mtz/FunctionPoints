/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;


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
    public Vaf vaf;

    public ProjectData() {
        language = "Java";
        extInputs = 0;
        extOutputs = 0;
        extInquiries = 0;
        intLogicFiles = 0;
        extIntFiles = 0;
        wfExtInputs = 0;
        wfExtOutputs = 0;
        wfExtInquiries = 0;
        wfIntLogicFiles = 0;
        wfExtIntFiles = 0;
        vaf = new Vaf();
    }   
    
    public int getExtIn(){
        return extInputs;
    }
}


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;


import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import metricssuite.Context;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * @author tony
 */
public class ProjectData {
    private final IntegerProperty vafSum = new SimpleIntegerProperty();
    private final StringProperty language = new SimpleStringProperty();
    private final StringProperty name = new SimpleStringProperty();
    public int extInputs;
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
    private double pjfpTotal;

    ProjectData(String name) {
        setName(name);
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
        pjfpTotal = 0;
    }

    public String getName() {
        return name.get();
    }

    public StringProperty nameProperty() {
        return name;
    }

    public void setName(String name) {
        this.name.set(name);
    }

    public double getPjfpTotal() {
        return pjfpTotal;
    }

    public void setPjfpTotal(double pjfpTotal) {
        this.pjfpTotal = pjfpTotal;
        Context.getInstance().setSaved(false);
    }

    public void setExtInputs(int extInputs) {
        this.extInputs = extInputs;
    }

    public IntegerProperty vafSumProperty() {
        return vafSum;
    }

    public final int getVafSum() {
        return vafSumProperty().get();
    }

    public final void setVafSum() {
        vafSumProperty().set(getValueFactorSum());
    }

    public int getExtIn() {
        return extInputs;
    }

    public int getValueFactorAtIndex(int index) {
        return valueFactors[index];
    }

    public void setValueFactorAtIndex(int index, int value) {
        valueFactors[index] = value;
    }

    public StringProperty languageProperty() {
        return language;
    }

    public void setLanguage(String language) {
        this.language.set(language);
    }

    public String getLanguage() {
        return language.get();
    }

    /**
     * Calculates sum of value factors.
     *
     * @return Integer sum of value factors.
     */
    public int getValueFactorSum() {
        int sum = 0;
        for (int i : valueFactors)
            sum += i;
        return sum;
    }

    /**
     * Calculates total factor count.
     *
     * @return Integer value of total factors.
     */
    public int getTotalFactors() {
        return extInputs * wfExtInputs + extOutputs * wfExtOutputs + extInquiries * wfExtInquiries +
                intLogicFiles * wfIntLogicFiles + extIntFiles * wfExtIntFiles;
    }
}


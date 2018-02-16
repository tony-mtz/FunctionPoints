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
public class Vaf {
    
    private int[] values = new int[14];

    public Vaf(){

    }

    public Vaf(int[] values){
        this.values = values;
                
    }

    public void setValue(int index, int value) {
        if ((value > 5) || (value) < 0) {
            throw new IllegalArgumentException("Value out of range for VAF");
        }
        this.values[index] = value;
    }
    
    public int getValue(int index){
        return values[index];
    }
    
}
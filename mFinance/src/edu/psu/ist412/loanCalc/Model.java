/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.psu.ist412.loanCalc;

import java.util.Scanner;

/**
 *
 * @author GRamos
 */
public class Model {
    protected Amortization a1;
    
    protected double loan;
    protected double aIR;
    protected int length;
    
    public Model(){
        
        
        
        a1 = new Amortization(getLoan(), getaIR(), getLength());
    }
    
    public void Start(double inp1, int inp2, double inp3){
        
        this.setLoan(inp1);
        this.setLength(inp2);
        this.setaIR(inp3);
        
    }

    /**
     * @return the a1
     */
    public Amortization getA1() {
        return a1;
    }

    /**
     * @return the loan
     */
    public double getLoan() {
        return loan;
    }

    /**
     * @return the aIR
     */
    public double getaIR() {
        return aIR;
    }

    /**
     * @return the length
     */
    public int getLength() {
        return length;
    }

    /**
     * @param a1 the a1 to set
     */
    public void setA1(Amortization a1) {
        this.a1 = a1;
    }

    /**
     * @param loan the loan to set
     */
    public void setLoan(double loan) {
        this.loan = loan;
    }

    /**
     * @param aIR the aIR to set
     */
    public void setaIR(double aIR) {
        this.aIR = aIR;
    }

    /**
     * @param length the length to set
     */
    public void setLength(int length) {
        this.length = length;
    }
    
    
    
}

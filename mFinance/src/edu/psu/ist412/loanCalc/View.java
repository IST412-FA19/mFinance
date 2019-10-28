/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.psu.ist412.loanCalc;

/**
 *
 * @author GRamos
 */
public class View {

    /**
     * @return the iF
     */
    public InitialFrame getiF() {
        return iF;
    }

    /**
     * @param iF the iF to set
     */
    public void setiF(InitialFrame iF) {
        this.iF = iF;
    }
    
    protected double inp1;
    protected int inp2;
    protected double inp3;
           
    
    
    protected InitialFrame iF;
    
    public View(){
        iF = (new InitialFrame());
    }
    
    public void update(double loan, int months, double interest){
        this.setInp1(loan);
        this.setInp2(months);
        this.setInp3(interest);
        
    }

    /**
     * @return the inp1
     */
    public double getInp1() {
        return inp1;
    }

    /**
     * @return the inp2
     */
    public int getInp2() {
        return inp2;
    }

    /**
     * @return the inp3
     */
    public double getInp3() {
        return inp3;
    }

    /**
     * @param inp1 the inp1 to set
     */
    public void setInp1(double inp1) {
        this.inp1 = inp1;
    }

    /**
     * @param inp2 the inp2 to set
     */
    public void setInp2(int inp2) {
        this.inp2 = inp2;
    }

    /**
     * @param inp3 the inp3 to set
     */
    public void setInp3(double inp3) {
        this.inp3 = inp3;
    }

    
}

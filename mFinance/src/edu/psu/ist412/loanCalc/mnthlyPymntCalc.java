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
public class mnthlyPymntCalc {
    
    protected double ttlMnthlyPymnt;
            
    public mnthlyPymntCalc(double lnAmnt, double mIR, int months){
        mIR= mIR/100;
        ttlMnthlyPymnt = lnAmnt*(mIR/(1-1/Math.pow(1 + mIR, months)));
    }

    /**
     * @return the ttlMnthlyPymnt
     */
    public double getMMP() {
        return ttlMnthlyPymnt;
    }

    /**
     * @param ttlMnthlyPymnt the ttlMnthlyPymnt to set
     */
    public void setTtlMnthlyPymnt(double ttlMnthlyPymnt) {
        this.ttlMnthlyPymnt = ttlMnthlyPymnt;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.psu.ist412.loanCalc;
import java.math.*;
/**
 *
 * @author GRamos
 */
public class Amortization {
    double paidInt; 
    double paidPrinc;
    double balance;
    double mIR;
    int month;
        
    public Amortization(double princ, double aIR, int months) {
    
        mIR = aIR / 12;
        mnthlyPymntCalc mnthlyPymnt = new mnthlyPymntCalc(princ, mIR, months);
        
        System.out.format("Monthly Payment:%8.2f%n", mnthlyPymnt.getMMP());
        System.out.format("Total Payment:  %8.2f%n", mnthlyPymnt.getMMP() * months);
        Header();
        for (month = 1; month <= months; month++) {
            paidInt  = princ*(mIR/100);
            paidPrinc = mnthlyPymnt.getMMP() - paidInt;
            balance  = princ - paidPrinc;

            Schedule(month, paidInt, paidPrinc, balance);
            princ = balance;
        }
    }

    private void Schedule(int month, double intpaid, double princpaid, double balance) {
        System.out.format("%8d%10.2f%10.2f%12.2f\n", month, intpaid, princpaid, balance);
    }

    private void Header() {
        System.out.println("\nAmortization schedule");
        for(int i = 0; i < 40; i++) {
            System.out.print("-");
        }
        System.out.format("\n%8s%10s%10s%12s\n", "Payment|", "Interest|", "Principal|", "Balance");
        System.out.format("%8s%10s%10s%12s\n\n", "", "paid", "paid", "");
    }
    
    
    
}

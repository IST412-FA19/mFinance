/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.psu.ist412.loans;

import java.util.ArrayList;

/**
 *
 * @author Randi Semera
 */
public class LoanList {
    
    private ArrayList<Loan> loanList;
    
    public LoanList(ArrayList loanlist){
        this.loanList = loanlist;
        
    }
    
    public ArrayList<Loan> getLoanList(){
        return loanList;
    }
    
    public void setLoanList(ArrayList<Loan> loanList){
        this.loanList = loanList;
    }
    
}

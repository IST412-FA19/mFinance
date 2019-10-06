/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.psu.ist412.loans;

import edu.psu.ist412.customers.Customer;

/**
 *
 * @author swhealon
 */
public class Loan {
    
    /* The Loan class will contain the information about existing loans and it 
    will contain the process logic to help issue and maintain loans for customers
    The API will allow other modules to pull the required information from the loan
    class.
    */
    
    private int loanID;
    private int loanAmount;
    private Customer customer;
    
    public Loan (int loanID, int loanAmount, Customer customer){
        this.loanID = loanID;
        this.loanAmount = loanAmount;
        this.customer = customer;
    }
    
    
}

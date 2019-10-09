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

    /**
     * @return the loanID
     */
    public int getLoanID() {
        return loanID;
    }

    /**
     * @return the loanAmount
     */
    public double getLoanAmount() {
        return loanAmount;
    }

    /**
     * @return the customer
     */
    public Customer getCustomer() {
        return customer;
    }

    /**
     * @param loanID the loanID to set
     */
    public void setLoanID(int loanID) {
        this.loanID = loanID;
    }

    /**
     * @param loanAmount the loanAmount to set
     */
    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    /**
     * @param customer the customer to set
     */
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    
    /* The Loan class will contain the information about existing loans and it 
    will contain the process logic to help issue and maintain loans for customers
    The API will allow other modules to pull the required information from the loan
    class.
    */
    
    protected int loanID;
    protected double loanAmount;
    protected Customer customer;
    
    public Loan (int loanID, double loanAmount, Customer customer){
        this.loanID = loanID;
        this.loanAmount = loanAmount;
        this.customer = customer;
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.psu.ist412.loans;

/**
 *
 * @author Randi Semera
 */
public class PersonalLoan implements Loan{
    private String firstName;
    private String lastName;
    private double amount;
    private String purpose;
    
    
    @Override
    public void setDetails(String first, String last, Double am){
        this.firstName = first;
        this.lastName = last;
        this.amount = am;
    }
    public void setPurpose(String p){
        this.purpose =p;
    }
    @Override
    public String getDetails(){
        return "Full Name: " + this.firstName 
                + " " + this.lastName
                + " \nLoan Amount Requested: $" + this.amount 
                + " \nPurpose of Loan: "+ this.purpose;
    }
    
    @Override
    public String getLoanType(){
        return "Personal Loan";
    }
}

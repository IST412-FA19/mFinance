/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.psu.ist412.transactions;

/**
 *
 * @author Randi Semera
 */
public class Transaction {
    private String firstName;
    private String lastName;
    private double transfer_amnt;
    private boolean balanceVerified;       
    private final String transactionNum;
    /*
    * 
    */
    public Transaction(){
        transactionNum = getTransactionNum();
    }
        
    /**
     * Returns customerFirstName for this transaction
     * @return A string representing the customer name for this account
     */
    public String getCustomerFirstName(){
        return this.firstName;
    }
        /**
     * Returns customerLastName for this transaction
     * @return A string representing the customer name for this account
     */
    public String getCustomerLastName(){
        return this.lastName;
    }
    /**
     * Sets the total amount for the transaction
     * @param requestAmount A double representing the amount for the transaction
     * @return if an account is verified and the amount to be transferred if verified
     */
    public String amountToTransfer(double requestAmount){
        this.transfer_amnt = requestAmount;
        /**Account will verify that the customer has the balance to cover
        *The requestedAmount, if true, returns confirmation of amount
        *this.balanceVerified = Account.verifyBalance(this.toTransfer);
        *If true, this.transferAmount=this.toTransfer;
        */
       
        return "Verification: "+ balanceVerified + " Amount to Transfer: " + this.transfer_amnt;
    }
    
    /**
     * Returns a getTransactionNum
     * @return A String representing the transactionID for the fund transfer
     */
    public String getTransactionNum(){
        return this.transactionNum;
    }   
}

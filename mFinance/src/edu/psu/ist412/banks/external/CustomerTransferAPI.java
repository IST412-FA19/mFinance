/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.psu.ist412.banks.external;

/*
* Financial institutions
* including public and private lenders can use the fields in this API to request
* for customer data for transactions. This API can also be used to request for
* a customer's customerTransferAPI standing and account status.
 */

/**
 * v.1.01
 * @author Team 03
 */
public class CustomerTransferAPI {
    private String firstName;
    private String lastName;
    private double balance;
    private long accountID;
    private double toTransfer;
    private boolean balanceVerified;
    private double transferAmount;
    
    /**
     * This is the default constructor for the Bank API. 
     */
    public CustomerTransferAPI(){       
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
        this.toTransfer = requestAmount;
        /**Account will verify that the customer has the balance to cover
        *The requestedAmount, if true, returns confirmation of amount
        *this.balanceVerified = Account.verifyBalance(this.toTransfer);
        *If true, this.transferAmount=this.toTransfer;
        */
        return "Verification: "+ balanceVerified + " Amount to Transfer: " + this.transferAmount;
    }
    
    /**
     * Returns a transactionID
     * @return A long representing the transactionID for the fund transfer
     */
    public long transactionID(){
        return this.accountID;
    }
    
}

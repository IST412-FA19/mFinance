/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.psu.ist412.banks.external;

import edu.psu.ist412.customers.Customer;

/*
* Financial institutions
* including public and private lenders can use the fields in this API to request
* for customer data for transactions. This API can also be used to request for
* a customer's customerTransferAPI standing and account status.
 */

/**
 * v.1.01
 * @author Randi Semera
 */
public class AccountStatusRequest {
    private String firstName;
    private String lastName;
    private double balance;
    private long accountID;
    private double toTransfer;
    private boolean balanceVerified;
    private double transferAmount;
    private long accountNumber;
    private long routingNumber;
    private String bankName;
    private String bankID;
    private boolean isBankCustomer;
    
    /**
     * This is the default constructor for the Bank API. 
     */
    public AccountStatusRequest(){       
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAccountID(long accountID) {
        this.accountID = accountID;
    }

    public void setToTransfer(double toTransfer) {
        this.toTransfer = toTransfer;
    }

    public void setBalanceVerified(boolean balanceVerified) {
        this.balanceVerified = balanceVerified;
    }

    public void setTransferAmount(double transferAmount) {
        this.transferAmount = transferAmount;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public void setBankID(String bankID) {
        this.bankID = bankID;
    }

    public boolean verifyBank(Customer cust, String bankName, long acct_Num, 
            long rout_Num, String cntry_code){
        return isBankCustomer;
    }
    
}

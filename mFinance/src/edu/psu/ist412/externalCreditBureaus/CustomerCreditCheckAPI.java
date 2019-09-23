package externalCreditBureaus;

/*
* Package: Credit Bureau Companies
* This package will include the classes associated with obtaining customer
* credit history and and an API will be designed to request credit scores and credit history
* for applicant's requesting a loan. 
*
* Some Classes to be included in this package are:
* Abstract class for credit request type (Credit Score only, Credit Report, Credit History, etc)
* Interface to connect to Credit Bureua companies (using API)
*/

/**
 * The following is an example of some of the attributes and methods used to obtain customer 
 * credit history data.
 * @author Team 03
 */
public class CustomerCreditCheckAPI {
    private int score;
    private String creditHistory;
    private long transactionID;
    private int del_count_30days;
    
    /**
     * This is the default constructor for the Bank API. 
     */
    public CustomerCreditCheckAPI(){       
    }

    /**
     * Returns credit score to assist in determining an applicant's lending approval
     * @return An int representing the credit score number for the individual
     */
    public int getCreditScore(){
        return this.score;
    }
    /**
     * Returns a document consisting of an individual's credit history
     * @return A string representing the customer name for this account
     */
    public String getCreditHistory(){
        return this.creditHistory;
    }
    /**
     * Returns the count of delinquent payments greater 30 days late
     * @return An int representing the number of delinquent payments over 30 days late
     */
    public int del_payments_30(){
        return this.del_count_30days;
    }
    
    /**
     * Returns a transactionID
     * @return A long representing the transactionID for the fund transfer
     */
    public long transactionID(){
        return this.transactionID;
    }
    
}

package externalCreditBureaus;

/*
* Credit Bureau Companies
* This API should be used to request credit scores and credit history
* for applicant's requesting a loan. 
 */

/**
 * v.1.01
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


package edu.psu.ist412.account;

import edu.psu.ist412.customers.Customer;
import java.time.LocalDate;
import static java.time.LocalDate.now;

/**
 *Account is used to track individual data for users
 * @author Randi Semera
 */
public class Account {
    private final LocalDate customerCreationDate;
    private String accountStatus = "Delinquint";
    private final Customer customer;
    
    /**
     * Instantiates a user account initiating the customerCreationDate based off
     * of the local mFinance headquarter timezone. If the customer is submitting 
     * an application before creating an account, the following method and parameters 
     * will take form data to create customer and account.
     */
    public Account(Customer c){
        this.customerCreationDate = now();   
        customer = c;
    }


    /**
     * method to retrieve the date of account creation
     * @return DateTime of customerCreationDate
     */
    public LocalDate getAccountCreationDate() {
        return customerCreationDate;
    }

    /**
     * Returns current account standing (overdue, inactive, review)
     * @return String of account standing
     */
    public String getAccountStatus() {
        return accountStatus;
    }

    /**
     * Sets current account standing (overdue, inactive, review)
     * @param String of account standing
     */
    public void setAccountStatus(String accountStatus) {
        this.accountStatus = accountStatus;
    }
}

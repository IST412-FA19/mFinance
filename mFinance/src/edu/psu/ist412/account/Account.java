
package edu.psu.ist412.account;

import edu.psu.ist412.customers.Customer;
import java.time.LocalDate;
import static java.time.LocalDate.now;

/**
 *Account is used to track individual data for users
 * @author Randi Semera
 */
public class Account {
    private Customer customer;
    private LocalDate customerCreationDate;
    private String accountStatus;
    private String firstName;
    private String lastName;
    private String email;
    
    /**
     * Instantiates a user account initiating the customerCreationDate based off
     * of the local mFinance headquarter timezone. If the customer is submitting 
     * an application before creating an account, the following method and parameters 
     * will take form data to create customer and account.
     */
    public Account(String first, String last, String email){
        this.customerCreationDate = now();
        this.firstName = first;
        this.lastName = last;
        this.email = email;   
    }

    /**
     * Returns customer object in order to obtain further customer info: address, email, dob, etc
     * @return Customer type
     */
    public Customer getCustomer() {
        return customer;
    }

    /**
     * Takes customer as input to access customer details.
     * @param Customer object
     */
    public void setCustomer(Customer customer) {
        this.customer = customer;
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

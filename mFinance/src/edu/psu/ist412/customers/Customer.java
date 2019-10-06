
package edu.psu.ist412.customers;

import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author swhealon
 */
public class Customer {
    
    private String firstName;
    private String lastName;
    private String email;
    private Date dob;
    private LocalDate customerCreationDate; 
    
    /*The customer class will contain the basic information of users of the system.
    The API will provide access to the customer information that is contained within
    the application. 
    */
    public Customer(String first, String last, String email, Date birthday){
        this.firstName = first;
        this.lastName = last;
        this.email = email;
        this.dob = birthday;
    }
    /**
     * Sets the customer first name for this account
     * @param String first A String representing the first name for the user of this account
     */  
    public void setFirstName(String first){
        this.firstName = first;
    }
    /**
     * Returns customerFirstName for this transaction
     * @return A string representing the customer name for this account
     */    
    public String getFirstName(){
        return this.firstName;
    }
    /**
     * Sets the customer last name for this account
     * @param String first A String representing the last name for the user of this account
     */   
    public void setLastName(String last){
        this.lastName = last;
    }
        /**
     * Returns customerLastName
     * @return A string representing the customer name for this account
     */    
    public String getLastName(){
        return this.lastName;
    }
    /**
     * Sets the customer email address for this account
     * @param String representing the email address for the user of this account
     */  
    public void setEmail(String add){
        this.email = add;
    }
    /**
     * Returns customer email address for this transaction
     * @return A string representing the customer email for this account
     */    
    public String getEmail(){
        return this.email;
    }
        
}

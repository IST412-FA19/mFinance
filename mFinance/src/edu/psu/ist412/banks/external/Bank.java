/*
* Package: Banks
* This package will include the classes associated with obtaining customer
* bank or financial information to link a bank account, make payments and 
* confirm account information for loan applications
 */
package edu.psu.ist412.banks.external;

import edu.psu.ist412.customers.Customer;

/**
 *
 * @author Randi Semera
 */
public class Bank {
    private String bankName;
    private String bankID;
    private long accountNumber;
    private long routingNumber;
    private String idNumber;
    private String currency;
    private String cntry_code;
    private Customer customer;
     
    /*The Bank class will provide access to individual bank information,
    * account information and can be used to locate external links (in an internal 
    * bank database) to create Bank API connections
    */
    public Bank(String name, String id, long aNumber, long rNumber, String country, Customer cust){
        this.bankName = name;
        this.bankID = id;
        this.accountNumber = aNumber;
        this.routingNumber = rNumber;
        this.cntry_code = country;
        this.customer = cust;
    }
    
}


package edu.psu.ist412.customers;

import java.util.ArrayList;
/**
 *
 * @author Randi Semera
 */
public class CustomerList {
    
    //edited by gramos   
    protected Customer customer;
    protected ArrayList<Customer> customerList;
    
    public CustomerList(){
        
        
        
    }
    public CustomerList(Customer cust){
        
        ArrayList<Customer> customerList = new ArrayList<Customer>();
        
        this.customer = cust;
        
        customerList.add(customer);
        
    }
    
    public ArrayList<Customer> getCustomerList(){
        return customerList;
    }
    
    public void setCustomerList(ArrayList<Customer> customerList){
        this.customerList = customerList;
    }

    /**
     * @return the customer
     */
    public Customer getCustomer() {
        return customer;
    }

    /**
     * @param customer the customer to set
     */
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    
    
    
}

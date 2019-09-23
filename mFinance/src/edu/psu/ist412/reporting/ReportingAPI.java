/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.psu.ist412.reporting;

import edu.psu.ist412.customers.Customer;
import edu.psu.ist412.employees.Employee;
import edu.psu.ist412.loans.Loan;

/**
 * API used to get reports for financial regulators.
 * 
 * @author garre
 */
public class ReportingAPI {
    /**
     * Retrieves a list of all customers who had interaction with a specific
     * employee.
     * 
     * @param employee Employee who should be searched for customer contact.
     * @return A list of all customers with whom the employee had contact.
     */
    public Customer[] getCustomersByEmployee(Employee employee) {
        return new Customer[] {};
    }
    
    /**
     * Retrieves a list of all employees who had interactions with a specific
     * customer.
     * 
     * @param customer Customer who's employee contacts should be searched.
     * @return Employees who were in contact with the specified customer.
     */
    public Employee[] getEmployeesByCustomer(Customer customer) {
        return new Employee[] {};
    }
    
    /**
     * Retrieves a list of all previous loans by a customer.
     * 
     * @param customer Customer for whom loans should be searched.
     * @return List of the customer's historical loans.
     */
    public Loan[] getLoansByCustomer(Customer customer) {
        return new Loan[] {};
    }
    
    /**
     * Retrieves a list of all loans handled by a specific employee.
     * 
     * @param employee The employee who's loan history should be searched.
     * @return A list of all loans handled by the specified employee.
     */
    public Loan[] getLoansByEmployee(Employee employee) {
        return new Loan[] {};
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.psu.ist412.employees;

/**
 *
 * @author swhealon
 */
public class Administrator extends Employee {
    String type = "Level 2";
    String restrictions = "None";

    public Administrator(String employeeID, String employeePassword, String firstName, String lastName, String employeePhone, String employeeEmail, String employeeDOB) {
        super(employeeID, employeePassword, firstName, lastName, employeePhone, employeeEmail, employeeDOB);
                
    }
    
    @Override
    public String getPrivileges(){
        return "Security level: " + type + " " + " Restrictions Set: " + restrictions;
    }

    
    
    
    
}

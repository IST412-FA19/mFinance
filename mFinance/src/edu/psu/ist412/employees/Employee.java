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
public class Employee {

    /* This class will enable us to set up employees in the system so that they 
    can access customer information in order to conduct their jobs. It will include
    a credentialing system that controls access for the employee to sensitive information
    This package will contain employee information such as name, age, contact info and
    their position.
     */
    private String employeeID;
    private String employeePassword;
    private String firstName;
    private String lastName;
    private String employeePhone;
    private String employeeEmail;
    private String employeeDOB;

    public Employee(String employeeID, String employeePassword, String firstName, String lastName, String employeePhone, String employeeEmail, String employeeDOB) {
        this.employeeID = employeeID;
        this.employeePassword = employeePassword;
        this.firstName = firstName;
        this.lastName = lastName;
        this.employeePhone = employeePhone;
        this.employeeEmail = employeeEmail;
        this.employeeDOB = employeeDOB;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getEmployeePassword() {
        return employeePassword;
    }

    public void setEmployeePassword(String employeePassword) {
        this.employeePassword = employeePassword;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmployeePhone() {
        return employeePhone;
    }

    public void setEmployeePhone(String employeePhone) {
        this.employeePhone = employeePhone;
    }

    public String getEmployeeEmail() {
        return employeeEmail;
    }

    public void setEmployeeEmail(String employeeEmail) {
        this.employeeEmail = employeeEmail;
    }

    public String getEmployeeDOB() {
        return employeeDOB;
    }

    public void setEmployeeDOB(String employeeDOB) {
        this.employeeDOB = employeeDOB;
    }

}

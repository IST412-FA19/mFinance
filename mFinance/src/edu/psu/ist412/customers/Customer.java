
package edu.psu.ist412.customers;


/**
 *
 * @author swhealon
 */

public class Customer {
    private int customerID;
    private String userName;
    private String password;
    private String firstName;
    private String lastName;
    private String email;
    private String dob;
    private int phone;
    private String streetAddress;
    private String customerCity;
    private String customerState;
    private int customerZip;

    public Customer(int customerID, String userName, String password, String firstName, String lastName, String email, String dob,
           int phone, String streetAddress, String customerCity, String customerState,
            int customerZip) {
        this.customerID = customerID;
        this.userName = userName;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.dob = dob;
        this.phone = phone;
        this.streetAddress = streetAddress;
        this.customerCity = customerCity;
        this.customerState = customerState;
        this.customerZip = customerZip;
    }

    public Customer(String firstName, String lastName, String employeeEmail, String employeeDOB) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getCustomerCity() {
       return customerCity;
    }

    public void setCustomerCity(String customerCity) {
        this.customerCity = customerCity;
    }

    public String getCustomerState() {
        return customerState;
    }

    public void setCustomerState(String customerState) {
        this.customerState = customerState;
    }

    public int getCustomerZip() {
        return customerZip;
    }

    public void setCustomerZip(int customerZip) {
        this.customerZip = customerZip;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Customer{" + "firstName=" + firstName + ", lastName=" + lastName
                + ", email=" + email + ", dob=" + dob + ", phone=" + phone
                + ", streetAddress=" + streetAddress + ", customerCity=" + customerCity
                + ", customerState=" + customerState + ", customerZip=" + customerZip + '}';
    }
}
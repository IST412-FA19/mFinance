/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.psu.ist412.login;

import edu.psu.ist412.customers.CustomerController;
import edu.psu.ist412.customers.CustomerList;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 *
 * @author swhealon
 */

public class LoginController implements ActionListener {
    private LoginUI loginUI;
    private CustomerList customerList;

    public LoginController() {
        loginUI = new LoginUI();
        customerList = new CustomerList();
        System.out.println("Login Constructor");
        setupListener();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Object ob = e.getSource();
        if (ob == loginUI.getSubmit()) {
            System.out.println("wtf");
            System.out.println("Submit");
            boolean test = getCustomerList().Authenticate(getLoginUI().getUserNameInput(),
                    getLoginUI().getPasswordInput());
            int arrayNum = getCustomerList().AuthenticatedNumber(getLoginUI().getUserNameInput(),
                    getLoginUI().getPasswordInput());
            if (test == true) {
                System.out.println("Parent Menu Panel");
                CustomerController c = new CustomerController();
                loginUI.setVisible(false);
            } else {
                System.out.println("Please Try Again");
                loginUI.submissionRejected();
            }
        }
        if(ob == loginUI.getCreateAccount()){
            System.out.println("Create Account Popup");
            CustomerAccountCreationUI c = new CustomerAccountCreationUI();
            c.setVisible(true);
        }
    }
    public LoginUI getLoginUI() {
        return loginUI;
    }

    public void setLoginUI(LoginUI loginUI) {
       this.loginUI = loginUI;
    }

    public CustomerList getCustomerList() {
        return customerList;
    }

    public void setCustomerList(CustomerList customerList) {
        this.customerList = customerList;
    }

    public void setupListener() {
        System.out.println("Setup ActionListeners");
        loginUI.getSubmit().addActionListener(this);
        loginUI.getCreateAccount().addActionListener(this);
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.psu.ist412.login;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.*;

/**
 *
 * @author swhealon
 */

public class LoginUI extends JFrame {
    private JTextField userName, password;
    private JButton submit, createAccount;
    private JPanel loginPanel, bottomPanel;

    public LoginUI() {
     super("Customer Log In");
        BorderLayout b1 = new BorderLayout();
        setLayout(b1);
        loginPanel = new JPanel(new GridLayout(2, 2, 10, 10));
        loginPanel.setVisible(true);
        add(loginPanel, "Center");

        JLabel j = new JLabel("User Name");
        loginPanel.add(j);

        userName = new JTextField();
        loginPanel.add(userName);

        JLabel j1 = new JLabel("Password");
        loginPanel.add(j1);

        password = new JTextField();
        loginPanel.add(password);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);

        bottomPanel = new JPanel();
        createAccount = new JButton("Create Account");
        bottomPanel.add(createAccount);
        submit = new JButton("Submit");
        bottomPanel.add(submit);

        add(bottomPanel, "South");
        setVisible(true);
    }

    //==========================================================================
    //Pop up Messages for Entrys and Errors
    //==========================================================================

    public void submissionRejected() {
        JOptionPane.showMessageDialog(rootPane, "Please Try Again");
    }
    //==========================================================================

    public JButton getSubmit() {
        return submit;
    }

    public JButton getCreateAccount() {
        return createAccount;
    }

    public String getUserNameInput() {
        return userName.getText();
    }

    public String getPasswordInput() {
        return password.getText();
    }
}
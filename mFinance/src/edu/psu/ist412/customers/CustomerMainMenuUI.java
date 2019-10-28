/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.psu.ist412.customers;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.*;

/**
 *
 * @author swhealon
 */

public class CustomerMainMenuUI extends JFrame {
    protected ArrayList<JButton> menuButtonArray;
    protected String buttonText;
    protected JPanel centerPanel;

    public CustomerMainMenuUI() {
        super("Customer Navigation");
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(720, 500);
        setVisible(true);

        menuButtonArray = new ArrayList();
        centerPanel = new JPanel(new GridLayout(4, 1, 5, 5));
        add(centerPanel, BorderLayout.CENTER);

        JLabel menuHeading = new JLabel(" Customer Account View");
        centerPanel.add(menuHeading);

        newButton("Apply For Loan");
        newButton("Account Management");
        newButton("Return to Login Screen");
    }

        private void newButton(String a) {
        buttonText = a;
        JButton button = new JButton(buttonText);
        menuButtonArray.add(button);
        centerPanel.add(button);
    }

    public ArrayList<JButton> getMenuButtons() {
        return menuButtonArray;
    }
}
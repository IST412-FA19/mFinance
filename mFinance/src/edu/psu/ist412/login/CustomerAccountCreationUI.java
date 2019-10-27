/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.psu.ist412.login;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.*;

/**
 *
 * @author swhealon
 */

public class CustomerAccountCreationUI extends JFrame {

    protected ArrayList<JButton> menuButtonArray;
    protected String buttonText;
    protected JPanel centerPanel, buttonPanel;

    public CustomerAccountCreationUI() {

        super("Customer Account Creation");
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(720, 500);
        setVisible(true);

        menuButtonArray = new ArrayList();
        centerPanel = new JPanel(new GridLayout(4, 1, 5, 5));
        add(centerPanel, BorderLayout.CENTER);
        buttonPanel = new JPanel(new GridLayout(2, 1, 5, 5));
        add(buttonPanel, BorderLayout.SOUTH);

        JLabel menuHeading = new JLabel("     Main Menu");
        centerPanel.add(menuHeading);

        newButton("Cancel");
        newButton("Submit");
    }

    private void newButton(String a) {
        buttonText = a;
        JButton button = new JButton(buttonText);
        menuButtonArray.add(button);
        buttonPanel.add(button);
    }

    public ArrayList<JButton> getMenuButtons() {
        return menuButtonArray;
    }
}
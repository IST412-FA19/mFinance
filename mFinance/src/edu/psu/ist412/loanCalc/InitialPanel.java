/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.psu.ist412.loanCalc;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author GRamos
 */
public class InitialPanel extends JPanel implements ActionListener{
    
    protected String input1;
    protected String input2;
    protected String input3;
    View view;
    
    protected double loan, interest;
    int months;
    
    JTextField field1 = new JTextField();
    JTextField field2 = new JTextField();
    JTextField field3 = new JTextField();
    public JButton jb1;
    JButton jb2;
    JButton jb3;
    
    public InitialPanel(){
        
        super();
        
        setBorder(new EmptyBorder(10, 10, 10, 10));
        setLayout(new GridBagLayout());

        GridBagConstraints gbc1 = new GridBagConstraints();
        gbc1.gridwidth = GridBagConstraints.REMAINDER;
        gbc1.anchor = GridBagConstraints.NORTH;

        add(new JLabel("<html><h1><strong><i>Loan Amortization Calculator</i></strong></h1><hr></html>"), gbc1);

        gbc1.anchor = GridBagConstraints.CENTER;
        gbc1.fill = GridBagConstraints.HORIZONTAL;
        
        JLabel label1 = new JLabel("Enter your loan amount: ");
        JLabel label2 = new JLabel("Enter length of the loan(months): ");
        JLabel label3 = new JLabel("Enter your interest rate(in %): ");
        
        label1.setLabelFor(field1);
        label2.setLabelFor(field2);
        label3.setLabelFor(field3); 
        
        JPanel textF = new JPanel(new GridBagLayout());
        textF.add(label1, gbc1);
        textF.add(field1,gbc1);
        
        textF.add(label2, gbc1);
        textF.add(field2,gbc1);
        
        textF.add(label3, gbc1);
        textF.add(field3,gbc1);
        
        add(textF, gbc1);
        
        
        JPanel buttons = new JPanel(new GridBagLayout());
        buttons.add(jb1 = new JButton("Start"), gbc1);
        buttons.add(jb3 = new JButton("Exit"), gbc1);

        jb1.addActionListener(this);
        
        gbc1.weighty = 1;
        add(buttons, gbc1);
        
    }
    
    public double LoanInput(){
        
        return loan;
    }
    public int monthsInput(){
        
        return months;
    }
    public double interestInput(){
        
        return loan;
    }
    
    public void setLoanInput(String inp1, String inp2, String inp3){
        
        loan = Double.parseDouble(inp1);
        months = Integer.parseInt(inp2);
        interest = Double.parseDouble(inp3);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent arg0) {
        setInput1(field1.getText());
        setInput2(field2.getText());
        setInput3(field3.getText());
        
        setLoanInput(input1, input2, input3);
        
        view.update(LoanInput(), monthsInput(), interestInput());
        
    }

    /**
     * @return the input1
     */
    public String getInput1() {
        return input1;
    }

    /**
     * @return the input2
     */
    public String getInput2() {
        return input2;
    }

    /**
     * @return the input3
     */
    public String getInput3() {
        return input3;
    }

    /**
     * @param input1 the input1 to set
     */
    public void setInput1(String input1) {
        this.input1 = input1;
    }

    /**
     * @param input2 the input2 to set
     */
    public void setInput2(String input2) {
        this.input2 = input2;
    }

    /**
     * @param input3 the input3 to set
     */
    public void setInput3(String input3) {
        this.input3 = input3;
    }
}

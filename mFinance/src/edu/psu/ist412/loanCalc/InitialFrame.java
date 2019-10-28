/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.psu.ist412.loanCalc;

import javax.swing.JFrame;
import javax.swing.UIManager;

/**
 *
 * @author GRamos
 */
public class InitialFrame extends JFrame{

    /**
     * @return the iP
     */
    public InitialPanel getiP() {
        return iP;
    }

    /**
     * @param iP the iP to set
     */
    public void setiP(InitialPanel iP) {
        this.iP = iP;
    }
    protected InitialPanel iP;
    
     public InitialFrame(){
         super("IST261 M05 A01 MVC Application");
         
         setupLayoutForMacs();
         
         iP= new InitialPanel();
         add(iP, "Center");
         
         setDefaultCloseOperation(EXIT_ON_CLOSE);
         setSize(400, 380);
         setVisible(true);
     
     
     }
    
    private void setupLayoutForMacs()
    {
        // On some MACs it might be necessary to have the statement below 
        //for the background color of the button to appear    
        try
        {
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        //------------------------------------------------------
    }
    
}

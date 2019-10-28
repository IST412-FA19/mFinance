/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.psu.ist412.loanCalc;
/**
 *
 * @author GRamos
 */
public class Controller {
    protected Model model;
    protected View view;
    
        
        public Controller(Model model, View view){
            this.view=view;
            this.model=model;
            
        }
        
        public void ControllerUpdate(){
            
            model.Start(view.getInp1(), view.getInp2(), view.getInp3());
            
        }

    
}

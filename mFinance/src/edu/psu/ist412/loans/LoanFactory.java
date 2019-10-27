/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.psu.ist412.loans;

/**
 *
 * @author Randi Semera
 */
public class LoanFactory {

   public Loan getLoanType(String loanType){
      if(loanType == null){
         return null;
      }		
      if(loanType.equalsIgnoreCase("CAR")){
         return new CarLoan();
         
      } else if(loanType.equalsIgnoreCase("PERSONAL")){
         return new PersonalLoan();
         
      }       
      return null;
   }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.psu.ist412.authentication;

/**
 *
 * @author Randi Semera
 */
public class Security {
    
    protected boolean userLog;
    protected String userKey;
    protected String userValue;
            
    public Security (User userl){
        
        if (userl.userName == userKey && userl.userPass==userValue){
            System.out.print("Login Succesful!");
            userLog = true;
        }
        else {
            System.out.print("Login unsuccesful, please try again. Confirm your username and password.");
            userLog = false;
        }
    
}

    /**
     * @return the userLog
     */
    public boolean isUserLog() {
        return userLog;
    }

    /**
     * @return the userKey
     */
    public String getUserKey() {
        return userKey;
    }

    /**
     * @return the userValue
     */
    public String getUserValue() {
        return userValue;
    }

    /**
     * @param userLog the userLog to set
     */
    public void setUserLog(boolean userLog) {
        this.userLog = userLog;
    }

    /**
     * @param userKey the userKey to set
     */
    public void setUserKey(String userKey) {
        this.userKey = userKey;
    }

    /**
     * @param userValue the userValue to set
     */
    public void setUserValue(String userValue) {
        this.userValue = userValue;
    }
    
}

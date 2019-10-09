/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.psu.ist412.logging;

/**
 *
 * @author garre
 */
public class LoggingController {
    Log logs = new Log();
    
    public void index() {
        System.out.println("LoggingController: Showing all logs:");
        System.out.println();
        
        for (LogEntry entry : logs.getLogMessages()) {
            System.out.println(entry);
            System.out.println();
        }
        
        System.out.println("Done");
    }
    
    public void show(int index) {
        System.out.println(String.format("LoggingController: Showing log #%s:", index));
        System.out.println();
        
        if (index >= logs.getLogMessages().length) {
            System.out.println("Invalid index!");
        } else {
            System.out.println(logs.getLogMessages()[index]);
        }
    }
    
    public void store(LogEntry entry) {
        logs.writeLogMessage(entry);
        
        System.out.println("LoggingController: Stored the following log:");
        System.out.println();
        System.out.println(entry);
    }
}

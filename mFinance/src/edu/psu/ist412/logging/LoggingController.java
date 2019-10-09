/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.psu.ist412.logging;

/**
 * Controls interactions between log views and log models.
 * 
 * @author garre
 */
public class LoggingController {
    Log logs = new Log();
    
    DetailView detailView = new DetailView();
    ListView listView = new ListView();
    
    /**
     * Renders a view that shows all logs stored within the system.
     */
    public void index() {
        System.out.println("LoggingController: Showing all logs...");
        listView.render();
    }
    
    /**
     * Renders detailed information for the specified log.
     * 
     * @param index Index of the log to show.
     */
    public void show(int index) {
        System.out.println(String.format("LoggingController: Showing log #%s...", index));
        
        if (index >= logs.getLogMessages().length) {
            System.err.println("LoggingController: Invalid index!");
        } else {
            detailView.render(logs.getLogMessages()[index]);
        }
    }
    
    /**
     * Saves a new log entry to backing storage.
     * 
     * @param entry The entry to store. 
     */
    public void store(LogEntry entry) {
        logs.writeLogMessage(entry);
        
        System.out.println("LoggingController: Stored the following log:");
        System.out.println(String.format("LoggingController: %s", entry.toString()));
    }
}

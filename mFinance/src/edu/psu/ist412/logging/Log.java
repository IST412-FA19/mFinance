/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.psu.ist412.logging;

import java.util.ArrayList;

/**
 * A representation of the application's log which is meant to contain entries
 * that conform to the Syslog protocol (RFC 5424).
 * 
 * @author garre
 */
public class Log {
    private final ArrayList<LogEntry> logEntries;
    
    public Log() {
        logEntries = new ArrayList<>();
    }
    
    /**
     * Writes a message to the log.
     * 
     * @param log Log entry to write.
     */
    public void writeLogMessage(LogEntry log) {
        logEntries.add(log);
    }
    
    /**
     * Retrieves all available log entries.
     * 
     * @return An array of all current logs. 
     */
    public LogEntry[] getLogMessages() {
        return logEntries.toArray(new LogEntry[logEntries.size()]);
    }
}

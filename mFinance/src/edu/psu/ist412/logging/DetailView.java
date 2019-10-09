/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.psu.ist412.logging;

/**
 * Shows detailed information regarding a specific log entry.
 * 
 * @author garre
 */
public class DetailView {
    /**
     * Displays information to the user.
     * 
     * @param entry Entry to show information for.
     */
    public void render(LogEntry entry) {
        System.out.println(String.format("Logging Detail View: Rendered for entry %s", entry.getMsgId()));
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.psu.ist412.logging;

/**
 * An RFC 5424-compliant representation of log severity indicators.
 * 
 * @author Garrett Wininger
 */
public enum Severity {
    emergency,
    alert,
    critical,
    error,
    warning,
    notice,
    informational,
    debug
}

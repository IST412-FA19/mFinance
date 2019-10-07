/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.psu.ist412.logging;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

/**
 * RFC 5424-compliant Syslog entry
 * @author garre
 */
public class LogEntry {
    /**
     * Retrieves the protocol version in use.
     * 
     * @return Protocol version in use. 
     */
    public int getProtocolVersion() {
        return protocolVersion;
    }
    
    /**
     * Retrieves the facility code.
     * 
     * @return Facility which initiated the log entry. 
     */
    public FacilityCode getFacilityCode() {
        return facilityCode;
    }

    /**
     * Retrieves the message ID.
     * 
     * @return Unique identifier for the message. 
     */
    public MessageId getMsgId() {
        return msgId;
    }

    /**
     * Retrieves the severity of the log message.
     * 
     * @return Severity of the log message. 
     */
    public Severity getSeverity() {
        return severity;
    }

    /**
     * Retrieves the name of the application which initiated the log entry.
     * 
     * @return Name of the running application.
     */
    public String getAppName() {
        return appName;
    }
    
    /**
     * Retrieves the system that the log was created on.
     * 
     * @return System that the log is from. 
     */
    public String getHostname() {
        return hostname;
    }

    /**
     * Retrieves data along with its associated parameters.
     * 
     * @return Data with associated parameters. 
     */
    public String getStructuredData() {
        return structuredData;
    }

    /**
     * Retrieves the ID of the application process.
     * 
     * @return Process identifier. 
     */
    public String getProcId() {
        return procId;
    }

    /**
     * Retrieves the message text.
     * 
     * @return Message text. 
     */
    public String getMsg() {
        return msg;
    }

    /**
     * Retrieves the log entry timestamp.
     * 
     * @return Log timestamp. 
     */
    public ZonedDateTime getTimestamp() {
        return timestamp;
    }
    
    /**
     * Syslog protocol version in use
     */
    private final int protocolVersion;

    /**
     * System facility which initiated the message
     */
    private final FacilityCode facilityCode;
    /**
     * Unique identifier of the message
     */
    private final MessageId msgId;
    /**
     * Severity of the log
     */
    private final Severity severity;
    /**
     * Name of the application which is generating logs
     */
    private final String appName;
    /**
     * Name of the system on which the application is running
     */
    private final String hostname;
    /**
     * Data types with associated parameters, optional
     */
    private final String structuredData;
    /**
     * Process id, if available
     */
    private final String procId;
    /**
     * Freeform message text
     */
    private final String msg;
    /**
     * Timestamp of the log message
     */
    private final ZonedDateTime timestamp;
    
    /**
     * Public constructor
     * 
     * @param facilityCode Identifier of the facility which initiated the log
     * @param severity Severity of the log message
     * @param messageId Unique identifier of the message
     * @param message Message text
     */
    public LogEntry(FacilityCode facilityCode, Severity severity, MessageId messageId, String message) {
        this.facilityCode = facilityCode;
        this.severity = severity;
        msgId = messageId;
        msg = message;
        
        appName = "mFinance";
        hostname = "mfinance.example.com";
        procId = "-";
        protocolVersion = 1;
        structuredData = "-";
        timestamp = ZonedDateTime.now();
    }
    
    @Override
    public String toString() {
        int priority = facilityCode.ordinal() * 8 + severity.ordinal();
        DateTimeFormatter syslogFormat = DateTimeFormatter.ISO_INSTANT;
        
        return String.format("<%d>%d %s %s %s %s %s %s %s", 
                priority, 
                protocolVersion,
                timestamp.format(syslogFormat),
                hostname,
                appName,
                procId,
                msgId.name(),
                structuredData,
                msg);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.psu.ist412.logging;

/**
 * An RFC 5424-compliant representation of facility codes.
 * 
 * @author garre
 */
public enum FacilityCode {
    kernel,
    user,
    mail,
    daemon,
    security,
    syslogd,
    lpr,
    nnews,
    uucp,
    clock,
    authorization,
    ftp,
    ntp,
    logAudit,
    logAlert,
    clockNote,
    local0,
    local1,
    local2,
    local3,
    local4,
    local5,
    local6,
    local7
}

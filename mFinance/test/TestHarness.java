
import edu.psu.ist412.employees.Administrator;
import edu.psu.ist412.employees.Employee;
import edu.psu.ist412.logging.FacilityCode;
import edu.psu.ist412.logging.Log;
import edu.psu.ist412.logging.LogEntry;
import edu.psu.ist412.logging.MessageId;
import edu.psu.ist412.logging.Severity;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author samqabbani
 */
public class TestHarness {
    
    public static void main (String[] args) {
	Employee employee = new Administrator("CK321", "5uperM@n", "Clark", "Kent", "7575551234", "CKent@mFinance.com","09/25/1950");
        
        /**
         * Testing employee class
         */
        testEmployee(employee);
        testLog();
        testLogEntry();
    }
    
    public static void testEmployee(Employee test){
        if (test != null) {
			System.out.println("Employee created successfully");
			System.out.println("Employee information: " + test.getEmployeeID() +" " + test.getEmployeePassword() + " " + test.getFirstName() + 
                                test.getLastName() + " " + test.getEmployeePhone() + " " + test.getEmployeeEmail() + " " + test.getEmployeeDOB());

			// Change User Info
                        test.setEmployeeID("BW543");
                        test.setEmployeePassword("3@tMan");
                        test.setFirstName("Bruce");
                        test.setLastName("Wayne");
                        test.setEmployeePhone("9805550987");
                        test.setEmployeeEmail("BWayne@mFinance.com");
                        test.setEmployeeDOB("05/03/1988");
                        
                        System.out.println("Employee information: " + test.getClass() + " " + test.getEmployeeID() + " " + test.getEmployeePassword() + " " + test.getFirstName() + 
                                test.getLastName() + " " + test.getEmployeePhone() + " " + test.getEmployeeEmail() + " " + test.getEmployeeDOB());		}
    
    }
    
    /**
     * Runs through a test of the Log class's functionality.
     */
    public static void testLog() {
        Log testLog = new Log();
        
        assert testLog.getLogMessages().length == 0;
        
        LogEntry testEntry = new LogEntry(FacilityCode.security, Severity.warning, MessageId.nil, "Login error");
        
        testLog.writeLogMessage(testEntry);
        
        LogEntry[] entries = testLog.getLogMessages();
        
        assert entries.length == 1;
        assert entries[0].equals(testEntry);
        
        System.out.println("Log created successfully");
        System.out.println("Added entry: " + testEntry.toString());
    }
    
    /**
     * Runs through a test of the LogEntry class's public constructor functionality.
     */
    public static void testLogEntry() {
        LogEntry testEntry = new LogEntry(FacilityCode.user, Severity.error, MessageId.nil, "Test");
        
        assert testEntry.getAppName().equals("mFinance");
        assert testEntry.getFacilityCode() == FacilityCode.user;
        assert testEntry.getHostname().equals("mfinance.example.com");
        assert testEntry.getMsg().equals("Test");
        assert testEntry.getMsgId() == MessageId.nil;
        assert testEntry.getProcId().equals("-");
        assert testEntry.getProtocolVersion() == 1;
        assert testEntry.getSeverity() == Severity.error;
        assert testEntry.getStructuredData().equals("-");
        
        System.out.println("Log entry created successfully");
        System.out.println("Entry information: " + testEntry.toString());
    }

}

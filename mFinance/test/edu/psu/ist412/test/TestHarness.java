package edu.psu.ist412.test;

import edu.psu.ist412.authentication.Authenticator;
import edu.psu.ist412.authentication.Security;
import edu.psu.ist412.authentication.User;
import edu.psu.ist412.account.Account;
import edu.psu.ist412.customers.Customer;
import edu.psu.ist412.employees.Administrator;
import edu.psu.ist412.employees.Employee;
import edu.psu.ist412.logging.FacilityCode;
import edu.psu.ist412.logging.Log;
import edu.psu.ist412.logging.LogEntry;
import edu.psu.ist412.logging.LoggingController;
import edu.psu.ist412.logging.MessageId;
import edu.psu.ist412.logging.Severity;

/**
 *
 * @author samqabbani
 */
public class TestHarness {
    
    public static void main (String[] args) {
	//Instantiates employee object using administrator subclass
        Employee employee = new Administrator("CK321", "5uperM@n", "Clark", "Kent", 
                "7575551234", "CKent@mFinance.com","09/25/1950");
        //Instantiates User for logging-in
        User user = new User("robin", "B0yWonder");
        
        //Testing Employee Class (using Administrator to test subclass)
        testEmployee(employee);
        //Tests User Authentication
        testLogin(user);
        //Tests Customer Account information
        testAccount(new Customer(employee.getFirstName(), employee.getLastName(), employee.getEmployeeEmail(), employee.getEmployeeDOB()));
        testLog();
        testLogEntry();
    }
    
    // Tests Employee class instantiation (Administrator) and internal methods. Should 
    public static void testEmployee(Employee test){
        System.out.println("\n<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>> \nTesting Employee Classes");      
        //If employee object exists then information should print out, be changed
        //and print changes made to employee object
        if (test != null) {
            System.out.println("Employee created successfully");
            System.out.println("Employee information: " + test.getEmployeeID() 
                    + " " + test.getEmployeePassword() + " " + test.getFirstName() 
                    + " " + test.getLastName() + " " + test.getEmployeePhone() 
                    + " " + test.getEmployeeEmail() + " " + test.getEmployeeDOB());

            // Change User Info
            test.setEmployeeID("BW543");
            test.setEmployeePassword("3@tMan");
            test.setFirstName("Bruce");
            test.setLastName("Wayne");
            test.setEmployeePhone("9805550987");
            test.setEmployeeEmail("BWayne@mFinance.com");
            test.setEmployeeDOB("05/03/1988");

            //confirms changes have been made to employee
            System.out.println("Employee information: " + test.getClass() 
                    + " " + test.getEmployeeID() + " " + test.getEmployeePassword() 
                    + " " + test.getFirstName() + test.getLastName() 
                    + " " + test.getEmployeePhone() + " " + test.getEmployeeEmail() 
                    + " " + test.getEmployeeDOB());		
        }
    }    
    public static void testLogin(User user){
        System.out.println("\n<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>> \nTesting Login Classes");
        System.out.println("Username " + user.getUserName() + " Password: " + user.getUserPass());
        Security userSecurity = new Security(user); 
        Authenticator authTest = new Authenticator(userSecurity);
    }
    
    public static void testAccount(Customer customer){
        System.out.println("\n<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>> \nTesting Account Classes");
        if(customer != null){
            Account custAccount = new Account(customer);    
            System.out.println("Account Created: " + custAccount.getAccountCreationDate()
                + " Account Status: " + custAccount.getAccountStatus());
            custAccount.setAccountStatus("Up to Date on Payments");
            System.out.println("Account status updated: " + custAccount.getAccountStatus());
        }
        else{
            System.out.println("No user account found");
        }
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

import edu.psu.ist412.employees.Administrator;
import edu.psu.ist412.employees.Employee;

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

    
}

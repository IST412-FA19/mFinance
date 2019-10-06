
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
    
    public TestHarness() {

		Employee Employee = new Employee("CK321", "5uperM@n", "Clark", "Kent", "7575551234", "CKent@mFinance.com","09/25/1950");

		if (Employee != null) {
			System.out.println("Employee created successfully");
			System.out.println("Employee information: " + Employee.getEmployeeID() + Employee.getEmployeePassword() + Employee.getFirstName() + 
                                Employee.getLastName() + Employee.getEmployeePhone() + Employee.getEmployeeEmail() + Employee.getEmployeeDOB());

			// Change User Info
                        Employee.setEmployeeID("BW543");
                        Employee.setEmployeePassword("3@tMan");
                        Employee.setFirstName("Bruce");
                        Employee.setLastName("Wayne");
                        Employee.setEmployeePhone("9805550987");
                        Employee.setEmployeeEmail("BWayne@mFinance.com");
                        Employee.setEmployeeDOB("05/03/1988");
                        
                        System.out.println("Employee information: " + Employee.getEmployeeID() + Employee.getEmployeePassword() + Employee.getFirstName() + 
                                Employee.getLastName() + Employee.getEmployeePhone() + Employee.getEmployeeEmail() + Employee.getEmployeeDOB());		}
    }

    
}

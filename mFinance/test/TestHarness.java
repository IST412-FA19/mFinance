
import Login.Authenticator;
import Login.Security;
import Login.User;
import edu.psu.ist412.account.Account;
import edu.psu.ist412.customers.Customer;
import edu.psu.ist412.employees.Administrator;
import edu.psu.ist412.employees.Employee;

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
}

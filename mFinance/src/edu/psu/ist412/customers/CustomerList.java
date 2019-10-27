
package edu.psu.ist412.customers;
import java.lang.reflect.Array;
import java.util.ArrayList;
/**
 *
 * @author swhealon
 */

public class CustomerList {
    private ArrayList<Customer> customerList;
    private String password, userName;

    public CustomerList(){
        customerList = new ArrayList<Customer>();
        Customer c1 = new Customer(1234, "swhealon", "password", "Sam", "Whealon", "email@email.com", "birthday",
            1800, "123 Street", "St Louis", "MO", 63104);
        customerList.add(c1);
        Customer c2 = new Customer(1234, "a", "a", "Sam", "Whealon", "email@email.com", "birthday",
            1800, "123 Street", "St Louis", "MO", 63104);
        customerList.add(c2);
    }

    public ArrayList<Customer> getCustomerList(){
        return customerList;
    }

    public void setCustomerList(ArrayList customerList) {
        this.customerList = customerList;
    }
        public boolean Authenticate(String a, String b) {
        this.userName = a;
        this.password = b;

        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getUserName().contains(userName)) {
                int p = i;
                System.out.println("Match!");

                if (password.equals(customerList.get(p).getPassword())) {
                    System.out.println("Authenticated");
                    return true;
                } else {
                    System.out.println("Password fail");
                    return false;
                }
            }
        }
        return false;
    }

            public int AuthenticatedNumber(String a, String b) {
        this.userName = a;
        this.password = b;

        int x = -1;

        for (int i = 0; i < customerList.size(); i++) {

            if (customerList.get(i).getUserName().contains(userName)) {
                int p = i;
                System.out.println("Match!");

                if (password.equals(customerList.get(p).getPassword())) {
                    System.out.println("Authenticated");

                    System.out.println(i);
              
                    return i;
                } else {
                    return x;
                }
            }
        }
        return x;
    }
}
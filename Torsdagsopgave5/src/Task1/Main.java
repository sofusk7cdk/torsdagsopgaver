package Task1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Customer v = new Customer("Victor", "Andersen", "victor1234");
        Customer s = new Customer("Sofus", "Larsen", "sofus1234");
        Customer t = new Customer("Thor", "Henriksen" , "thor1234");
        Customer a = new Customer("Andreas", "Sørensen", "andreas1234");

        ArrayList<Customer> customers = new ArrayList<>();

        customers.add(v);
        customers.add(s);
        customers.add(t);
        customers.add(a);

        printCustomers(customers);


    }

    public static void printCustomers(ArrayList customers) {
        for(Object i : customers) {
            System.out.println(i);
        }
    }
}
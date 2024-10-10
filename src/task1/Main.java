package task1;
import java.util.ArrayList;

public class Main {
    public static void main (String [] args){
        //1. e ArrayList til at holde vores customers fra Customer-class
        ArrayList <Customer> customers = new ArrayList<>();

        //Vi laver nye kunder ud af Customer-class
        Customer kunde1 = new Customer ("David", "Kjærgaard", "Hankatten");
        Customer kunde2 = new Customer ("Dennis", "Jensen", "lillekat");

        //Vi tilføjer kunderne til vores ArrayList
        customers.add(kunde1);
        customers.add(kunde2);

        //Vi tester om id-systemt virker
        //System.out.println(kunde1.getId());
        //kunde1.setId(3);
        //System.out.println(kunde1.getId());
        //System.out.println(kunde2.getId());


        //1. f vi kalder vores metode med customers ArrayList som argument
        printCustomers(customers);
    }




    //1. f Vi laver en metode der tager customers ArrayListen som parameter og
    //     printer info på kunderne ved brug af et for-each loop og vores toString-metode
    public static void printCustomers(ArrayList <Customer> customers) {
        for (Customer c: customers){
            System.out.println(c.toString());
        }
    }
}

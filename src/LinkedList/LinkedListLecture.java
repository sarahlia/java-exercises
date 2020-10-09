package LinkedList;

import java.util.ArrayList;

public class LinkedListLecture {

    public static void main(String[] args) {
        Customer customer = new Customer("Tim", 54.96);
        Customer anotherCustomer;
        anotherCustomer = customer;
        anotherCustomer.setBalance(12.18);
        System.out.printf("Balance for customer %s is %.2f \n", customer.getName(), customer.getBalance());

        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(3);
        intList.add(4);

        for(int i = 0; i < intList.size(); i++) {
            System.out.println(i + ": " + intList.get(i));
        }

        //this puts the value 2 at position/index 1, and moves everything after it down:
        intList.add(1, 2);

        for(int i = 0; i < intList.size(); i++) {
            System.out.println(i + ": " + intList.get(i));
        }
    }

}

package com.sarahlia;

public class VipCustomerApp {

    public static void main(String[] args) {
        //test 1st constructor
        VipCustomer person1 = new VipCustomer();
        System.out.printf("%s's credit limit = $%.2f. Email: %s \n", person1.getName(), person1.getCreditLimit(), person1.getEmailAddress());

        //test 2nd constructor
        VipCustomer bill = new VipCustomer("Bill Nye", "bill@sci.com");
        System.out.print(bill.getName() + ", email: " + bill.getEmailAddress());
        System.out.printf(". Credit limit = $%.2f \n", bill.getCreditLimit());

        //test 3rd constructor
        VipCustomer cherry = new VipCustomer("Cherry Ann", 3500.00, "cherry@live.com");
        System.out.print(cherry.getName() + ", email: " + cherry.getEmailAddress());
        System.out.printf(". Credit limit = $%.2f \n", cherry.getCreditLimit());
    }

}

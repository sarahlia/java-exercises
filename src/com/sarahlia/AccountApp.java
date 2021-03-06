package com.sarahlia;

public class AccountApp {

    public static void main(String[] args) {
        Account bubAccount = new Account();

//        Account bubAccount = new Account("071539", 0.00, "Bub Brinkley", "312-700-2750", "bub@brinkley.com");
        System.out.println("bubAccount.getNumber() = " + bubAccount.getNumber());
        System.out.printf("bubAccount.getBalance() = $%.2f \n", bubAccount.getBalance());

        bubAccount.withdrawal(100.00);

        bubAccount.deposit(50.00);
        bubAccount.withdrawal(100.00);

        bubAccount.deposit(51.00);
        bubAccount.withdrawal(100.00);

        Account timAccount = new Account("Tim Apple", "tim@mail.com", "3124690818");
        timAccount.withdrawal(100.55);
        System.out.printf("%s name: %s, balance: $%.2f \n", timAccount.getNumber(), timAccount.getCustomerName(), timAccount.getBalance());

    }
}

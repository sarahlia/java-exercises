package com.sarahlia;

public class Account {

    private String number;
    private double balance;
    private String customerName;
    private String customerEmailAddress;
    private String customerPhoneNumber;

    public Account() {
        this("12345", 2.50, "Default name", "Default phone", "Defaul email"); //must be the first statement if we want to use 'this' this way. This is calling the constructor in line 17.
        System.out.println("Empty constructor called");
    }

    //do all the initialization in this constructor.
    public Account(String number, double balance, String customerName, String customerPhoneNumber, String customerEmailAddress) {
        System.out.println("Account constructor with parameters called.");
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.customerPhoneNumber = customerPhoneNumber;
        this.customerEmailAddress = customerEmailAddress;
    }

    public Account(String customerName, String customerEmailAddress, String customerPhoneNumber) {
        this("99999", 100.55, customerName, customerEmailAddress, customerPhoneNumber);
    }

    public void deposit(double depositAmount) {
        this.balance += depositAmount;
        System.out.printf("Deposit of $%.2f made. New balance is $%.2f \n", depositAmount, this.balance);
    }

    public void withdrawal(double withdrawalAmount) {
        if(this.balance - withdrawalAmount < 0) {
            System.out.printf("Only $%.2f available. Withdrawal not processed. \n", this.balance);
        } else {
            this.balance -= withdrawalAmount;
            System.out.printf("Withdrawal of $%.2f processed. Remaining balance = $%.2f \n", withdrawalAmount, this.balance);
        }

    }

    public String getNumber() {
        return this.number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public void setCustomerName(String name) {
        this.customerName = name;
    }

    public String getCustomerEmailAddress() {
        return this.customerEmailAddress;
    }

    public void setCustomerEmailAddress(String email) {
        this.customerEmailAddress = email;
    }

    public String getCustomerPhoneNumber() {
        return this.customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String phone) {
        this.customerPhoneNumber = phone;
    }

}

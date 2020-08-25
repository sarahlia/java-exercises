package com.sarahlia;

public class VipCustomer {

    private String name;
    private double creditLimit;
    private String emailAddress;

    public VipCustomer() {
        this("Default Customer", 10000.00, "default@mail.com"); //calls constructor in line 17
    }

    public VipCustomer(String name, String emailAddress) {
        this(name, 5000.00, emailAddress); //calls constructor in line 17
    }

    public VipCustomer(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}

package com.xworkz.customer;

public class Customer {
    public int customerId;
    public String customerName;
    public BankAc[] bankAccounts; // Use consistent naming

    public void displayDetails() {
        System.out.println("Customer ID: " + customerId);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Bank Accounts: ");

        if (bankAccounts != null) {
            for (BankAc account : bankAccounts) {
                account.showDetails();
            }
        } else {
            System.out.println("No bank accounts linked.");
        }

    }

}

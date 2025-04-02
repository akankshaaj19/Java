package com.xworkz.customer;

public class CustR {
    public static void main(String[] args) {
        // Creating Bank Accounts
        BankAc account1 = new BankAc();
        account1.accountId = 3501;
        account1.branches = new String[]{"Bangalore", "Mumbai"};

        BankAc account2 = new BankAc();
        account2.accountId = 8967;
        account2.branches = new String[]{"Chennai", "Delhi"};

        // Creating Customer
        Customer customer = new Customer();
        customer.customerId = 2347;
        customer.customerName = "Poornima Jagannath";
        customer.bankAccounts = new BankAc[]{account1, account2}; // Corrected variable name

        // Displaying Details
        customer.displayDetails(); // Call method on instance, not class
 }

}

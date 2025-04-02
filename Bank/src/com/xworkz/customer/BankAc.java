package com.xworkz.customer;

public class BankAc {
    public int accountId;
    public String[] branches;

    public void showDetails() {
        System.out.println("  Account ID: " + accountId);
        System.out.print("  Branches: ");

        if (branches != null) {
            for (String branch : branches) {
                System.out.print(branch + " ");
            }
        } else {
            System.out.print("No branches available.");
        }

        System.out.println();
    }

}

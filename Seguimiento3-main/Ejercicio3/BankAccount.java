package Ejercicio3;

import javax.swing.*;

public class BankAccount {
    private String accountNumber;
    private double balance;
    private String status;
    private String securityKey;

    public BankAccount(String accountNumber, double balance, String status, String securityKey) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.status = status;
        this.securityKey = securityKey;
    }

    public void chekBalnce() {
        System.out.println("Current balce:$" + balance);
    }

    public void withdrawCash(double value) {
        if (value <= balance) {
            balance -= value;
            System.out.println("His retirement is: $" + value);
            System.out.println("Your current balance is: $" + balance);
        } else {
            System.out.println("Your balance is insufficient");
        }
    }

    public void consignmentOfCash(double value) {
        balance += value;
        System.out.println("You have deposited: $" + value);
        System.out.println("Your new balance is: $" + balance);
    }

    public void changePassword() {
        String currentCode = JOptionPane.showInputDialog("Enter your current security code:");

        if (currentCode != null && currentCode.equals(securityKey)) {

            String newCode = JOptionPane.showInputDialog("Enter your new security code:");

            if (newCode != null && !newCode.isEmpty()) {
                securityKey = newCode;
                JOptionPane.showMessageDialog(null, "Security code changed successfully.");
            } else {
                JOptionPane.showMessageDialog(null, "The new security code cannot be empty.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Incorrect security code.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void displayMenu() {
        System.out.println("---- MENU ----");
        System.out.println("1. Check Balance");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Deposit Money");
        System.out.println("4. Change Security Code");
        System.out.println("5. Exit");
    }
}

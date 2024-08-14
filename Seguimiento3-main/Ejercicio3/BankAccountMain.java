package Ejercicio3;

import javax.swing.*;

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("123456789", 1000.0, "Active", "1234");

        boolean exit = false;
        while (!exit) {
            String[] options = {"Check Balance", "Withdraw Money", "Deposit Money", "Change Security Code", "Exit"};
            int choice = JOptionPane.showOptionDialog(null, "Choose an option", "Bank Menu",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

            switch (choice) {
                case 0:
                    account.chekBalnce();
                    break;
                case 1:
                    String withdrawInput = JOptionPane.showInputDialog("Enter the amount to withdraw:");
                    if (withdrawInput != null) {
                        double withdrawAmount = Double.parseDouble(withdrawInput);
                        account.withdrawCash(withdrawAmount);
                    }
                    break;
                case 2:
                    String depositInput = JOptionPane.showInputDialog("Enter the amount to deposit:");
                    if (depositInput != null) {
                        double depositAmount = Double.parseDouble(depositInput);
                        account.consignmentOfCash(depositAmount);
                    }
                    break;
                case 3:
                    account.changePassword();
                    break;
                case 4:
                    exit = true;
                    JOptionPane.showMessageDialog(null, "Thank you for using our service!");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Invalid option. Please try again.");
            }
        }
    }
}

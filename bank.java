//Course: COP 2210 Section 03
//Name: ME
//Program Description: Assignment 2
//I certify that this code was created by me (and/ or my instructor).
//Signed ______________________________________________
//Implements a basic bank program with basic transaction implementation

import java.text.Format;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;
import javax.swing.*;

public class AssignmentTwo {

    public static void main(String[] args) {

        String bank = JOptionPane.showInputDialog("Please enter your account no.");
        BankAccount MyAccount = new BankAccount(bank, 0.0);
        if (bank == null) {
            return;
        }
        while (true) {
            if (MyAccount == null) {
                break;
            }
            
            String succ = " Hello account no." + " " + bank + " " + ", you are now logged in!";
            JOptionPane.showMessageDialog(null, succ);
            String input = JOptionPane.showInputDialog("Please input your deposit amount followed by OK.");
            if (input == null) {
                return;
            }

            double sum = 0.0;
            Scanner Scan = new Scanner(input);
            double A = Scan.nextDouble();
            sum = sum + A;
            MyAccount.deposit(sum);

            String output = JOptionPane.showInputDialog("Please input your withdraw amount followed by OK.");
            if (output == null) {
                return;
            }
            Scanner Scan1 = new Scanner(output);
            double B = Scan1.nextDouble();
            MyAccount.withdraw(B);

            Format moneyFmt = NumberFormat.getCurrencyInstance(Locale.US);
            String accdec = "Transactions for account no." + " " + bank + "\n";
            String accdep = "Deposit:" + " " + moneyFmt.format(sum);
            String accwit = "Withdraw:" + " " + moneyFmt.format(B) + "\n";
            String accbal = "After transactions balance is" + " " + moneyFmt.format(MyAccount.getBalance());
            String jopt = accdec + "\n" + accdep + "\n" + accwit + "\n" + accbal;
            JTextArea display = new JTextArea(jopt, 15, 30);
            JOptionPane.showMessageDialog(null, display);
        }//End While
    }
}

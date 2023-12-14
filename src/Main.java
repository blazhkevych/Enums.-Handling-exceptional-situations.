import Tasks.T1.Bank.Bank;
import Tasks.T1.Banknote.Banknote;

import java.util.Scanner;

/**
 * This class contains a main method to test the Bank functionality.
 */
public class Main {

    /**
     * A method to test the Bank functionality.
     */
    public static void testBank() {
        try {
            // Create an empty bank
            Bank bank = new Bank();

            // Add 3 ATMs to the bank
            bank.addATM(3);

            // Load money into all ATMs
            bank.loadMoneyIntoAllATMs(new Banknote(1, 2, 3, 4, 5, 6, 7, 8, 9));

            // Print reports for all ATMs
            bank.printAllATMsReport();

            // Print the total amount of money in the bank
            System.out.println("\nTotal amount of money in the bank: " + bank.getTotalBankMoney());

            ////////////////////////////////////////////////////////////////////////////////////////////////////////////
            // Prompt user to enter the ATM number from which they want to withdraw money
            ////////////////////////////////////////////////////////////////////////////////////////////////////////////

            int atmNumber;
            int currentATMsInBank = bank.getCurrentATMsInBank();
            do {
                System.out.println("\nEnter the ATM number from which you want to withdraw money: ");
                Scanner sc = new Scanner(System.in);
                atmNumber = sc.nextInt();
                if (atmNumber < 1 || atmNumber > currentATMsInBank) {
                    System.out.println("Invalid ATM number. Please try again.");
                }
            } while (atmNumber < 1 || atmNumber > currentATMsInBank);

            // Prompt user to enter the amount to withdraw until a valid amount is entered
            String sum;
            do {
                System.out.println("\nEnter the amount you want to withdraw: ");
                Scanner sc = new Scanner(System.in);
                sum = sc.nextLine();
                if (sum.matches("[0-9]+") && Integer.parseInt(sum) > 0) {
                    break;
                } else {
                    System.out.println("Invalid amount. Please try again.");
                }
            } while (true);

            // Withdraw money from the selected ATM
            bank.withdrawMoneyFromATM(atmNumber, sum);

            // Print reports for all ATMs
            bank.printAllATMsReport();

            // Print the total amount of money in the bank after withdrawal
            System.out.println("\nTotal amount of money in the bank after withdrawal: " + bank.getTotalBankMoney());

            ////////////////////////////////////////////////////////////////////////////////////////////////////////////
            // Prompt user to enter the ATM number to which they want to deposit money
            ////////////////////////////////////////////////////////////////////////////////////////////////////////////
            int atmNumberToLoad;
            do {
                System.out.println("\nEnter the ATM number to which you want to deposit money: ");
                Scanner sc = new Scanner(System.in);
                atmNumberToLoad = sc.nextInt();
                if (atmNumberToLoad < 1 || atmNumberToLoad > bank.getCurrentATMsInBank()) {
                    System.out.println("Invalid ATM number. Please try again.");
                }
            } while (atmNumberToLoad < 1 || atmNumberToLoad > bank.getCurrentATMsInBank());

            // Prompt user to enter the amount to deposit until a valid amount is entered
            int sumToLoad;
            do {
                System.out.println("\nEnter the amount you want to deposit into the selected ATM: ");
                Scanner sc = new Scanner(System.in);
                sumToLoad = sc.nextInt();
                if (sumToLoad < 0) {
                    System.out.println("Invalid amount. Please try again.");
                }
            } while (sumToLoad < 0);

            // Convert the amount to banknotes
            Banknote banknoteToLoad = Banknote.convertSumToBanknotes(sumToLoad);

            // Load money into the selected ATM
            bank.loadMoneyIntoATM(atmNumberToLoad, banknoteToLoad);

            // Print reports for all ATMs
            bank.printAllATMsReport();

            // Print the total amount of money in the bank after deposit
            System.out.println("\nTotal amount of money in the bank after deposit: " + bank.getTotalBankMoney());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    /**
     * The main method to execute the Bank testing.
     *
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        testBank();
    }
}
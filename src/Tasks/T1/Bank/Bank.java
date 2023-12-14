package Tasks.T1.Bank;

import Tasks.T1.ATM.ATM;
import Tasks.T1.Banknote.Banknote;
import Tasks.T1.Exceptions.ATM.IncorrectAmountOfMoneyToIssueException;
import Tasks.T1.Exceptions.ATM.InvalidATMNumberException;
import Tasks.T1.Exceptions.Bank.InvalidNumberOfATMsInBank;

/**
 * The Bank class represents a bank that owns a network of ATMs.
 * It includes operations for initializing the ATM network, creating ATMs, loading money into ATMs, and determining the total amount of money in the ATM network.
 */
public class Bank {
    // The constant field to store the number of ATMs in the network
    private final int ATM_COUNT = 10;
    // The array to store ATMs
    private ATM[] atms;

    // Constructor for the Bank class
    public Bank() {
        atms = new ATM[ATM_COUNT];
    }

    /**
     * Load money into each ATM in the array.
     *
     * @param money The banknotes to be loaded into each ATM.
     */
    public void loadMoneyIntoAllATMs(Banknote money) {
        for (ATM atm : atms) {
            if (atm != null) {
                atm.loadMoney(money);
            }
        }
    }

    /**
     * Get the total amount of money in the ATM network.
     *
     * @return The total amount of money in the ATM network.
     */
    public int getTotalBankMoney() {
        int totalMoney = 0;
        for (ATM atm : atms) {
            if (atm != null) {
                totalMoney += atm.getATMMoney();
            }
        }
        return totalMoney;
    }

    /**
     * Print a full report for all ATMs in the bank.
     *
     * @throws InvalidNumberOfATMsInBank If there are no ATMs in the bank.
     */
    public void printAllATMsReport() throws InvalidNumberOfATMsInBank {
        // If the number of ATMs in the bank is 0, throw an exception
        if (getCurrentATMsInBank() == 0) {
            throw new InvalidNumberOfATMsInBank("There are no ATMs in the bank");
        }

        for (int i = 0; i < ATM_COUNT; i++) {
            if (atms[i] != null) {
                System.out.println("\nATM Number " + (i + 1) + ":");
                atms[i].printATMReport(i);
            }
        }
    }

    /**
     * Add a specified number of ATMs to the bank.
     *
     * @param amountOfAtm The number of ATMs to add.
     * @throws InvalidATMNumberException If the number of ATMs to add is invalid.
     */
    public void addATM(int amountOfAtm) throws InvalidATMNumberException {
        if (amountOfAtm > (ATM_COUNT - getCurrentATMsInBank())) {
            throw new InvalidATMNumberException("Attempting to create more ATMs than the bank can accommodate");
        }
        if (amountOfAtm < 1) {
            throw new InvalidATMNumberException("The number of ATMs should be greater than 1");
        }
        for (int i = 0; i < atms.length; i++) {
            if (amountOfAtm == 0) {
                break;
            }
            if (atms[i] == null) {
                atms[i] = new ATM();
                amountOfAtm--;
            }
        }
    }

    /**
     * Withdraw money from a specific ATM in the bank.
     *
     * @param atmNumber The number of the ATM from which to withdraw money.
     * @param sum       The amount of money to withdraw.
     * @throws InvalidATMNumberException              If the ATM number is invalid.
     * @throws IncorrectAmountOfMoneyToIssueException If the withdrawal amount is incorrect.
     */
    public void withdrawMoneyFromATM(int atmNumber, String sum) throws InvalidATMNumberException, IncorrectAmountOfMoneyToIssueException {
        if (atmNumber < 1 || atmNumber > getCurrentATMsInBank()) {
            throw new InvalidATMNumberException("Invalid ATM number. Please try again.");
        }
        // Check if the entered sum is a positive integer
        if (!sum.matches("[0-9]+") || Integer.parseInt(sum) <= 0) {
            throw new InvalidATMNumberException("Invalid sum entered. Please try again.");
        }
        if (atms[atmNumber - 1] != null) {
            atms[atmNumber - 1].withdrawMoney(Integer.parseInt(sum));
        }
    }

    /**
     * Get the current number of ATMs in the bank.
     *
     * @return The current number of ATMs in the bank.
     */
    public int getCurrentATMsInBank() {
        int count = 0;
        for (ATM atm : atms) {
            if (atm != null) {
                count++;
            }
        }
        return count;
    }

    /**
     * Get the maximum number of ATMs that can be placed in the bank.
     *
     * @return The maximum number of ATMs that can be placed in the bank.
     */
    public int getMaxNumberATMsCanBePlacedInBank() {
        return ATM_COUNT;
    }

    /**
     * Load money into a specific ATM in the bank.
     *
     * @param atmNumberToLoad The number of the ATM to load money into.
     * @param banknote        The banknotes to load into the ATM.
     */
    public void loadMoneyIntoATM(int atmNumberToLoad, Banknote banknote) {
        if (atms[atmNumberToLoad - 1] != null) {
            atms[atmNumberToLoad - 1].loadMoney(banknote);
        } else {
            System.out.println("The ATM with this number does not exist");
        }
    }
}
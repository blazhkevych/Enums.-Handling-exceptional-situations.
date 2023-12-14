package Tasks.T1.ATM;

import Tasks.T1.ATM.Sum.Sum;
import Tasks.T1.Banknote.Banknote;
import Tasks.T1.Exceptions.ATM.IncorrectAmountOfMoneyToIssueException;

/**
 * The ATM class represents an Automated Teller Machine that manages the available cash, banknotes, and various operations.
 */
public class ATM {
    // The current sum of money available in the ATM
    private Sum sum;

    // The banknotes in the ATM
    private Banknote banknotes;

    // The minimum sum required for cash withdrawal
    private int minSum;

    // The maximum number of banknotes that can be dispensed through the cash withdrawal window
    private int maxBanknotes;

    // The location of the ATM
    private String location;

    // Default constructor to create an empty ATM
    public ATM() {
        this.banknotes = new Banknote();
        this.sum = new Sum();
        this.minSum = 100;
        this.maxBanknotes = 30;
        this.location = "Street ";
    }

    // Parameterized constructor to initialize the ATM with specific parameters
    public ATM(Banknote banknotes, int minSum, int maxBanknotes, String location) {
        this.banknotes = banknotes;
        this.sum = new Sum(banknotes.getOne(), banknotes.getTwo(), banknotes.getFive(), banknotes.getTen(),
                banknotes.getTwenty(), banknotes.getFifty(), banknotes.getHundred(), banknotes.getTwoHundred(),
                banknotes.getFiveHundred());
        this.minSum = minSum;
        this.maxBanknotes = maxBanknotes;
        this.location = location;
    }

    /**
     * Load money into the ATM by updating the banknotes quantity.
     *
     * @param money The banknotes to be loaded into the ATM.
     */
    public void loadMoney(Banknote money) {
        this.banknotes.setOne(this.banknotes.getOne() + money.getOne());
        this.banknotes.setTwo(this.banknotes.getTwo() + money.getTwo());
        this.banknotes.setFive(this.banknotes.getFive() + money.getFive());
        this.banknotes.setTen(this.banknotes.getTen() + money.getTen());
        this.banknotes.setTwenty(this.banknotes.getTwenty() + money.getTwenty());
        this.banknotes.setFifty(this.banknotes.getFifty() + money.getFifty());
        this.banknotes.setHundred(this.banknotes.getHundred() + money.getHundred());
        this.banknotes.setTwoHundred(this.banknotes.getTwoHundred() + money.getTwoHundred());
        this.banknotes.setFiveHundred(this.banknotes.getFiveHundred() + money.getFiveHundred());
        this.sum = new Sum(this.banknotes.getOne(), this.banknotes.getTwo(), this.banknotes.getFive(),
                this.banknotes.getTen(), this.banknotes.getTwenty(), this.banknotes.getFifty(),
                this.banknotes.getHundred(), this.banknotes.getTwoHundred(), this.banknotes.getFiveHundred());
    }

    /**
     * Get the total sum of money in the ATM.
     *
     * @return The total sum of money in the ATM.
     */
    public int getATMMoney() {
        return this.sum.getMoneySum();
    }

    /**
     * Print a report of the money in the ATM, including the quantity of banknotes for each denomination and the ATM's location.
     *
     * @param i An identifier for the ATM.
     */
    public void printATMReport(int i) {
        System.out.println("ATM Location: " + this.location + " " + i);
        System.out.println("Sum of money in the ATM: " + this.sum.getMoneySum() + " UAH");
        System.out.println("Quantity of banknotes for each denomination:");
        System.out.println("1 UAH - " + this.banknotes.getOne() + " bills");
        System.out.println("2 UAH - " + this.banknotes.getTwo() + " bills");
        System.out.println("5 UAH - " + this.banknotes.getFive() + " bills");
        System.out.println("10 UAH - " + this.banknotes.getTen() + " bills");
        System.out.println("20 UAH - " + this.banknotes.getTwenty() + " bills");
        System.out.println("50 UAH - " + this.banknotes.getFifty() + " bills");
        System.out.println("100 UAH - " + this.banknotes.getHundred() + " bills");
        System.out.println("200 UAH - " + this.banknotes.getTwoHundred() + " bills");
        System.out.println("500 UAH - " + this.banknotes.getFiveHundred() + " bills");
    }

    /**
     * Withdraw money from the ATM.
     *
     * @param sum The amount of money to withdraw.
     * @throws IncorrectAmountOfMoneyToIssueException If the withdrawal amount is incorrect or cannot be processed.
     */
    public void withdrawMoney(int sum) throws IncorrectAmountOfMoneyToIssueException {
        // If the sum is less than the minimum withdrawal amount, throw an exception
        if (sum < this.minSum) {
            throw new IncorrectAmountOfMoneyToIssueException("The entered amount is less than the minimum withdrawal amount. Please try again.");
        }
        // If the sum is greater than the total sum of money in the ATM, throw an exception
        if (sum > this.sum.getMoneySum()) {
            throw new IncorrectAmountOfMoneyToIssueException("The entered amount is greater than the total sum of money in the ATM. Please try again.");
        }
        // If the sum is greater than the maximum number of banknotes that can be dispensed, throw an exception
        if (sum > this.maxBanknotes * 500) {
            throw new IncorrectAmountOfMoneyToIssueException("The entered amount is greater than the maximum number of banknotes that can be dispensed. Please try again.");
        }

        if (sum >= this.minSum && sum <= this.sum.getMoneySum() && sum <= this.maxBanknotes * 500) {
            // Variables to store the quantity of each denomination
            int fiveHundred = 0;
            int twoHundred = 0;
            int hundred = 0;
            int fifty = 0;
            int twenty = 0;
            int ten = 0;
            int five = 0;
            int two = 0;
            int one = 0;
            int sumCopy = sum;

            // Calculate the quantity of each denomination required to fulfill the withdrawal
            while (sumCopy >= 500 && this.banknotes.getFiveHundred() > 0) {
                sumCopy -= 500;
                fiveHundred++;
            }
            while (sumCopy >= 200 && this.banknotes.getTwoHundred() > 0) {
                sumCopy -= 200;
                twoHundred++;
            }
            while (sumCopy >= 100 && this.banknotes.getHundred() > 0) {
                sumCopy -= 100;
                hundred++;
            }
            while (sumCopy >= 50 && this.banknotes.getFifty() > 0) {
                sumCopy -= 50;
                fifty++;
            }
            while (sumCopy >= 20 && this.banknotes.getTwenty() > 0) {
                sumCopy -= 20;
                twenty++;
            }
            while (sumCopy >= 10 && this.banknotes.getTen() > 0) {
                sumCopy -= 10;
                ten++;
            }
            while (sumCopy >= 5 && this.banknotes.getFive() > 0) {
                sumCopy -= 5;
                five++;
            }
            while (sumCopy >= 2 && this.banknotes.getTwo() > 0) {
                sumCopy -= 2;
                two++;
            }
            while (sumCopy >= 1 && this.banknotes.getOne() > 0) {
                sumCopy -= 1;
                one++;
            }

            // If the withdrawal amount can be fulfilled, update the banknotes quantity and display the withdrawal details
            if (sumCopy == 0) {
                this.banknotes.setFiveHundred(this.banknotes.getFiveHundred() - fiveHundred);
                this.banknotes.setTwoHundred(this.banknotes.getTwoHundred() - twoHundred);
                this.banknotes.setHundred(this.banknotes.getHundred() - hundred);
                this.banknotes.setFifty(this.banknotes.getFifty() - fifty);
                this.banknotes.setTwenty(this.banknotes.getTwenty() - twenty);
                this.banknotes.setTen(this.banknotes.getTen() - ten);
                this.banknotes.setFive(this.banknotes.getFive() - five);
                this.banknotes.setTwo(this.banknotes.getTwo() - two);
                this.banknotes.setOne(this.banknotes.getOne() - one);
                this.sum = new Sum(this.banknotes.getOne(), this.banknotes.getTwo(), this.banknotes.getFive(),
                        this.banknotes.getTen(), this.banknotes.getTwenty(), this.banknotes.getFifty(),
                        this.banknotes.getHundred(), this.banknotes.getTwoHundred(), this.banknotes.getFiveHundred());
                System.out.println("Dispensed " + fiveHundred + " bills of 500 UAH.");
                System.out.println("Dispensed " + twoHundred + " bills of 200 UAH.");
                System.out.println("Dispensed " + hundred + " bills of 100 UAH.");
                System.out.println("Dispensed " + fifty + " bills of 50 UAH.");
                System.out.println("Dispensed " + twenty + " bills of 20 UAH.");
                System.out.println("Dispensed " + ten + " bills of 10 UAH.");
                System.out.println("Dispensed " + five + " bills of 5 UAH.");
                System.out.println("Dispensed " + two + " bills of 2 UAH.");
                System.out.println("Dispensed " + one + " bills of 1 UAH.");
            } else {
                System.out.println("There are not enough bills in the ATM to fulfill this withdrawal amount.");
            }
        } else {
            System.out.println("The entered amount is incorrect. Please try again.");
        }
    }
}
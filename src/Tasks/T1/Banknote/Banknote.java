package Tasks.T1.Banknote;

import Tasks.T1.Exceptions.Banknote.InvalidSumToConvertIntoBanknotesException;

/**
 * The Banknote class represents a set of banknotes with different denominations.
 */
public class Banknote {

    // The number of banknotes for the ONE denomination
    private int one;

    // The number of banknotes for the TWO denomination
    private int two;

    // The number of banknotes for the FIVE denomination
    private int five;

    // The number of banknotes for the TEN denomination
    private int ten;

    // The number of banknotes for the TWENTY denomination
    private int twenty;

    // The number of banknotes for the FIFTY denomination
    private int fifty;

    // The number of banknotes for the HUNDRED denomination
    private int hundred;

    // The number of banknotes for the TWO_HUNDRED denomination
    private int twoHundred;

    // The number of banknotes for the FIVE_HUNDRED denomination
    private int fiveHundred;

    // Default constructor
    public Banknote() {
        this.one = 0;
        this.two = 0;
        this.five = 0;
        this.ten = 0;
        this.twenty = 0;
        this.fifty = 0;
        this.hundred = 0;
        this.twoHundred = 0;
        this.fiveHundred = 0;
    }

    /**
     * Parameterized constructor to initialize the banknotes with specific quantities.
     *
     * @param one         The number of ONE denomination banknotes.
     * @param two         The number of TWO denomination banknotes.
     * @param five        The number of FIVE denomination banknotes.
     * @param ten         The number of TEN denomination banknotes.
     * @param twenty      The number of TWENTY denomination banknotes.
     * @param fifty       The number of FIFTY denomination banknotes.
     * @param hundred     The number of HUNDRED denomination banknotes.
     * @param twoHundred  The number of TWO_HUNDRED denomination banknotes.
     * @param fiveHundred The number of FIVE_HUNDRED denomination banknotes.
     */
    public Banknote(int one, int two, int five, int ten, int twenty, int fifty, int hundred, int twoHundred, int fiveHundred) {
        this.one += one;
        this.two += two;
        this.five += five;
        this.ten += ten;
        this.twenty += twenty;
        this.fifty += fifty;
        this.hundred += hundred;
        this.twoHundred += twoHundred;
        this.fiveHundred += fiveHundred;
    }

    // Getters
    public int getOne() {
        return one;
    }

    public int getTwo() {
        return two;
    }

    public int getFive() {
        return five;
    }

    public int getTen() {
        return ten;
    }

    public int getTwenty() {
        return twenty;
    }

    public int getFifty() {
        return fifty;
    }

    public int getHundred() {
        return hundred;
    }

    public int getTwoHundred() {
        return twoHundred;
    }

    public int getFiveHundred() {
        return fiveHundred;
    }

    // Setters
    public void setOne(int one) {
        this.one = one;
    }

    public void setTwo(int two) {
        this.two = two;
    }

    public void setFive(int five) {
        this.five = five;
    }

    public void setTen(int ten) {
        this.ten = ten;
    }

    public void setTwenty(int twenty) {
        this.twenty = twenty;
    }

    public void setFifty(int fifty) {
        this.fifty = fifty;
    }

    public void setHundred(int hundred) {
        this.hundred = hundred;
    }

    public void setTwoHundred(int twoHundred) {
        this.twoHundred = twoHundred;
    }

    public void setFiveHundred(int fiveHundred) {
        this.fiveHundred = fiveHundred;
    }

    /**
     * Convert a specified sum into a set of banknotes.
     *
     * @param sumToLoad The sum to convert into banknotes.
     * @return A Banknote object representing the banknotes for the specified sum.
     * @throws InvalidSumToConvertIntoBanknotesException If the sum to convert is invalid.
     */
    public static Banknote convertSumToBanknotes(int sumToLoad) throws InvalidSumToConvertIntoBanknotesException {
        // Check if the sum to convert is greater than 0
        if (sumToLoad <= 0) {
            throw new InvalidSumToConvertIntoBanknotesException("Invalid sum for conversion. Please try again.");
        }

        int fiveHundred = 0;
        int twoHundred = 0;
        int hundred = 0;
        int fifty = 0;
        int twenty = 0;
        int ten = 0;
        int five = 0;
        int two = 0;
        int one = 0;
        while (sumToLoad >= 500) {
            fiveHundred++;
            sumToLoad -= 500;
        }
        while (sumToLoad >= 200) {
            twoHundred++;
            sumToLoad -= 200;
        }
        while (sumToLoad >= 100) {
            hundred++;
            sumToLoad -= 100;
        }
        while (sumToLoad >= 50) {
            fifty++;
            sumToLoad -= 50;
        }
        while (sumToLoad >= 20) {
            twenty++;
            sumToLoad -= 20;
        }
        while (sumToLoad >= 10) {
            ten++;
            sumToLoad -= 10;
        }
        while (sumToLoad >= 5) {
            five++;
            sumToLoad -= 5;
        }
        while (sumToLoad >= 2) {
            two++;
            sumToLoad -= 2;
        }
        while (sumToLoad >= 1) {
            one++;
            sumToLoad -= 1;
        }
        return new Banknote(one, two, five, ten, twenty, fifty, hundred, twoHundred, fiveHundred);
    }
}
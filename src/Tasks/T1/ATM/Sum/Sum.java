package Tasks.T1.ATM.Sum;

/**
 * The Sum class defines the amount of money in the ATM at a given moment.
 */
public class Sum {

    // Sum of 1 hryvnia banknotes
    private int oneSum;

    // Sum of 2 hryvnias banknotes
    private int twoSum;

    // Sum of 5 hryvnias banknotes
    private int fiveSum;

    // Sum of 10 hryvnias banknotes
    private int tenSum;

    // Sum of 20 hryvnias banknotes
    private int twentySum;

    // Sum of 50 hryvnias banknotes
    private int fiftySum;

    // Sum of 100 hryvnias banknotes
    private int hundredSum;

    // Sum of 200 hryvnias banknotes
    private int twoHundredSum;

    // Sum of 500 hryvnias banknotes
    private int fiveHundredSum;

    // Total amount of money in the ATM
    private int moneySum;

    /**
     * Parameterized constructor to initialize the Sum object with specific quantities of banknotes.
     *
     * @param oneQuantity         Quantity of 1 hryvnia banknotes
     * @param twoQuantity         Quantity of 2 hryvnias banknotes
     * @param fiveQuantity        Quantity of 5 hryvnias banknotes
     * @param tenQuantity         Quantity of 10 hryvnias banknotes
     * @param twentyQuantity      Quantity of 20 hryvnias banknotes
     * @param fiftyQuantity       Quantity of 50 hryvnias banknotes
     * @param hundredQuantity     Quantity of 100 hryvnias banknotes
     * @param twoHundredQuantity  Quantity of 200 hryvnias banknotes
     * @param fiveHundredQuantity Quantity of 500 hryvnias banknotes
     */
    public Sum(int oneQuantity, int twoQuantity, int fiveQuantity, int tenQuantity, int twentyQuantity,
               int fiftyQuantity, int hundredQuantity, int twoHundredQuantity, int fiveHundredQuantity) {
        this.oneSum = 1 * oneQuantity;
        this.twoSum = 2 * twoQuantity;
        this.fiveSum = 5 * fiveQuantity;
        this.tenSum = 10 * tenQuantity;
        this.twentySum = 20 * twentyQuantity;
        this.fiftySum = 50 * fiftyQuantity;
        this.hundredSum = 100 * hundredQuantity;
        this.twoHundredSum = 200 * twoHundredQuantity;
        this.fiveHundredSum = 500 * fiveHundredQuantity;
        this.moneySum = this.oneSum + this.twoSum + this.fiveSum + this.tenSum + this.twentySum + this.fiftySum +
                this.hundredSum + this.twoHundredSum + this.fiveHundredSum;
    }

    /**
     * Default constructor to initialize the Sum object with zero quantities.
     */
    public Sum() {
        this.oneSum = 0;
        this.twoSum = 0;
        this.fiveSum = 0;
        this.tenSum = 0;
        this.twentySum = 0;
        this.fiftySum = 0;
        this.hundredSum = 0;
        this.twoHundredSum = 0;
        this.fiveHundredSum = 0;
        this.moneySum = 0;
    }

    // Getters

    /**
     * Gets the sum of 1 hryvnia banknotes.
     *
     * @return The sum of 1 hryvnia banknotes.
     */
    public int getOneSum() {
        return oneSum;
    }

    /**
     * Gets the sum of 2 hryvnias banknotes.
     *
     * @return The sum of 2 hryvnias banknotes.
     */
    public int getTwoSum() {
        return twoSum;
    }

    /**
     * Gets the sum of 5 hryvnias banknotes.
     *
     * @return The sum of 5 hryvnias banknotes.
     */
    public int getFiveSum() {
        return fiveSum;
    }

    /**
     * Gets the sum of 10 hryvnias banknotes.
     *
     * @return The sum of 10 hryvnias banknotes.
     */
    public int getTenSum() {
        return tenSum;
    }

    /**
     * Gets the sum of 20 hryvnias banknotes.
     *
     * @return The sum of 20 hryvnias banknotes.
     */
    public int getTwentySum() {
        return twentySum;
    }

    /**
     * Gets the sum of 50 hryvnias banknotes.
     *
     * @return The sum of 50 hryvnias banknotes.
     */
    public int getFiftySum() {
        return fiftySum;
    }

    /**
     * Gets the sum of 100 hryvnias banknotes.
     *
     * @return The sum of 100 hryvnias banknotes.
     */
    public int getHundredSum() {
        return hundredSum;
    }

    /**
     * Gets the sum of 200 hryvnias banknotes.
     *
     * @return The sum of 200 hryvnias banknotes.
     */
    public int getTwoHundredSum() {
        return twoHundredSum;
    }

    /**
     * Gets the sum of 500 hryvnias banknotes.
     *
     * @return The sum of 500 hryvnias banknotes.
     */
    public int getFiveHundredSum() {
        return fiveHundredSum;
    }

    /**
     * Gets the total amount of money in the ATM.
     *
     * @return The total amount of money in the ATM.
     */
    public int getMoneySum() {
        return moneySum;
    }

    // Setters

    /**
     * Sets the sum of 1 hryvnia banknotes.
     *
     * @param oneSum The sum of 1 hryvnia banknotes to set.
     */
    public void setOneSum(int oneSum) {
        this.oneSum = oneSum;
    }

    /**
     * Sets the sum of 2 hryvnias banknotes.
     *
     * @param twoSum The sum of 2 hryvnias banknotes to set.
     */
    public void setTwoSum(int twoSum) {
        this.twoSum = twoSum;
    }

    /**
     * Sets the sum of 5 hryvnias banknotes.
     *
     * @param fiveSum The sum of 5 hryvnias banknotes to set.
     */
    public void setFiveSum(int fiveSum) {
        this.fiveSum = fiveSum;
    }

    /**
     * Sets the sum of 10 hryvnias banknotes.
     *
     * @param tenSum The sum of 10 hryvnias banknotes to set.
     */
    public void setTenSum(int tenSum) {
        this.tenSum = tenSum;
    }

    /**
     * Sets the sum of 20 hryvnias banknotes.
     *
     * @param twentySum The sum of 20 hryvnias banknotes to set.
     */
    public void setTwentySum(int twentySum) {
        this.twentySum = twentySum;
    }

    /**
     * Sets the sum of 50 hryvnias banknotes.
     *
     * @param fiftySum The sum of 50 hryvnias banknotes to set.
     */
    public void setFiftySum(int fiftySum) {
        this.fiftySum = fiftySum;
    }

    /**
     * Sets the sum of 100 hryvnias banknotes.
     *
     * @param hundredSum The sum of 100 hryvnias banknotes to set.
     */
    public void setHundredSum(int hundredSum) {
        this.hundredSum = hundredSum;
    }

    /**
     * Sets the sum of 200 hryvnias banknotes.
     *
     * @param twoHundredSum The sum of 200 hryvnias banknotes to set.
     */
    public void setTwoHundredSum(int twoHundredSum) {
        this.twoHundredSum = twoHundredSum;
    }

    /**
     * Sets the sum of 500 hryvnias banknotes.
     *
     * @param fiveHundredSum The sum of 500 hryvnias banknotes to set.
     */
    public void setFiveHundredSum(int fiveHundredSum) {
        this.fiveHundredSum = fiveHundredSum;
    }

    /**
     * Sets the total amount of money in the ATM.
     *
     * @param moneySum The total amount of money in the ATM to set.
     */
    public void setMoneySum(int moneySum) {
        this.moneySum = moneySum;
    }
}
package Tasks.T1.ATM.Sum;

// Класс определяющий сумму денег в банкомате состоянием на сейчас
public class Sum {

    // сумма купюр номиналом 1 гривна
    private int oneSum;

    // сумма купюр номиналом 2 гривны
    private int twoSum;

    // сумма купюр номиналом 5 гривен
    private int fiveSum;

    // сумма купюр номиналом 10 гривен
    private int tenSum;

    // сумма купюр номиналом 20 гривен
    private int twentySum;

    // сумма купюр номиналом 50 гривен
    private int fiftySum;

    // сумма купюр номиналом 100 гривен
    private int hundredSum;

    // сумма купюр номиналом 200 гривен
    private int twoHundredSum;

    // сумма купюр номиналом 500 гривен
    private int fiveHundredSum;

    // общая сумма денег в банкомате
    private int moneySum;

    // конструктор с параметрами
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

    // конструктор по умолчанию
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

    // геттеры
    public int getOneSum() {
        return oneSum;
    }

    public int getTwoSum() {
        return twoSum;
    }

    public int getFiveSum() {
        return fiveSum;
    }

    public int getTenSum() {
        return tenSum;
    }

    public int getTwentySum() {
        return twentySum;
    }

    public int getFiftySum() {
        return fiftySum;
    }

    public int getHundredSum() {
        return hundredSum;
    }

    public int getTwoHundredSum() {
        return twoHundredSum;
    }

    public int getFiveHundredSum() {
        return fiveHundredSum;
    }

    public int getMoneySum() {
        return moneySum;
    }

    // сеттеры
    public void setOneSum(int oneSum) {
        this.oneSum = oneSum;
    }

    public void setTwoSum(int twoSum) {
        this.twoSum = twoSum;
    }

    public void setFiveSum(int fiveSum) {
        this.fiveSum = fiveSum;
    }

    public void setTenSum(int tenSum) {
        this.tenSum = tenSum;
    }

    public void setTwentySum(int twentySum) {
        this.twentySum = twentySum;
    }

    public void setFiftySum(int fiftySum) {
        this.fiftySum = fiftySum;
    }

    public void setHundredSum(int hundredSum) {
        this.hundredSum = hundredSum;
    }

    public void setTwoHundredSum(int twoHundredSum) {
        this.twoHundredSum = twoHundredSum;
    }

    public void setFiveHundredSum(int fiveHundredSum) {
        this.fiveHundredSum = fiveHundredSum;
    }

    public void setMoneySum(int moneySum) {
        this.moneySum = moneySum;
    }
}
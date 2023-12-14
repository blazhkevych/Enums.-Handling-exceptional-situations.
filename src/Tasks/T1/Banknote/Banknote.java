package Tasks.T1.Banknote;

public class Banknote {

    // количество купюр для номинала ONE
    private int one;

    // количество купюр для номинала TWO
    private int two;

    // количество купюр для номинала FIVE
    private int five;

    // количество купюр для номинала TEN
    private int ten;

    // количество купюр для номинала TWENTY
    private int twenty;

    // количество купюр для номинала FIFTY
    private int fifty;

    // количество купюр для номинала HUNDRED
    private int hundred;

    // количество купюр для номинала TWO_HUNDRED
    private int twoHundred;

    // количество купюр для номинала FIVE_HUNDRED
    private int fiveHundred;

    // конструктор по умолчанию
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

    // конструктор с параметрами
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

    // геттеры
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

    // сеттеры
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
}
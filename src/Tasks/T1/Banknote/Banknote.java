package Tasks.T1.Banknote;

import Tasks.T1.Exceptions.Banknote.InvalidSumToConvertIntoBanknotesException;

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

    public static Banknote convertSumToBanknotes(int sumToLoad) throws InvalidSumToConvertIntoBanknotesException {
        // проверка переданной суммы на больше 0
        if (sumToLoad <= 0) {
            throw new InvalidSumToConvertIntoBanknotesException("Введена некорректная сумма для конвертации. Попробуйте еще раз.");
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
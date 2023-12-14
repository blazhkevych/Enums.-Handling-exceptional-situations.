package Tasks.T1.ATM;

import Tasks.T1.ATM.Sum.Sum;
import Tasks.T1.Banknote.Banknote;

/**
 * Разработать класс АТМ банкомат.
 * Сумма, которая сейчас есть в наличии в банкомате должна быть подана определенными номиналами банкнот (1, 2, 5, 10, 20, 50, 100, 200, 500 гривен).
 * Для каждого номинала банкнот определено количество купюр данного номинала.
 * Кроме этого банкомат хранит в своих полях минимальную для выдачи сумму,
 * а также максимальное количество банкнот, которое может быть выдано через окошко выдачи наличности.
 * Реализовать метод инициализации банкомата (загрузка денег в банкомат),
 * метод ручного ввода какой-то суммы через купюро приемник,
 * метод снятия денег в банкомате.
 * При определении номиналов банкнот при выдаче исходим из минимизации их количества.
 */

// Класс АТМ банкомат
public class ATM {
    // сумма, которая сейчас есть в наличии в банкомате
    private Sum sum;

    // банкноты в банкомате
    private Banknote banknotes;

    // минимальная сумма для выдачи
    private int minSum;

    // максимальное количество банкнот, которое может быть выдано через окошко выдачи наличности
    private int maxBanknotes;

    // Местоположение банкомата
    private String location;

    // пустой конструктор для создания пустого банкомата.
    public ATM() {
        this.banknotes = new Banknote();
        this.sum = new Sum();
        this.minSum = 100;
        this.maxBanknotes = 30;
        this.location = "Улица ";
    }

    // конструктор с параметрами
    public ATM(Banknote banknotes, int minSum, int maxBanknotes, String location) {
        this.banknotes = banknotes;
        this.sum = new Sum(banknotes.getOne(), banknotes.getTwo(), banknotes.getFive(), banknotes.getTen(), banknotes.getTwenty(), banknotes.getFifty(), banknotes.getHundred(), banknotes.getTwoHundred(), banknotes.getFiveHundred());
        this.minSum = minSum;
        this.maxBanknotes = maxBanknotes;
        this.location = location;
    }

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
        this.sum = new Sum(this.banknotes.getOne(), this.banknotes.getTwo(), this.banknotes.getFive(), this.banknotes.getTen(), this.banknotes.getTwenty(), this.banknotes.getFifty(), this.banknotes.getHundred(), this.banknotes.getTwoHundred(), this.banknotes.getFiveHundred());
    }

    // Получить общую сумму денег в банке
    public int getATMMoney() {
        return this.sum.getMoneySum();
    }

    // Распечатать сумму денег в банкомате в виде таблицы с количеством купюр каждого номинала и адресом банкомата
    public void printATMReport(int i) {
        System.out.println("Адрес банкомата: " + this.location + " " + i);
        System.out.println("Сумма денег в банкомате: " + this.sum.getMoneySum() + " грн.");
        System.out.println("Количество купюр каждого номинала:");
        System.out.println("1 грн. - " + this.banknotes.getOne() + " шт.");
        System.out.println("2 грн. - " + this.banknotes.getTwo() + " шт.");
        System.out.println("5 грн. - " + this.banknotes.getFive() + " шт.");
        System.out.println("10 грн. - " + this.banknotes.getTen() + " шт.");
        System.out.println("20 грн. - " + this.banknotes.getTwenty() + " шт.");
        System.out.println("50 грн. - " + this.banknotes.getFifty() + " шт.");
        System.out.println("100 грн. - " + this.banknotes.getHundred() + " шт.");
        System.out.println("200 грн. - " + this.banknotes.getTwoHundred() + " шт.");
        System.out.println("500 грн. - " + this.banknotes.getFiveHundred() + " шт.");
    }


    public void withdrawMoney(int sum) {
        if (sum >= this.minSum && sum <= this.sum.getMoneySum() && sum <= this.maxBanknotes * 500) {
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
                this.sum = new Sum(this.banknotes.getOne(), this.banknotes.getTwo(), this.banknotes.getFive(), this.banknotes.getTen(), this.banknotes.getTwenty(), this.banknotes.getFifty(), this.banknotes.getHundred(), this.banknotes.getTwoHundred(), this.banknotes.getFiveHundred());
                System.out.println("Выдано " + fiveHundred + " купюр номиналом 500 грн.");
                System.out.println("Выдано " + twoHundred + " купюр номиналом 200 грн.");
                System.out.println("Выдано " + hundred + " купюр номиналом 100 грн.");
                System.out.println("Выдано " + fifty + " купюр номиналом 50 грн.");
                System.out.println("Выдано " + twenty + " купюр номиналом 20 грн.");
                System.out.println("Выдано " + ten + " купюр номиналом 10 грн.");
                System.out.println("Выдано " + five + " купюр номиналом 5 грн.");
                System.out.println("Выдано " + two + " купюр номиналом 2 грн.");
                System.out.println("Выдано " + one + " купюр номиналом 1 грн.");
            } else {
                System.out.println("В банкомате недостаточно купюр для выдачи данной суммы.");
            }
        } else {
            System.out.println("Введена некорректная сумма. Попробуйте еще раз.");
        }
    }
}


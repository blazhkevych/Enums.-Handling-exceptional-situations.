package Tasks.T1.Bank;

import Tasks.T1.ATM.ATM;
import Tasks.T1.Banknote.Banknote;

/**
 * Разработать класс банк, которому принадлежит сеть АТМ банкоматов (должно быть поле, определяющее количество банкоматов).
 * Определить операции инициализации сети банкоматов, то есть создание банкоматов и загрузки туда определенной суммы денег.
 * Разработать метод определения общей суммы денег, которая находится в сети банкоматов.
 * <p>
 * - константное поле для хранения количества банкоматов в сети;
 * - поле для хранения массива банкоматов;
 * - метод создания банкоматов для архива (конструктор класса БАНК);
 * - метод загрузки денег в каждый банкомат из массива банкоматов
 * - метод определения общей суммы денег в сети банкоматов.
 */

public class Bank {
    // количество банкоматов в сети
    private final int ATM_COUNT = 10;
    // массив банкоматов
    private ATM[] atms;

    // конструктор класса БАНК
    public Bank() {
        atms = new ATM[ATM_COUNT];
    }

    // метод загрузки денег в каждый банкомат из массива банкоматов
    public void loadMoneyIntoAllATMs(Banknote money) {
        for (ATM atm : atms) {
            if (atm != null) {
                atm.loadMoney(money);
            }
        }
    }

    //метод определения общей суммы денег в сети банкоматов
    public int getTotalBankMoney() {
        int totalMoney = 0;
        for (ATM atm : atms) {
            if (atm != null) {
                totalMoney += atm.getATMMoney();
            }
        }
        return totalMoney;
    }

    // Распечатать полный отчет по всем банкоматам
    public void printAllATMsReport() {
        for (int i = 0; i < ATM_COUNT; i++) {
            if (atms[i] != null) {
                System.out.println("\nБанкомат № " + (i + 1) + ":");
                atms[i].printATMReport(i);
            }
        }
    }

    public void addATM(int amountOfAtm) {
        for (int i = 0; i < atms.length; i++) {
            if (atms[i] == null && amountOfAtm > 0) {
                atms[i] = new ATM();
                amountOfAtm--;
            }
        }
    }

    // метод, который будет принимать номер банкомата, с которого хотим снять деньги
    public void withdrawMoneyFromATM(int atmNumber, int sum) {
        if (atms[atmNumber - 1] != null) {
            atms[atmNumber - 1].withdrawMoney(sum);
        } else {
            System.out.println("Банкомата с таким номером не существует");
        }
    }

    // метод, который будет возвращать текущее количество банкоматов в массиве
    public int getATMCount() {
        // определяем количество банкоматов в массиве и возвращаем это значение
        int count = 0;
        for (ATM atm : atms) {
            if (atm != null) {
                count++;
            }
        }
        return count;
    }

    public void loadMoneyIntoATM(int atmNumberToLoad, Banknote banknote) {
        if (atms[atmNumberToLoad - 1] != null) {
            atms[atmNumberToLoad - 1].loadMoney(banknote);
        } else {
            System.out.println("Банкомата с таким номером не существует");
        }
    }

    public Banknote convertSumToBanknotes(int sumToLoad) {
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

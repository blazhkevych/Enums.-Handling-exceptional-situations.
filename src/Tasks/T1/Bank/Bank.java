package Tasks.T1.Bank;

import Tasks.T1.ATM.ATM;
import Tasks.T1.Banknote.Banknote;
import Tasks.T1.Exceptions.ATM.IncorrectAmountOfMoneyToIssueException;
import Tasks.T1.Exceptions.ATM.InvalidATMNumberException;
import Tasks.T1.Exceptions.Bank.InvalidNumberOfATMsInBank;

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

    // метод определения общей суммы денег в сети банкоматов
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
    public void printAllATMsReport() throws InvalidNumberOfATMsInBank {
        // Если количество банкоматов в банке равно 0, то вывести сообщение, что банкоматов нет
        if (getCurrentATMsInBank() == 0) {
            throw new InvalidNumberOfATMsInBank("В банке нет ни одного банкомата");
        }

        for (int i = 0; i < ATM_COUNT; i++) {
            if (atms[i] != null) {
                System.out.println("\nБанкомат № " + (i + 1) + ":");
                atms[i].printATMReport(i);
            }
        }
    }

    public void addATM(int amountOfAtm) throws InvalidATMNumberException {
        if (amountOfAtm > (ATM_COUNT - getCurrentATMsInBank())) {
            throw new InvalidATMNumberException("Вы пытаетесь создать больше банкоматов, чем может поместится в Банк");
        }
        if (amountOfAtm < 1) {
            throw new InvalidATMNumberException("Количество банкоматов должно быть больше 1");
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

    // метод, который будет принимать номер банкомата, с которого хотим снять деньги
    public void withdrawMoneyFromATM(int atmNumber, String sum) throws InvalidATMNumberException, IncorrectAmountOfMoneyToIssueException {
        if (atmNumber < 1 || atmNumber > getCurrentATMsInBank()) {
            throw new InvalidATMNumberException("Введен некорректный номер банкомата. Попробуйте еще раз.");
        }
        // проверка переданной суммы на больше 0 и введенному число является целым
        if (!sum.matches("[0-9]+") || Integer.parseInt(sum) <= 0) {
            throw new InvalidATMNumberException("Введена некорректная сумма. Попробуйте еще раз.");
        }
        if (atms[atmNumber - 1] != null) {
            atms[atmNumber - 1].withdrawMoney(Integer.parseInt(sum));
        }
    }

    // метод, который будет возвращать текущее количество банкоматов в массиве
    public int getCurrentATMsInBank() {
        // определяем количество банкоматов в массиве и возвращаем это значение
        int count = 0;
        for (ATM atm : atms) {
            if (atm != null) {
                count++;
            }
        }
        return count;
    }

    // Возвращает максимальное количество банкоматов которое может вместить Банк.
    public int getMaxNumberATMsCanBePlacedInBank() {
        return ATM_COUNT;
    }

    public void loadMoneyIntoATM(int atmNumberToLoad, Banknote banknote) {
        if (atms[atmNumberToLoad - 1] != null) {
            atms[atmNumberToLoad - 1].loadMoney(banknote);
        } else {
            System.out.println("Банкомата с таким номером не существует");
        }
    }
}

import Tasks.T1.Bank.Bank;
import Tasks.T1.Banknote.Banknote;

import java.util.Scanner;


public class Main {
    // метод для тестирования Банка
    public static void testBank() {
        try {
            // Создаем пустой банк
            Bank bank = new Bank();

            // ДОбавляем в банк 3 АТМ
            bank.addATM(3);

            // Загружаем в банкоматы деньги
            bank.loadMoneyIntoAllATMs(new Banknote(1, 2, 3, 4, 5, 6, 7, 8, 9));

            // Выводим отчет по всем банкоматам
            bank.printAllATMsReport();

            // Выводим общую сумму денег в банке
            System.out.println("\nОбщая сумма денег в банке: " + bank.getTotalBankMoney());
            ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            // Введите номер банкомата, с которого хотите снять деньги
            ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            int atmNumber; // 3
            // Получаем текущее количество банкоматов в банке
            int currentATMsInBank = bank.getCurrentATMsInBank();
            do {
                System.out.println("\nВведите номер банкомата, с которого хотите снять деньги: ");
                Scanner sc = new Scanner(System.in);
                atmNumber = sc.nextInt();
                if (atmNumber < 1 || atmNumber > currentATMsInBank) {
                    System.out.println("Введен некорректный номер банкомата. Попробуйте еще раз.");
                }
            } while (atmNumber < 1 || atmNumber > currentATMsInBank);

            // пользователь вводит сумму до тех пор пока сумма не будет больше 0 и введенному число не будет целым
            String sum; // 898
            do {
                System.out.println("\nВведите сумму, которую хотите снять: ");
                Scanner sc = new Scanner(System.in);
                sum = sc.nextLine();
                if (sum.matches("[0-9]+") && Integer.parseInt(sum) > 0) {
                    break;
                } else {
                    System.out.println("Введена некорректная сумма. Попробуйте еще раз.");
                }
            } while (true);

            // Снимаем деньги с выбранного банкомата
            bank.withdrawMoneyFromATM(atmNumber, sum);

            // Выводим отчет по всем банкоматам
            bank.printAllATMsReport();

            // Выводим общую сумму денег в банке
            System.out.println("\nОбщая сумма денег в банке после снятия наличных: " + bank.getTotalBankMoney());

            ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            // Введите номер банкомата, в который хотите положить деньги
            ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            int atmNumberToLoad; // 3

            do {
                System.out.println("\nВведите номер банкомата, в который хотите положить деньги: ");
                Scanner sc = new Scanner(System.in);
                atmNumberToLoad = sc.nextInt();
                if (atmNumberToLoad < 1 || atmNumberToLoad > bank.getCurrentATMsInBank()) {
                    System.out.println("Введен некорректный номер банкомата. Попробуйте еще раз.");
                }
            } while (atmNumberToLoad < 1 || atmNumberToLoad > bank.getCurrentATMsInBank());

            // Введите сумму, которую хотите положить в выбранный банкомат
            int sumToLoad; // 100
            do {
                System.out.println("\nВведите сумму, которую хотите положить в выбранный банкомат: ");
                Scanner sc = new Scanner(System.in);
                sumToLoad = sc.nextInt();
                if (sumToLoad < 0) {
                    System.out.println("Введена некорректная сумма. Попробуйте еще раз.");
                }
            } while (sumToLoad < 0);

            // Метод преобразовывает интовое значение в банкноты
            Banknote banknoteToLoad = Banknote.convertSumToBanknotes(sumToLoad);

            // Ложим деньги в выбранный банкомат
            bank.loadMoneyIntoATM(atmNumberToLoad, banknoteToLoad);

            // Выводим отчет по всем банкоматам
            bank.printAllATMsReport();

            // Выводим общую сумму денег в банке
            System.out.println("\nОбщая сумма денег в банке после пополнения: " + bank.getTotalBankMoney());
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        testBank();
    }
}
package Tasks.T1.Exceptions.ATM;

// если сумма больше минимальной суммы для выдачи и
// меньше суммы денег в банкомате и меньше максимального количества банкнот,
// которое может быть выдано через окошко выдачи наличности то выдать ошибку.
public class IncorrectAmountOfMoneyToIssueException extends ATMException {
    public IncorrectAmountOfMoneyToIssueException(String message) {
        super(message);
    }
}
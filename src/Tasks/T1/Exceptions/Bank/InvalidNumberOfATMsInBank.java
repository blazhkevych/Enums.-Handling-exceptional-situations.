package Tasks.T1.Exceptions.Bank;

// Не верное количество банкоматов в банке
public class InvalidNumberOfATMsInBank extends BankException {
    public InvalidNumberOfATMsInBank(String message) {
        super(message);
    }
}
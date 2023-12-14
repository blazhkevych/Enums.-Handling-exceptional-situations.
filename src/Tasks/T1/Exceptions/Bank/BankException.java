package Tasks.T1.Exceptions.Bank;

// Исключение для ошибок, связанных с банком
public class BankException extends Exception {
    public BankException(String message) {
        super(message);
    }
}
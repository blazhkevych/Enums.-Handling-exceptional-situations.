package Tasks.T1.Exceptions.ATM;

// Исключение для ошибок, связанных с банкоматом
public class ATMException extends Exception {
    public ATMException(String message) {
        super(message);
    }
}
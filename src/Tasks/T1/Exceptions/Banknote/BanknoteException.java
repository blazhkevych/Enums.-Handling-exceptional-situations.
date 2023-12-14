package Tasks.T1.Exceptions.Banknote;

// Исключение для ошибок, связанных с банкнотами

public class BanknoteException extends Exception {
    public BanknoteException(String message) {
        super(message);
    }
}
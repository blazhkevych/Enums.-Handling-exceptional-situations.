package Tasks.T1.Exceptions.Banknote;

// некорректная сумма для конвертации в банкноты
public class InvalidSumToConvertIntoBanknotesException extends BanknoteException {
    public InvalidSumToConvertIntoBanknotesException(String message) {
        super(message);
    }
}
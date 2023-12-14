package Tasks.T1.Exceptions.Banknote;

/**
 * Exception class for errors related to an invalid sum for converting into banknotes.
 */
public class InvalidSumToConvertIntoBanknotesException extends BanknoteException {

    /**
     * Constructs an InvalidSumToConvertIntoBanknotesException with the specified detail message.
     *
     * @param message The detail message for the exception.
     */
    public InvalidSumToConvertIntoBanknotesException(String message) {
        super(message);
    }
}

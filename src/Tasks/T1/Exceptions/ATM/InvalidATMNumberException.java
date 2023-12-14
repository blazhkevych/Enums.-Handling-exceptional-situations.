package Tasks.T1.Exceptions.ATM;

/**
 * Exception class for cases where an invalid number of ATMs is provided.
 * This occurs when the number of ATMs is less than 1 or greater than 10.
 */
public class InvalidATMNumberException extends ATMException {

    /**
     * Constructs an InvalidATMNumberException with the specified detail message.
     *
     * @param message The detail message for the exception.
     */
    public InvalidATMNumberException(String message) {
        super(message);
    }
}

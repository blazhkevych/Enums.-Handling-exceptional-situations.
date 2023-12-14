package Tasks.T1.Exceptions.Bank;

/**
 * Exception class for errors related to the bank.
 */
public class BankException extends Exception {

    /**
     * Constructs a BankException with the specified detail message.
     *
     * @param message The detail message for the exception.
     */
    public BankException(String message) {
        super(message);
    }
}

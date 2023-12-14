package Tasks.T1.Exceptions.ATM;

/**
 * Exception class for errors related to the ATM.
 */
public class ATMException extends Exception {

    /**
     * Constructs an ATMException with the specified detail message.
     *
     * @param message The detail message for the exception.
     */
    public ATMException(String message) {
        super(message);
    }
}

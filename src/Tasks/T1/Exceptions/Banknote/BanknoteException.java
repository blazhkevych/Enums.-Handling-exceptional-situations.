package Tasks.T1.Exceptions.Banknote;

/**
 * Exception class for errors related to banknotes.
 */
public class BanknoteException extends Exception {

    /**
     * Constructs a BanknoteException with the specified detail message.
     *
     * @param message The detail message for the exception.
     */
    public BanknoteException(String message) {
        super(message);
    }
}

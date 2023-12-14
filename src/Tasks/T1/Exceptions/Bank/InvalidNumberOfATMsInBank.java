package Tasks.T1.Exceptions.Bank;

/**
 * Exception class for an invalid number of ATMs in the bank.
 */
public class InvalidNumberOfATMsInBank extends BankException {

    /**
     * Constructs an InvalidNumberOfATMsInBank exception with the specified detail message.
     *
     * @param message The detail message for the exception.
     */
    public InvalidNumberOfATMsInBank(String message) {
        super(message);
    }
}

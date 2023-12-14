package Tasks.T1.Exceptions.ATM;

/**
 * Exception class for cases where the amount of money to be issued is incorrect.
 * This occurs when the requested sum is less than the minimum withdrawal amount,
 * greater than the available money in the ATM, or exceeds the maximum number of banknotes
 * that can be issued through the cash withdrawal window.
 */
public class IncorrectAmountOfMoneyToIssueException extends ATMException {

    /**
     * Constructs an IncorrectAmountOfMoneyToIssueException with the specified detail message.
     *
     * @param message The detail message for the exception.
     */
    public IncorrectAmountOfMoneyToIssueException(String message) {
        super(message);
    }
}
package Tasks.T1.Exceptions.Sum;

// Исключение для ошибок, связанных с Sum
public class SumException extends Exception {
    public SumException(String message) {
        super(message);
    }
}
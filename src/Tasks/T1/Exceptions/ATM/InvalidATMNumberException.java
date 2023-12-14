package Tasks.T1.Exceptions.ATM;

// Исключение для не вернорго количества переданных банкоматов, то есть меньше 1 или больше 10
public class InvalidATMNumberException extends ATMException {
    public InvalidATMNumberException(String message) {
        super(message);
    }
}
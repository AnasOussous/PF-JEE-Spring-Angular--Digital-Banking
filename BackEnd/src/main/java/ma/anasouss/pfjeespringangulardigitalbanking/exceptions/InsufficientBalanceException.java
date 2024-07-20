package ma.anasouss.pfjeespringangulardigitalbanking.exceptions;

public class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

public class NegativeNumberException extends Exception {
    public NegativeNumberException() {
    }

    public NegativeNumberException(String message) {
        super(message);
    }

    public NegativeNumberException(String message, Throwable cause) {
        super(message, cause);
    }
}

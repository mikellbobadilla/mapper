package ar.mikellbobadilla.exception;

public class ConstructorException extends Exception {

    public ConstructorException(String message, Throwable cause) {
        super(message, cause);
    }

    public ConstructorException(String message) {
        super(message);
    }

}

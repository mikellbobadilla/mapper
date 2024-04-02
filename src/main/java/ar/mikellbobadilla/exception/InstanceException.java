package ar.mikellbobadilla.exception;

public class InstanceException extends Exception{

    public InstanceException(String message) {
        super(message);
    }

    public InstanceException(String message, Throwable cause) {
        super(message, cause);
    }

    public InstanceException(Throwable cause) {
        super(cause);
    }

    public InstanceException() {
        super();
    }
}

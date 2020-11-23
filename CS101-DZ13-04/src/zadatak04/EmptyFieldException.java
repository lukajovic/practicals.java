package zadatak04;

/**
 *
 * @author Luka
 */
public class EmptyFieldException extends Exception {

    public EmptyFieldException() {
    }

    public EmptyFieldException(String message) {
        super(message);
    }

    public EmptyFieldException(String message, Throwable cause) {
        super(message, cause);
    }

    public EmptyFieldException(Throwable cause) {
        super(cause);
    }

}

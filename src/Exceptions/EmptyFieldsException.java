package Exceptions;

/**
 *
 * @author Janam
 */
public class EmptyFieldsException extends Exception {

    /**
     * Creates a new instance of <code>EmptyFieldsException</code> without
     * detail message.
     */
    public EmptyFieldsException() {
    }

    /**
     * Constructs an instance of <code>EmptyFieldsException</code> with
     * the specified detail message.
     *
     * @param message the detail message.
     */
    public EmptyFieldsException(String message) {
        super(message);
    }

}

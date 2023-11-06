package Exceptions;

/**
 *
 * @author Janam
 */
public class CredentialException extends Exception {

    /**
     * Creates a new instance of <code>CredentialException</code> without detail
     * message.
     */
    public CredentialException() {
    }

    /**
     * Constructs an instance of <code>CredentialException</code> with the
     * specified detail message.
     *
     * @param message the detail message.
     */
    public CredentialException(String message) {
        super(message);
    }

}

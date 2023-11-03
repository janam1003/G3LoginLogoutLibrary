package Classes;

import java.io.Serializable;

/**
 * Enumeration 'MessageType' to represent different types of messages.
 *
 * @author Janam
 */
public enum MessageType implements Serializable {

    LOGIN_REQUEST,
    SIGNUP_REQUEST,
    OKAY_RESPONSE,
    SERVER_ERROR_RESPONSE,
    INCORRECT_LOGIN_RESPONSE,
    EMAIL_ALREADY_EXIST_RESPONSE,
    MAX_USER_EXCEPTION;
}

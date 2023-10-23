package Classes;

import Exceptions.EmailAlreadyExistException;
import Exceptions.IncorrectLoginException;
import Exceptions.MaxUserException;
import Exceptions.ServerErrorException;
import Exceptions.UnknownTypeException;

/**
 * Interface 'SigninSignup' for signing in and signing up users.
 *
 * @author Janam
 */
public interface SigninSignup {

    /**
     * Method for user sign-in.
     *
     * @param user The 'User' object representing the user attempting to signIn.
     *
     * @return The 'User' object representing the signed-in user.
     *
     * @throws IncorrectLoginException If the sign-in attempt fails due to
     * incorrect credentials.
     *
     * @throws ServerErrorException If a server error occurs during the signIn.
     *
     * @throws UnknownTypeException If an unknown or unexpected error occurs
     * during signIn.
     * 
     *  @throws MaxUserException If the maximum number of users is reached.
     */
    public User SignIn(User user) throws IncorrectLoginException, ServerErrorException, UnknownTypeException, MaxUserException;

    /**
     * Method for user sign-up.
     *
     * @param user The 'User' object representing the user attempting to signUp.
     *
     * @return The 'User' object representing the newly signed-up user.
     *
     * @throws ServerErrorException If a server error occurs during the signUp
     *
     * @throws EmailAlreadyExistException If the email provided for sign-up
     * already exists in the system.
     *
     * @throws UnknownTypeException If an unknown or unexpected error occurs
     * during signUp.
     * 
     *  @throws MaxUserException If the maximum number of users is reached.
     */
    public User signUp(User user) throws ServerErrorException, EmailAlreadyExistException, UnknownTypeException, MaxUserException;

}

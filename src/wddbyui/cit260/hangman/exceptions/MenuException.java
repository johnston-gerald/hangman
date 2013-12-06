package wddbyui.cit260.hangman.exceptions;

/**
 *
 * @author gerrygj
 */
public class MenuException extends Exception {  //Gerald and Lorna Lesson 11 Paired assignment - added the package and the class

    public MenuException() {
    }

    public MenuException(String message) {
        super(message);
    }

    public MenuException(String message, Throwable cause) {
        super(message, cause);
    }

    public MenuException(Throwable cause) {
        super(cause);
    }
}

package wddbyui.cit260.hangman.exceptions;

import java.io.IOException;

/**
 *
 * @author gerrygj
 */
public class FileException extends IOException {

    public FileException() {
    }

    public FileException(String message) {
        super(message);
    }

    public FileException(String message, Throwable cause) {
        super(message, cause);
    }

    public FileException(Throwable cause) {
        super(cause);
    }
}

package wddbyui.cit260.hangman.exceptions;

import java.io.FileNotFoundException;

/**
 *
 * @author gerrygj
 */
public class MissingFileException extends FileNotFoundException {

    public MissingFileException() {
    }

    public MissingFileException(String message) {
        super(message);
    }

}

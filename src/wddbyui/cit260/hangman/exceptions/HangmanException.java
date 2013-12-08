/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package wddbyui.cit260.hangman.exceptions;

/**
 *
 * @author Lorna
 */
public class HangmanException extends Exception {     //Lesson 11 Lorna Individual

    public HangmanException() {
    }

    public HangmanException(String message) {
        super(message);
    }
     public HangmanException(String message, Throwable cause) {
        super(message, cause);
    }

    public HangmanException(Throwable cause) {
        super(cause);
    }
}

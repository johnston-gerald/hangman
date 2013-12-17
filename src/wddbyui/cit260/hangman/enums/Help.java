package wddbyui.cit260.hangman.enums;

import wddbyui.cit260.hangman.interfaces.DisplayMessage;

/**
 *
 * @author gerrygj
 */
public enum Help implements DisplayMessage{
    
    WELCOME ("Welcome to the game of Hangman!\n" +
             "\n" +
             "You will be playing against the computer. The object of the game is to correctly guess all the letters of the mystery word before you are hung.\n" +
             "\n" +
             "Good Luck!!!"), 
    
    INSTRUCTIONS ("You are playing against the computer. The object of the game is to correctly guess all the letters of the mystery word before you are hung. A body part will be added to the gallows for each incorrect letter chosen.\n" +
                  "\n" +
                  "To play, please enter a letter.  You may use uppercase or lowercase. \n" +
                  "\n" +
                  "Choose well and have a long life!");
    
        String message;
    
    Help(String message) {
        this.message = message;   
    }
    
    @Override
    public String getMessage() {
        return message;
    }
}

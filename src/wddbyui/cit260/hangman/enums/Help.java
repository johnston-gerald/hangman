package wddbyui.cit260.hangman.enums;

import wddbyui.cit260.hangman.interfaces.DisplayMessage;

/**
 *
 * @author gerrygj
 */
public enum Help implements DisplayMessage{
    
    WELCOME ("\n\t***********************************************************************"
            + "\n\t* Welcome to the game of Hangman!                                     *"                            
            + "\n\t* You will be playing against the computer. The object of the game    *"
            + "\n\t* is to correctly guess all the letters of the mystery word before    *"
            + "\n\t* you are hung. Good Luck!!!                                          *"
            + "\n\t***********************************************************************"
            + "\n"), 
    
    INSTRUCTIONS ("\n\t***********************************************************************"
            + "\n\t* You are playing against the computer. The object of the game is to  *"
            + "\n\t* correctly guess all the letters of the mystery word before you are  *"
            + "\n\t* hung. Please enter a letter in uppercase or lowercase. Otherwise,   *"
            + "\n\t* enter 1 to access the menu. You can access the menu functions at    *"
            + "\n\t* any point in the game by entering the menu item number.             *"
            + "\n\t***********************************************************************"
            + "\n");
    
        String message;
    
    Help(String message) {
        this.message = message;   
    }
    
    @Override
    public String getMessage() {
        return message;
    }
}

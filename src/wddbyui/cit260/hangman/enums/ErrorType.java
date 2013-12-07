package wddbyui.cit260.hangman.enums;

import wddbyui.cit260.hangman.interfaces.DisplayMessage;

/**
 *
 * @author Lorna
 */
public enum ErrorType implements DisplayMessage{
    MENU_INPUT ("Invalid Input. Please enter a valid number selection from the menu."), 
    ONE_LETTER ("Invalid Input. Please only enter one letter at a time."), 
    ENTER_LETTER ("Invalid Input. Please enter only an uppercase or lowercase letter."), 
    MISSING_FILE ("Error. The file, words.txt, is missing."),
    INCORRECT_FILE ("Error. The file, words.txt, is not formatted properly."),
    FATAL_ERROR ("Fatal Error.  This program is terminated.  Good-bye!");  //Gerald and Lorna Lesson 11 Paired assignment
    String message;
    
    ErrorType(String message) {
        this.message = message;   
    }
    
    @Override
    public String getMessage() { 
        return message;
    }
}
    


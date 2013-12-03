package wddbyui.cit260.hangman.enums;

import wddbyui.cit260.hangman.interfaces.DisplayMessage;

/**
 *
 * @author gerrygj
 */
public enum Status implements DisplayMessage{    //Lesson 10 Paired, Lorna & Gerald
    
    PLAYING ("PLAYING"), 
    WIN_GAME ("WIN_GAME"), 
    LOSE_GAME ("LOSE_GAME"), 
    EXIT ("EXIT");
    
    String message;
    
    Status(String message) {
        this.message = message;   
    }
    
    @Override
    public String getMessage() {    //Gerald, Lesson 10 Individual
        return message;
    }
}

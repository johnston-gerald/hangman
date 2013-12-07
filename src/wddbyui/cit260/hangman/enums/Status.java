package wddbyui.cit260.hangman.enums;

import wddbyui.cit260.hangman.interfaces.DisplayMessage;

/**
 *
 * @author gerrygj
 */
public enum Status implements DisplayMessage{
    
    PLAYING ("PLAYING"), 
    WIN_GAME ("WIN_GAME"), 
    LOSE_GAME ("LOSE_GAME"), 
    EXIT ("EXIT");
    
    String message;
    
    Status(String message) {
        this.message = message;   
    }
    
    @Override
    public String getMessage() {
        return message;
    }
}

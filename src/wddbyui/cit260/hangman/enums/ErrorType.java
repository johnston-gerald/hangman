/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package wddbyui.cit260.hangman.enums;

import wddbyui.cit260.hangman.interfaces.DisplayMessage;

/**
 *
 * @author Lorna
 */
public enum ErrorType implements DisplayMessage{  //Lorna Lesson 10 Individual
    MENU_INPUT ("Invalid Input. Please enter a valid number selection from the menu."), 
    ONE_LETTER ("Invalid Input. Please only enter one letter at a time."), 
    ENTER_LETTER ("Invalid Input. Please enter only an uppercase or lowercase letter."); 
  
    
    String message;
    
    ErrorType(String message) {
        this.message = message;   
    }
    
    @Override
    public String getMessage() { 
        return message;
    }
}
    


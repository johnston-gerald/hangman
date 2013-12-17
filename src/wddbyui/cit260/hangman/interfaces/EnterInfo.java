package wddbyui.cit260.hangman.interfaces;

import wddbyui.cit260.hangman.exceptions.MenuException;

/**
 *
 * @author gerrygj
 */
public interface EnterInfo {
    
    String getCommand() throws MenuException;
}
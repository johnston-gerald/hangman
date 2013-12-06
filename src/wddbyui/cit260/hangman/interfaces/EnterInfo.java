package wddbyui.cit260.hangman.interfaces;

import wddbyui.cit260.hangman.exceptions.MenuException;

/**
 *
 * @author gerrygj
 */
public interface EnterInfo {    //interface, Gerald and Lorna, paired assignment, lesson 10
    
    String getCommand() throws MenuException;
}

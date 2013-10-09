/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hangman;

/**
 *
 * @author gerrygj
 */
public class Instructions {
    
    
    public Instructions() {
    }

public void displayInstructions () {

    String instructions = 
          "\n\t***********************************************************************"
        + "\n\t* Welcome to the game of Hangman!                                     *"                            
        + "\n\t* You will be playing against the computer. The object of the game    *"
        + "\n\t* is to correctly guess all the letters of the mystery word before    *"
        + "\n\t* you are hung. Good Luck!!!                                          *"
        + "\n\t***********************************************************************"
        + "\n";
    
    System.out.println(instructions);
}
    
}

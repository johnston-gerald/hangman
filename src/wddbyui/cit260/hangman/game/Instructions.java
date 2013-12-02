package wddbyui.cit260.hangman.game;

import java.io.Serializable;

/**
 *
 * @author gerrygj
 */
public class Instructions implements Serializable {

    public Instructions() {
    }
    
    public static String instructions =
              "\n\t***********************************************************************"
            + "\n\t* Welcome to the game of Hangman!                                     *"                            
            + "\n\t* You will be playing against the computer. The object of the game    *"
            + "\n\t* is to correctly guess all the letters of the mystery word before    *"
            + "\n\t* you are hung. Good Luck!!!                                          *"
            + "\n\t***********************************************************************"
            + "\n";

    public static String getInstructions() {
        return instructions;
    }

    public static void setInstructions(String instructions) {
        Instructions.instructions = instructions;
    }
    
}

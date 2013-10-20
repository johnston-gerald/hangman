/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hangman;

import java.util.Scanner;

/**
 *
 * @author Lorna
 */
public class OptionsMenuView {
    public char displayOptionsMenu() {
       throws java.io.IOException() {
       char optionsSelection;
       optionsSelection = '0';
     
        do {
          System.out.println("\nPlease select one of the following game options by entering the number."
                  + "\n1. Easy Game"
                  + "\n2. Medium Game"
                  + "\n3. Difficult Game"
                  + "\n4. Return to main menu");
          
          optionsSelection = (char) System.in.read();
          
       } while (optionsSelection < '1' | optionsSelection > '4');

            return (char) optionsSelection; 
         }  
       
    }
}

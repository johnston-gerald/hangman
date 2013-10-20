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
        Scanner inputScanner = new Scanner(System.in);
        ErrorHandling errorHandling = new ErrorHandling();
        
        String optionsSelection = "0";
        
        do {
          System.out.println("\nPlease select one of the following game options by entering the number."
                  + "\n\t1. Easy Game"
                  + "\n\t2. Medium Game"
                  + "\n\t3. Difficult Game"
                  + "\n\t4. Return to main menu");
          
          optionsSelection = inputScanner.next();
          
        } while (errorHandling.isInteger(optionsSelection) == false || optionsSelection.charAt(0) < '1' || optionsSelection.charAt(0));
                
                return optionsSelection.charAt(0);
    }
}

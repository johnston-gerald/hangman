/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hangman;

import java.util.Scanner;

/**
 *
 * @author gerrygj
 */
public class MainMenuView {

    public char displayMenu() {
        Scanner inputScanner = new Scanner(System.in);
        ErrorHandling errorHandling = new ErrorHandling();
        
        String menuSelection = "0";
    
        do {
            System.out.println("\nPlease enter one of the following commands:"
                + "\n\t1. Continue game"
                + "\n\t2. Display instructions"
                + "\n\t3. Change number of players"
                + "\n\t4. Select game options"  //Lorna added game options to the menu
                + "\n\t5. Start new game"
                + "\n\t6. Exit program");
            
            menuSelection = inputScanner.next();
            
        } while (errorHandling.isInteger(menuSelection) == false || menuSelection.charAt(0) < '1' || menuSelection.charAt(0) > '6');  //Lorna changed the menuSelection.charAt(0) > '5' value to '6'.
    
        return menuSelection.charAt(0);
    }
    
}

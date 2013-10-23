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
public class PlayerMenuView {

    public PlayerMenuView() {
    }
    
    public char displayMenu() {
        Scanner inputScanner = new Scanner(System.in);
        ErrorHandling errorHandling = new ErrorHandling();
        
        String menuSelection = "0";
    
        do {
            System.out.println("\nPlease enter one of the following commands:"
                + "\n\t1. One player (vs computer)"
                + "\n\t2. Two player");
            
            menuSelection = inputScanner.next();
            
        } while (errorHandling.isInteger(menuSelection) == false || menuSelection.charAt(0) < '1' || menuSelection.charAt(0) > '2');
    
        return menuSelection.charAt(0);
    }
    
}

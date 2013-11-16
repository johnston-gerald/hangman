package hangman;

import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author gerrygj
 */
public class MainMenuView implements Serializable {

    public MainMenuView() {
    }

    public char displayMenu() {
        Scanner inputScanner = new Scanner(System.in);
        
        String menuSelection = "0";
    
        do {
            System.out.println("\nPlease enter one of the following commands:"
                + "\n\t1. Continue game"
                + "\n\t2. Display instructions"
                + "\n\t3. Exit program");
            
            menuSelection = inputScanner.next();
            
        } while (ErrorHandling.isInteger(menuSelection) == false || menuSelection.charAt(0) < '1' || menuSelection.charAt(0) > '3');  //Lorna made changes
    
        return menuSelection.charAt(0);
    }
    
}

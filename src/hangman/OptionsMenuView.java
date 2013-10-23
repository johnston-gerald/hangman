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
    
       public char displayOptionsView() {

           Scanner inputScanner = new Scanner(System.in);

           ErrorHandling errorHandling = new ErrorHandling();
           
           String optionsSelection = "0";
     
        do {
          System.out.println("\nPlease select one of the following game options by entering the number."
                  + "\n1. Easy Game"
                  + "\n2. Medium Game"
                  + "\n3. Difficult Game"
                  + "\n4. Return to main menu");
         
          optionsSelection = inputScanner.next();
          
       } while (optionsSelection.charAt(0) < '1' | optionsSelection.charAt(0) > '4');

            return (optionsSelection.charAt(0)); 
         }  
       
    }


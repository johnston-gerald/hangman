/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hangman;

/**
 *
 * @author BDawg
 */
public class MenuView {
    void option(int num){
        switch(num){
            case '1':
                break;
                
            case '2':
                break;
                
            case '3':
                break;
                
            case '4':
                Instructions instructions = new Instructions();
                instructions.displayInstructions();
                break;
                
            case '5':
                break;
                
            case '6':
                break;
                
        }
    }
    
void showMenu(){

        System.out.println("\t\t Hangman Menu:");
        System.out.println("\t  1. New Game");
        System.out.println("\t  2. Statistics");
        System.out.println("\t  3. Help");
        System.out.println("\t  4. Instructions");
        System.out.println("\t  5. Exit Menu");
        System.out.println("\t  6. Exit Game");        
        System.out.println("\tChoose a corresponding number or 5 to exit the menu: " 
        + "\nHere is some math for the assignment: 8 * 8 = " + 8 * 8 );
    }

boolean isvalid(int i) {
        if(i < '1' | i > '6') return false;
        else return true;
    }
}
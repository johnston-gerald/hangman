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
public class Hangman {

    String name;
    
    public Hangman() {
    }

    public static void main(String[] args) {
        Hangman hangman = new Hangman();
        hangman.getName();
       
        hangman.displayName();
        Instructions instructions = new Instructions();
        instructions.displayInstructions();
        
        Game game = new Game();
        game.playTheGame();
    }
    
    public void getName() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");
        this.name = input.next();
    }
    
    public void displayName() {
        
        System.out.println("\nWelcome " +this.name);
    }
    

}

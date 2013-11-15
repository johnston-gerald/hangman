package hangman;

import java.util.Scanner;

/**
 *
 * @author gerrygj
 */
public class Hangman {

    private String name;
    
    public static void main(String[] args) {
        Hangman hangman = new Hangman();
        hangman.getName();
       
        hangman.displayName();
        Instructions instructions = new Instructions();
        instructions.displayInstructions();
        
        Game game = new Game();
        game.playTheGame();
    }
    
    private void getName() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");
        this.name = input.next();
    }
    
    private void displayName() {
        
        System.out.println("\nWelcome " +this.name);
    }

}

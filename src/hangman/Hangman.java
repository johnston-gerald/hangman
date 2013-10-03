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
    String instructions = 
          "\n\t***********************************************************************"
        + "\n\t* Welcome to the game of Hangman!                                     *"                            
        + "\n\t* You will be playing against the computer. The object of the game    *"
        + "\n\t* is to correctly guess all the letters of the mystery word before    *"
        + "\n\t* you are hung. Good Luck!!!                                          *"
        + "\n\t***********************************************************************"
        + "\n";

    public Hangman() {
    }

    public static void main(String[] args) {
        Hangman hangman = new Hangman();
        hangman.getName();
        hangman.displayHelp();
        
        Gallows gallows = new Gallows();
        gallows.displayGallows();

        MysteryWord mysteryWord = new MysteryWord();
        mysteryWord.displayMysteryWord();
        
        Alphabet alphabet = new Alphabet();
        alphabet.displayAlphabet();
    }
    
    public void getName() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");
        this.name = input.next();
    }
    
    public void displayHelp() {
        System.out.println("\nWelcome " +this.name);
        System.out.println(this.instructions);
    }
    

}

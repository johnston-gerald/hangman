/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hangman;

/**
 *
 * @author gerrygj
 */
public class Hangman {

    String welcomeMsg = 
          "\n\t***********************************************************************"
        + "\n\t* Welcome to the game of Hangman!                                     *"                            
        + "\n\t* You will be playing against the computer. The object of the game    *"
        + "\n\t* is to correctly guess all the letters of the mystery word before    *"
        + "\n\t* you are hung.                                                       *" 
        + "\n\t*                                                                     *"
        + "\n\t* Good Luck!!!                                                        *"
        + "\n\t***********************************************************************"
        + "\n";

    public Hangman() {
    }

    public static void main(String[] args) {
        Hangman hangman = new Hangman();
        hangman.display();
        
        Gallows gallows = new Gallows();
        gallows.displayGallows();

        MysteryWord mysteryWord = new MysteryWord();
        mysteryWord.displayMysteryWord();
        
        Alphabet alphabet = new Alphabet();
        alphabet.displayAlphabet();
    }
    
    private void display() {
        System.out.println(this.welcomeMsg);
    }
    

}

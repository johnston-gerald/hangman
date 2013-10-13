/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hangman;

public class Game {

   
    public Game() {
    }

    public void displayWinningMessage () {
        System.out.println(
             "\n\t*******************************************************************************"
             + "\n\t Congratulations. You win!"
             + "\n\t*******************************************************************************");
    }

    public void displayLosingMessage () {
        System.out.println(
             "\n\t*******************************************************************************"
             + "\n\t Sorry. You lose. Better luck next time!" 
             + "\n\t*******************************************************************************");
    }

    public void playTheGame () {
        
        MysteryWord mysteryWord = new MysteryWord();

        Gallows gallows = new Gallows();
        gallows.displayGallows(mysteryWord.guessesLeft());
        
        Alphabet alphabet = new Alphabet();
        alphabet.makeAlphabet();
        alphabet.displayAlphabet('_');
        
        mysteryWord.displayMysteryWord('_');
        
        char mysteryLetter;
                
        while (mysteryWord.winGame() == false && mysteryWord.loseGame() == false){
            
            mysteryLetter = mysteryWord.getLetter();
            
            if (mysteryLetter == '1') {
                System.out.println("We will eventually build a real menu."); //this will be replaced with call to the menu class
            }
            else {
                gallows.displayGallows(mysteryWord.guessesLeft());
                alphabet.displayAlphabet(mysteryLetter);
                mysteryWord.displayMysteryWord(mysteryLetter);
                System.out.println("You have " + mysteryWord.guessesLeft() + " wrong letters until you die.");
            }
        }
        
        if (mysteryWord.winGame()){
            displayWinningMessage();
        }
        else {
            gallows.displayGallows(mysteryWord.guessesLeft());
            displayLosingMessage();
        }
        
    }
}

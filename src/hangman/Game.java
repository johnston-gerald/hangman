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
            "\n*******************************************************************************"
          + "\n Congratulations. You win!"
          + "\n*******************************************************************************");
    }

    public void displayLosingMessage () {
        System.out.println(
            "*******************************************************************************"
        + "\n Sorry. You lose. Better luck next time!" 
        + "\n*******************************************************************************");
    }

    public void playTheGame () {
        
        MysteryWord mysteryWord = new MysteryWord();
        Gallows gallows = new Gallows();
        Alphabet alphabet = new Alphabet();
        MainMenuView mainMenuView = new MainMenuView();
        MainMenuControl mainMenuControl = new MainMenuControl();
        ErrorHandling errorHandling = new ErrorHandling();
        
        char mysteryLetter = '_';
        alphabet.makeAlphabet();
        String mysteryWordOutput;

        gallows.displayGallows(mysteryWord.guessesLeft());
        alphabet.displayAlphabet('_');
        System.out.println(mysteryWord.displayMysteryWord('_'));
        
        while (mysteryWord.winGame() == false && mysteryWord.loseGame() == false){
            
            mysteryLetter = mysteryWord.getLetter();
            mysteryWordOutput = mysteryWord.displayMysteryWord(mysteryLetter);
            
            if (mysteryLetter == '1') {
                mainMenuControl.activateControl(mainMenuView.displayMenu());
            }
            
            if (mysteryLetter == '4' || mainMenuControl.startNewGame) {
                mainMenuControl.resetNewGame();
                //System.out.println("\n***New game started***\n");
                System.out.println("\n***Eventually this will start a new game***\n"); //still need to figrue this one out
                break;
            }
            
            if (mysteryLetter == '5' || mainMenuControl.exitGame()) {
                System.out.println("\nGoodbye");
                break;
            }
            
            if (mysteryLetter >= '2'&& mysteryLetter <= '5') {
                mainMenuControl.activateControl(mysteryLetter);
            }
            else {
                gallows.displayGallows(mysteryWord.guessesLeft());
                alphabet.displayAlphabet(mysteryLetter);
                System.out.println("You have " + mysteryWord.guessesLeft() + " wrong letters until you die.\n");
                System.out.print("Mystery word: " + mysteryWordOutput + "\n");
            }
        }
        
        if (mysteryWord.winGame()){
            displayWinningMessage();
        }
        else {
            if (mysteryWord.loseGame()) {
                gallows.displayGallows(mysteryWord.guessesLeft());
                displayLosingMessage();
            }
        }
        
    }
}

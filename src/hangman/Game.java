package hangman;

public class Game {

    public void playTheGame () {
        
        MysteryWord mysteryWord = new MysteryWord();
        Gallows gallows = new Gallows();
        Alphabet alphabet = new Alphabet();
        MainMenuView mainMenuView = new MainMenuView();
        MainMenuControl mainMenuControl = new MainMenuControl();
        ErrorHandling errorHandling = new ErrorHandling();
        
        char mysteryLetter;
        String mysteryWordOutput;

        gallows.displayGallows(mysteryWord.guessesLeft());
        alphabet.displayAlphabet();
        System.out.println(mysteryWord.displayMysteryWord('_'));
        
        while (!mysteryWord.winGame() && !mysteryWord.loseGame()){
            
            mysteryLetter = mysteryWord.getLetter();
            mysteryWordOutput = mysteryWord.displayMysteryWord(mysteryLetter);
            
            if (mysteryLetter == '1') {
                mainMenuControl.activateControl(mainMenuView.displayMenu());
            }
            
            if (mysteryLetter == '3' || mainMenuControl.exitGame()) {
                System.out.println("\nGoodbye");
                break;
            }
            
            if (mysteryLetter >= '2'&& mysteryLetter <= '3') {
                mainMenuControl.activateControl(mysteryLetter);
            }
            else {
                gallows.displayGallows(mysteryWord.guessesLeft());
                alphabet.setLetter(mysteryLetter);
                alphabet.displayAlphabet();
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
    
    private void displayWinningMessage () {
        System.out.println(
            "\n*******************************************************************************"
          + "\n Congratulations. You win!"
          + "\n*******************************************************************************");
    }

    private void displayLosingMessage () {
        System.out.println(
            "*******************************************************************************"
        + "\n Sorry. You lose. Better luck next time!" 
        + "\n*******************************************************************************");
    }

}

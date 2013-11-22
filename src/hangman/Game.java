package hangman;

import java.io.IOException;
import java.io.Serializable;

public class Game implements Serializable {

    public Game() {
    }
    
    public void playTheGame () throws IOException {
        
        MysteryWord mysteryWord = new MysteryWord();
        Gallows gallows = new Gallows();
        Alphabet alphabet = new Alphabet();
        MainMenuView mainMenuView = new MainMenuView();
        MainMenuControl mainMenuControl = new MainMenuControl();
        
        char mysteryLetter;
        String mysteryWordOutput;

        gallows.displayGallows(mysteryWord.getNumberOfGuesses());
        alphabet.displayAlphabet();
        System.out.println(mysteryWord.displayMysteryWord('_'));
        
        while (!mysteryWord.winGame() && !mysteryWord.loseGame()){
            
            mysteryLetter = mysteryWord.getLetter();
            mysteryWordOutput = mysteryWord.displayMysteryWord(mysteryLetter);
            
            if (mysteryLetter == '1') {
                mainMenuView.getMainMenuItem();
            }
            
            if (mysteryLetter == '3') {
                mainMenuControl.setExitProgram(true);
            }
                
            if (mainMenuControl.isExitProgram()) {
                System.out.println("\nGoodbye");
                break;
            }
            
            if (mysteryLetter >= '2'&& mysteryLetter <= '3') {
                mainMenuControl.activateControl(mysteryLetter);
            }
            else {
                gallows.displayGallows(mysteryWord.getNumberOfGuesses()); 
                alphabet.setLetter(mysteryLetter);
                alphabet.displayAlphabet();
                System.out.println("You have " + mysteryWord.getNumberOfGuesses() + " wrong letters until you die.\n");
                System.out.print("Mystery word: " + mysteryWordOutput + "\n");
            }
        }
        
        if (mysteryWord.winGame()){
            displayWinningMessage();
        }
        else {
            if (mysteryWord.loseGame()) {
                gallows.displayGallows(mysteryWord.getNumberOfGuesses());
                displayLosingMessage();
            }
        }
    }
    
    class Gallows {
            
    private void displayGallows(int gallowsChoice) {  

        switch(gallowsChoice){
            case 6:
                System.out.println("\t------------"
                               + "\n\t|          |"
                               + "\n\t|          |"
                               + "\n\t|"
                               + "\n\t|" 
                               + "\n\t|"
                               + "\n\t|"
                               + "\n\t|"
                               + "\n\t|"
                               + "\n\t|"
                               + "\n");
            break;
            
            case 5:
                System.out.println("\t------------"
                               + "\n\t|          |"
                               + "\n\t|          |"
                               + "\n\t|          O"
                               + "\n\t|" 
                               + "\n\t|"
                               + "\n\t|"
                               + "\n\t|"
                               + "\n\t|"
                               + "\n\t|"
                               + "\n");
            break;
                
            case 4:
                System.out.println("\t------------"
                               + "\n\t|          |"
                               + "\n\t|          |"
                               + "\n\t|          O"
                               + "\n\t|          |" 
                               + "\n\t|          |"
                               + "\n\t|"
                               + "\n\t|"
                               + "\n\t|"
                               + "\n\t|"
                               + "\n");
            break;
            
            case 3:
                System.out.println("\t------------"
                               + "\n\t|          |"
                               + "\n\t|          |"
                               + "\n\t|          O"
                               + "\n\t|         /|" 
                               + "\n\t|          |"
                               + "\n\t|"
                               + "\n\t|"
                               + "\n\t|"
                               + "\n\t|"
                               + "\n");
            break;
            
            case 2:
                System.out.println("\t------------"
                               + "\n\t|          |"
                               + "\n\t|          |"
                               + "\n\t|          O"
                               + "\n\t|         /|\\" 
                               + "\n\t|          |"
                               + "\n\t|"
                               + "\n\t|"
                               + "\n\t|"
                               + "\n\t|"
                               + "\n");
            break;
            
            case 1:
                System.out.println("\t------------"
                               + "\n\t|          |"
                               + "\n\t|          |"
                               + "\n\t|          O"
                               + "\n\t|         /|\\" 
                               + "\n\t|          |"
                               + "\n\t|         /"
                               + "\n\t|"
                               + "\n\t|"
                               + "\n\t|"
                               + "\n");
            break;
            
            case 0:
                System.out.println("\t------------"
                               + "\n\t|          |"
                               + "\n\t|          |"
                               + "\n\t|          O"
                               + "\n\t|         /|\\" 
                               + "\n\t|          |"
                               + "\n\t|         / \\"
                               + "\n\t|"
                               + "\n\t|"
                               + "\n\t|"
                               + "\n");
            break;
            
            default:
                System.out.println();
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

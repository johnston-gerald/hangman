package wddbyui.cit260.hangman.game;

import wddbyui.cit260.hangman.words.Alphabet;
import wddbyui.cit260.hangman.words.MysteryWord;
import wddbyui.cit260.hangman.menus.MainMenuControl;
import wddbyui.cit260.hangman.menus.MainMenuView;
import java.io.IOException;
import java.io.Serializable;
import wddbyui.cit260.hangman.enums.Status;

public class Game implements Serializable {

    private Status status;  //Lesson 10 Paired, Lorna & Gerald
    
    public Game() {
    }
    
    public void playTheGame () throws IOException {
        
        MysteryWord mysteryWord = new MysteryWord();
        Gallows gallows = new Gallows();
        Alphabet alphabet = new Alphabet();
        MainMenuView mainMenuView = new MainMenuView();
        MainMenuControl mainMenuControl = new MainMenuControl();

        this.setStatus(Status.PLAYING); //Lesson 10 Paired, Lorna & Gerald
        char mysteryLetter;
        String mysteryWordOutput;

        gallows.displayGallows(mysteryWord.getNumberOfGuesses());
        alphabet.displayArray();
        System.out.println(mysteryWord.displayMysteryWord('_'));
        
        while (status == Status.PLAYING){   //Lesson 10 Paired, Lorna & Gerald
            
            mysteryLetter = mysteryWord.getLetter();
            mysteryWordOutput = mysteryWord.displayMysteryWord(mysteryLetter);
            
            if (mysteryLetter == '1') {
                this.setStatus(mainMenuView.getMainMenuItem());
            }
            
            if (mysteryLetter == '3') {
                this.setStatus(Status.EXIT);
            }
                
            if (status == Status.EXIT) {
                System.out.println("\nGoodbye");
                break;
            }
            
            if (mysteryLetter >= '2'&& mysteryLetter <= '3') {
                mainMenuControl.activateControl(mysteryLetter);
            }
            else {
                gallows.displayGallows(mysteryWord.getNumberOfGuesses()); 
                alphabet.setLetter(mysteryLetter);
                alphabet.displayArray();
                System.out.println("You have " + mysteryWord.getNumberOfGuesses() + " wrong letters until you die.\n");
                System.out.print("Mystery word: " + mysteryWordOutput + "\n");
            }
            
            this.setStatus(mysteryWord.winOrLose());
        }
        
        if (this.getStatus() == Status.WIN_GAME){   //Lesson 10 Paired, Lorna & Gerald
            displayWinningMessage();
        }
        else {
            if (this.getStatus() == Status.LOSE_GAME) { //Lesson 10 Paired, Lorna & Gerald
                gallows.displayGallows(mysteryWord.getNumberOfGuesses());
                displayLosingMessage();
            }
        }
    }

    public Status getStatus() { //Lesson 10 Paired, Lorna & Gerald
        return status;
    }

    public void setStatus(Status status) {  //Lesson 10 Paired, Lorna & Gerald
        this.status = status;
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

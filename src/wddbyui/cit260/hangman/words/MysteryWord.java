package wddbyui.cit260.hangman.words;

import wddbyui.cit260.hangman.menus.MainMenuView;
import java.io.IOException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Scanner;
import wddbyui.cit260.hangman.enums.ErrorType;
import wddbyui.cit260.hangman.game.ErrorHandling;
import wddbyui.cit260.hangman.enums.Status;
import wddbyui.cit260.hangman.exceptions.HangmanException;

/**
 *
 * @author gerrygj
 */
public class MysteryWord implements Serializable {

    private WordList wordList = new WordList();
    private String mysteryWord = wordList.getWordList()[0];
    private char[] mysteryArray = new char[mysteryWord.length()];
    private char[] wordArray = new char[mysteryWord.length()];
    private int numberOfGuesses = 6;
    
    public MysteryWord() throws IOException {
        for(int i = 0; i < mysteryArray.length; i++) {
            mysteryArray[i] = '_';
        }
    }

    public char getLetter() throws HangmanException {
        Scanner letterScanner = new Scanner(System.in);
        MainMenuView mainMenuView = new MainMenuView();
    
        String letter = "0";
        
        boolean valid = false;

        while (!valid) {
            System.out.println("Please enter a letter or enter 1 for the menu: ");
        try {
            letter = letterScanner.next();
                      
            if (letter.charAt(0) >= '1' && letter.charAt(0) <= '3') { //menu
                return letter.charAt(0);
            }
         
            if (letter.length() != 1) {
                System.out.println("\n" + ErrorType.ONE_LETTER.getMessage() + "\n");
                continue;
            }
            
            if (!ErrorHandling.isChar(letter)) {
                System.out.println("\n" + ErrorType.ENTER_LETTER.getMessage() + "\n");
                continue;
            }

            valid = true;
            
            throw new HangmanException();
            
         } catch(HangmanException exc) {
            System.out.println("\n" + ErrorType.ENTER_LETTER.getMessage() + "\n");
        }           
        }

        return Character.toLowerCase(letter.charAt(0));
    }
    
    public String displayMysteryWord (char letter) {
    
        wordArray = mysteryWord.toCharArray();
        String mysteryWordOutput = "";
        boolean correctLetter = false;
    
        if (letter == '_' || letter == '1'){
    
            correctLetter = true;
        }

        for(int i = 0; i < wordArray.length; i++) {
        
            if (Character.toLowerCase(wordArray[i]) == letter) {
                mysteryArray[i] = wordArray[i];
                correctLetter = true;
            }

            mysteryWordOutput = mysteryWordOutput + mysteryArray[i] + " ";
        }
    
        if (correctLetter == false) {
            numberOfGuesses--;
        }
    
        //mysteryWordOutput = mysteryWordOutput + "(" + mysteryWord.length() + " letters)";
        return mysteryWordOutput;
    }

    public int getNumberOfGuesses() {
        return numberOfGuesses;
    }

    public void setNumberOfGuesses(int numberOfGuesses) {
        this.numberOfGuesses = numberOfGuesses;
    }

    public Status winOrLose(){
        
        if (Arrays.equals(wordArray, mysteryArray)){
            return Status.WIN_GAME;
        }
        else if (numberOfGuesses < 1) {
            return Status.LOSE_GAME;
        }
        
        return Status.PLAYING;
    }    
    
}

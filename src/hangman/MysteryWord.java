package hangman;

import java.io.IOException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Scanner;

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

    public char getLetter() {
        Scanner letterScanner = new Scanner(System.in);
        MainMenuView mainMenuView = new MainMenuView();
    
        String letter = "0";
        
        boolean valid = false;
        while (!valid) {
            System.out.println("Please enter a letter or enter 1 for the menu: ");
        
            letter = letterScanner.next();
            
            if (letter.length() != 1) {
                System.out.println("\nInvalid input.\n");
                continue;
            }
            
            if (letter.charAt(0) >= '1' && letter.charAt(0) <= '3') { //menu
                return letter.charAt(0);
            }
            
            if (!ErrorHandling.isChar(letter)) {
                System.out.println("\nInvalid input.\n");
                continue;
            }
            
            valid = true;
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
    
        mysteryWordOutput = mysteryWordOutput + "(" +mysteryWord.length() +" letters)";
        return mysteryWordOutput;
    }

    public int getNumberOfGuesses() {
        return numberOfGuesses;
    }

    public void setNumberOfGuesses(int numberOfGuesses) {
        this.numberOfGuesses = numberOfGuesses;
    }


    public boolean winGame () {
    
        if (Arrays.equals(wordArray, mysteryArray)){
            return true;
        }
        else {
            return false;
        }
    }

    public boolean loseGame () {
    
        if (numberOfGuesses < 1){
            return true;
        }
        else {
            return false;
        }
    }

}

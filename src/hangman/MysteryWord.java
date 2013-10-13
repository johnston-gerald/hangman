/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hangman;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author gerrygj
 */
public class MysteryWord {

    String mysteryWord = getWord();
    char[] mysteryArray = new char[mysteryWord.length()];
    char[] wordArray = new char[mysteryWord.length()];
    int numberOfGuesses = 6+1; // we could have a difficulty setting that changes this value
    
    public MysteryWord() {
        for(int i = 0; i < mysteryArray.length; i++) {
            mysteryArray[i] = '_';
        }
    }

public char getLetter() {
    Scanner letterScanner = new Scanner(System.in);
    char letter = '0';
    
    do {
        //System.out.println("Please enter a letter or enter 1 for the menu: ");
        
        // Added a tab escape and a math operator for the assignment. It will be deleted later. The original line is above this one.
        System.out.println("\tPlease enter a letter or enter " + (100-99) + " for the menu: ");
        
        letter = letterScanner.next().charAt(0);
    } while (Character.isLetter(letter) == false && letter != '1');
    
    return letter;
}
    
public String getWord() {
    String hangmanWord = "mississippi"; // we will need to modify this so it uploads a random word from a file
    return hangmanWord;
}    

public void displayMysteryWord (char letter) {
    
    wordArray = mysteryWord.toCharArray(); //type conversion
    boolean correctLetter = false;
    
    System.out.print("Mystery word: ");
    
    for(int i = 0; i < wordArray.length; i++) {
        
        if (wordArray[i] == letter) {
            mysteryArray[i] = letter;
            correctLetter = true;
        }
        
        System.out.print(mysteryArray[i] + " ");
        
    }
    
    if (correctLetter == false) {
        numberOfGuesses--;
    }
    
    System.out.print("(" +mysteryWord.length() +" letters)\n");
}

public int guessesLeft(){
    return numberOfGuesses;
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
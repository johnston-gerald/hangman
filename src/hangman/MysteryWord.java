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
    int numberOfGuesses = 5; // we could have a difficulty setting that changes this value
    int count = 0;
    
    public MysteryWord() {
        for(int i = 0; i < mysteryArray.length; i++) {
            mysteryArray[i] = '_';
        }
    }

public char getLetter() {
    Scanner letterScanner = new Scanner(System.in);
    char letter = '0';
    
    do {
        System.out.println("Please enter a letter or enter 1 for the menu: ");
        letter = letterScanner.next().charAt(0);
    } while (Character.isLetter(letter) == false && letter != '1');
    
    return letter;
}
    
public String getWord() {
    String hangmanWord = "mississippi"; // we will need to modify this later so it uploads a random word from a file
    return hangmanWord;
}    

public void displayMysteryWord (char letter) {
    
    wordArray = mysteryWord.toCharArray();
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
        count++;
    }
    
    System.out.print("(" +mysteryWord.length() +" letters)\n");
}

public void guessesLeft(){
    System.out.println("You have " + (numberOfGuesses - count +1) + " guesses left.");
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
    
    if (count > numberOfGuesses){
        return true;
    }
    else {
        return false;
    }
}

}
package wddbyui.cit260.hangman.words;

import java.io.Serializable;
import wddbyui.cit260.hangman.interfaces.DisplayArray;

/**
 *
 * @author gerrygj
 */

public class Alphabet implements Serializable, DisplayArray {

    public Alphabet() {
    }

    // The array to contain the alphabet
    private char[] alphabetArray = "abcdefghijklmnopqrstuvwxyz".toCharArray();
    private char letter = '_';
    
    @Override
    public void displayArray () {  //Lorna Lesson 10 individual
    
        System.out.println("Remaining Letters:");
    
        for(int i = 0; i < alphabetArray.length; i++) {
        
            if (alphabetArray[i] == letter) {
                alphabetArray[i] = '_';
            }
        
            System.out.print(alphabetArray[i] + " ");
        }
    
        System.out.print("\n\n");
        
    }

    public char[] getAlphabetArray() {
        return alphabetArray;
    }

    public void setAlphabetArray(char[] alphabetArray) {
        this.alphabetArray = alphabetArray;
    }

    public char getLetter() {
        return letter;
    }

    public void setLetter(char letter) {
        this.letter = letter;
    }

}
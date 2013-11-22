package hangman;

import java.io.Serializable;

/**
 *
 * @author gerrygj
 */

public class Alphabet implements Serializable {

    public Alphabet() {
    }

    // The array to contain the alphabet
    private char[] alphabetArray = "abcdefghijklmnopqrstuvwxyz".toCharArray();
    private char letter = '_';
    
    public void displayAlphabet () {
    
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
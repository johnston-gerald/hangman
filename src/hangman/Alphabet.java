/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hangman;

/**
 *
 * @author gerrygj
 */
public class Alphabet {

    // The array to contain the alphabet
    char[] alphabetArray = new char[26];
        
    public Alphabet() {
    }

public void displayAlphabet () {
    
    alphabetArray= "abcdefghijklmnopqrstuvwxyz".toCharArray();
    
    System.out.println("Remaining Letters:");
    
    for(int i = 0; i < 26; i++) {
         System.out.print(alphabetArray[i] + " ");
    }
    
    System.out.print("\n");
        
}

}
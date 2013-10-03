/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hangman;

/**
 *
 * @author gerrygj
 */
public class MysteryWord {

    String wordString;
    char[] wordArray;
        
    public MysteryWord() {
    }

public void displayMysteryWord () {
    
    wordString = "mississippi"; // This is just a dummy word. Eventually this will load from a text file
    // wordArray = new char[wordString.length()];
    // wordArray = wordString.toCharArray();
    
    System.out.print("Mystery word: ");
    
    for(int i = 0; i < wordString.length(); i++) {
         System.out.print("_" + " ");
    }
    
    System.out.print("(" +wordString.length() +" letters)");
    System.out.println("\n");
}

}
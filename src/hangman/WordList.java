package hangman;

import java.io.IOException;
import java.io.Serializable;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gerrygj
 */

//Lesson 8 Paired Assignment - Lorna & Gerald
public class WordList implements Serializable {

    public WordList() {
    }

    private String[] wordList = null;
    
    private void makeList() {
        FileArrayProvider fap = new FileArrayProvider();
        try {
            wordList = fap.readLines("src/hangman/words.txt");
        } catch (IOException ex) {
            Logger.getLogger(WordList.class.getName()).log(Level.SEVERE, null, ex);
        }
        /*for (String line : wordList) { //display the list (array) of words - use for testing only
            System.out.println(line);
        }*/
    }
    
    public void randomizeList() {
        // Implementing Fisher–Yates shuffle
        this.makeList();
        Random rnd = new Random();
        for (int i = 0; i < wordList.length-1; i++) {
            int index = rnd.nextInt(i + 1);
            // Simple swap
            String a = wordList[index];
            wordList[index] = wordList[i];
            wordList[i] = a;
        }
    }
    
    // this function is just for testing
    public void displayWordList(String[] words) {
        System.out.println("\n\t===============================================================");
        System.out.println("\tHere is the randomized list of words:");

        for (int i = 0; i < words.length; i++) {
            if (words[i] == null) {
                break;
            }
                
            System.out.println("\t    " + words[i]);
        }
        System.out.println("\t===============================================================\n");
    }

    public String[] getWordList() {
        this.randomizeList();
        return wordList;
    }

    public void setWordList(String[] wordList) {
        this.wordList = wordList;
    }
    
}

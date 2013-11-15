package hangman;

import java.io.IOException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gerrygj
 */
public class WordList {

    public String[] makeList() {
        FileArrayProvider fap = new FileArrayProvider();
        String[] wordList = null;
        try {
            wordList = fap
           .readLines("src/hangman/words.txt");
        } catch (IOException ex) {
            Logger.getLogger(WordList.class.getName()).log(Level.SEVERE, null, ex);
        }
        /*for (String line : wordList) { //display the list (array) of words - use for testing only
            System.out.println(line);
        }*/
        return wordList;
    }
    
    public String[] randomizeList(String[] words) {
        // Implementing Fisher–Yates shuffle
        Random rnd = new Random();
        for (int i = 0; i < words.length-1; i++) {
            int index = rnd.nextInt(i + 1);
            // Simple swap
            String a = words[index];
            words[index] = words[i];
            words[i] = a;
        }
       
        return words;
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
    
}

package wddbyui.cit260.hangman.words;

import java.io.IOException;
import wddbyui.cit260.hangman.interfaces.DisplayArray;

/**
 *
 * @author gerrygj
 */

//coverted to sub-class by Gerald for Lesson 9
public class WordList extends FileArrayProvider implements DisplayArray {
    
    private static final String filename = "src/wddbyui/cit260/hangman/words/words.txt";
    
    public WordList() throws IOException {
        super(WordList.filename);
        this.randomizeList();
       // this.displayArray(); //for testing only
    }
    
    // this function is just for testing

    @Override
    public void displayArray() {  //Lorna Lesson 10 individual
        System.out.println("\n\t===============================================================");
        System.out.println("\tHere is the randomized list of words:");

        for (int i = 0; i < wordList.length; i++) {
            if (wordList[i] == null) {
                break;
            }
                
            System.out.println("\t    " + wordList[i]);
        }
        System.out.println("\t===============================================================\n");
    }

    public String[] getWordList() {
        return wordList;
    }

}

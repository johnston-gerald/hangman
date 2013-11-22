package hangman;

import java.io.IOException;

/**
 *
 * @author gerrygj
 */

//coverted to sub-class by Gerald for Lesson 9
public class WordList extends FileArrayProvider {
    
    private static final String filename = "src/hangman/words.txt";
    
    public WordList() throws IOException {
        super(WordList.filename);
        this.randomizeList();
        //this.displayWordList(); //for testing only
    }
    
    // this function is just for testing
    public void displayWordList() {
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

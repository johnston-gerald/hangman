/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hangman;

/**
 *
 * @author gerrygj
 */
public class WordList {

    public String[] makeList() {
        String wordList[] = { "halloween", "oxen", "moroni", "university", "jazz", "canada", 
            "theater", "collapse", "random", "elephant", "alphabet", "development", "vegetables" };
        return wordList;
    }
    
    public String[] sortList(String[] words) {
        String tmpWord;
        boolean notDone = true;
        while(notDone) {
            
            notDone = false; // assume that you done
            for (int i = 0; i < words.length-1; i++) {
                if (words[i].length() > words[i+1].length()) {
                    // swap words
                    tmpWord = words[i];
                    words[i] = words[i+1];
                    words[i+1] = tmpWord;
                    notDone = true;
                } 
            }
        }

        return words;
    }
    
    // this function is just for the assignment
    public void displayWordList(String[] words) {
        System.out.println("\n\t===============================================================");
        System.out.println("\tHere is the sorted list of words:");

        for (int i = 0; i < words.length; i++) {
            if (words[i] == null) {
                break;
            }
                
            System.out.println("\t    " + words[i]);
        }
        System.out.println("\t===============================================================\n");
    }
    
}

package wddbyui.cit260.hangman.words;

import java.io.IOException;
import java.io.Serializable;
import java.util.Arrays;
import wddbyui.cit260.hangman.enums.Status;

/**
 *
 * @author gerrygj
 */
public class MysteryWord implements Serializable {

    private WordList wordList = new WordList();
    private String mysteryWord = wordList.getWordList()[0];
    private char[] mysteryArray = new char[mysteryWord.length()];
    private char[] wordArray = new char[mysteryWord.length()];
    private int numberOfGuesses = 6;
    
    public MysteryWord() throws IOException {
        for(int i = 0; i < mysteryArray.length; i++) {
            mysteryArray[i] = '_';
        }
    }

    public String displayMysteryWord (char letter) {
    
        wordArray = mysteryWord.toCharArray();
        String mysteryWordOutput = "";
        boolean correctLetter = false;
    
        if (letter == '_' || letter == '1'){
    
            correctLetter = true;
        }

        for(int i = 0; i < wordArray.length; i++) {
        
            if (Character.toLowerCase(wordArray[i]) == letter) {
                mysteryArray[i] = wordArray[i];
                correctLetter = true;
            }

            mysteryWordOutput = mysteryWordOutput + mysteryArray[i] + " ";
        }
    
        if (correctLetter == false) {
            numberOfGuesses--;
        }
    
        return mysteryWordOutput;
    }

    public int getNumberOfGuesses() {
        return numberOfGuesses;
    }

    public void setNumberOfGuesses(int numberOfGuesses) {
        this.numberOfGuesses = numberOfGuesses;
    }

    public Status winOrLose(){
        
        if (Arrays.equals(wordArray, mysteryArray)){
            return Status.WIN_GAME;
        }
        else if (numberOfGuesses < 1) {
            return Status.LOSE_GAME;
        }
        
        return Status.PLAYING;
    }    
    
}

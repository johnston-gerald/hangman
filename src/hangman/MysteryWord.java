package hangman;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author gerrygj
 */
public class MysteryWord {

    private String mysteryWord = getWord();
    private char[] mysteryArray = new char[mysteryWord.length()];
    private char[] wordArray = new char[mysteryWord.length()];
    private int numberOfGuesses = 6;
    
    public MysteryWord() {
        for(int i = 0; i < mysteryArray.length; i++) {
            mysteryArray[i] = '_';
        }
    }

    public char getLetter() {
        Scanner letterScanner = new Scanner(System.in);
        ErrorHandling errorHandling = new ErrorHandling();
    
        String letter = "0";
        
        boolean valid = false;
        while (!valid) {  //This is our new while continue loop
            System.out.println("Please enter a letter or enter 1 for the menu: ");
        
            letter = letterScanner.next();
            
            if (letter.length() != 1) {
                System.out.println("\nInvalid input.");
                continue;
            }
            
            if (letter.charAt(0) >= '1' && letter.charAt(0) <= '6') { //menu
                return letter.charAt(0);
            }
            
            if (!errorHandling.isChar(letter)) {
                System.out.println("\nInvalid input.");
                continue;
            }
            
            valid = true;
        }
    
        return Character.toLowerCase(letter.charAt(0));
    }
    
    public String getWord() {
        WordList wordList = new WordList();
        String words[] = wordList.randomizeList(wordList.makeList());
        
        String hangmanWord = words[0];
        //wordList.displayWordList(words); // this line is just for testing
                
        return hangmanWord;
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
    
        mysteryWordOutput = mysteryWordOutput + "(" +mysteryWord.length() +" letters)";
        return mysteryWordOutput;
    }

    public int guessesLeft(){
        return numberOfGuesses;
    }

    public boolean winGame () {
    
        if (Arrays.equals(wordArray, mysteryArray)){
            return true;
        }
        else {
            return false;
        }
    }

    public boolean loseGame () {
    
        if (numberOfGuesses < 1){
            return true;
        }
        else {
            return false;
        }
    }

}

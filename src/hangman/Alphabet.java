package hangman;

/**
 *
 * @author gerrygj
 */
public class Alphabet {

    // The array to contain the alphabet
    private char[] alphabetArray = "abcdefghijklmnopqrstuvwxyz".toCharArray();
    
    public void displayAlphabet (char letter) {
    
        System.out.println("Remaining Letters:");
    
        for(int i = 0; i < alphabetArray.length; i++) {
        
            if (alphabetArray[i] == letter) {
                alphabetArray[i] = '_';
            }
        
            System.out.print(alphabetArray[i] + " ");
        }
    
        System.out.print("\n\n");
        
    }

}
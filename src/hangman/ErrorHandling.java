package hangman;

/**
 *
 * @author gerrygj
 */
public class ErrorHandling {

    //see if a string is also an integer
    public boolean isInteger( String input ) {
        try {
            Integer.parseInt( input );
            return true;
        }
        catch( Exception e ) {
            return false;
        }
    }
    
    //see if a string is also a char
    public boolean isChar( String input ) {
        if (input.length() == 1){
            if (Character.isLetter(input.charAt(0))) {
                return true;
            }
        }
        return false;
    }
    
}

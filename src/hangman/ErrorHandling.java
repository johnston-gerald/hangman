package hangman;

/**
 *
 * @author gerrygj
 */
public class ErrorHandling {

    public boolean isInteger( String input ) {
        try {
            Integer.parseInt( input );
            return true;
        }
        catch( Exception e ) {
            return false;
        }
    }
    
    public boolean isChar( String input ) {
        if (input.length() == 1){
            if (Character.isLetter(input.charAt(0))) {
                return true;
            }
        }
        return false;
    }
    
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hangman;

/**
 *
 * @author gerrygj
 */
public class ErrorHandling {

    public ErrorHandling() {
    }
    
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

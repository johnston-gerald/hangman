package wddbyui.cit260.hangman.game;

import java.io.Serializable;
import wddbyui.cit260.hangman.enums.ErrorType;
import wddbyui.cit260.hangman.exceptions.HangmanException;

/**
 *
 * @author gerrygj
 */
public class PlayerName implements Serializable {

    private static String name = null;
    
    public PlayerName() {
    }
   
    public void promptName(String inputName) {
        try {
             Boolean valid = false;
        
           while(!valid) {
               
               name = inputName;
               
               if (name != null) {
                    valid = true;
                }
                else {
                    throw new HangmanException();
                }
                 //   throw new HangmanException();  //for testing only
            }

        } catch(HangmanException exc){
            System.out.println("\n" + ErrorType.NAME_ERROR.getMessage() + "\n");
        }
    }
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}

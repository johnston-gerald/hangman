package wddbyui.cit260.hangman.menus;

import wddbyui.cit260.hangman.enums.Status;
import java.io.Serializable;
import wddbyui.cit260.hangman.enums.Help;

/**
 *
 * @author gerrygj
 */
public class MainMenuControl implements Serializable {

    public MainMenuControl() {
    }
    
    public Status activateControl(char menuSelection) { 

        switch(menuSelection){
            
            case '1':
                return Status.PLAYING;

            case '2':
                System.out.println(Help.INSTRUCTIONS.getMessage());
                return Status.PLAYING;
            
            case '3':
                return Status.EXIT;
                
            default:
                System.out.println();
                return Status.PLAYING;
            }
        } 
}

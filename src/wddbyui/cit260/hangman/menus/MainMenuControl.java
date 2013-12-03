package wddbyui.cit260.hangman.menus;

import wddbyui.cit260.hangman.enums.Status;
import java.io.Serializable;
import wddbyui.cit260.hangman.enums.Help;

/**
 *
 * @author gerrygj
 */
public class MainMenuControl implements Serializable {  //Lesson 10 Paired, moved to menus package

    public MainMenuControl() {
    }
    
    public Status activateControl(char menuSelection) {
        
        switch(menuSelection){

            case '2':
                System.out.println(Help.INSTRUCTIONS.getMessage());  //Gerald, Lesson 10, Individual
                return Status.PLAYING;  //Lesson 10 Paired, Lorna & Gerald
            
            case '3':
                return Status.EXIT; //Lesson 10 Paired, Lorna & Gerald
                
            default:
                System.out.println();
                return Status.PLAYING;  //Lesson 10 Paired, Lorna & Gerald
            }
    }
    
}

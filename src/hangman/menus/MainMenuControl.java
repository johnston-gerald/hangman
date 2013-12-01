package hangman.menus;

import hangman.Instructions;
import hangman.Status;
import java.io.Serializable;

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
                System.out.println(Instructions.getInstructions());
                return Status.PLAYING;  //Lesson 10 Paired, Lorna & Gerald
            
            case '3':
                return Status.EXIT; //Lesson 10 Paired, Lorna & Gerald
                
            default:
                System.out.println();
                return Status.PLAYING;  //Lesson 10 Paired, Lorna & Gerald
            }
    }
    
}

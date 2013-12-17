package wddbyui.cit260.hangman.menus;

import wddbyui.cit260.hangman.enums.Status;
import java.io.Serializable;
import wddbyui.cit260.hangman.frames.GetNamesFrame;
import wddbyui.cit260.hangman.frames.InstructionsFrame;

/**
 *
 * @author gerrygj
 */
public class MainMenuControl implements Serializable {

    public MainMenuControl() {
    }
    
    public void activateControl(Status status) { 

        switch(status){
            
            case PLAYING:
                GetNamesFrame getNamesFrame = new GetNamesFrame();
                getNamesFrame.setVisible(true);
                break;

            case INSTRUCTIONS:
                InstructionsFrame instructionsFrame = new InstructionsFrame();
                instructionsFrame.setVisible(true);
                break;
            
            case EXIT:
                break;
                
            /*default:
                //System.out.println();
                //return Status.MENU;*/
            }
        } 
}

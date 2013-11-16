package hangman;

import java.io.Serializable;

/**
 *
 * @author gerrygj
 */
public class MainMenuControl implements Serializable {

    public MainMenuControl() {
    }
    
    private boolean exitProgram = false;
    
    public void activateControl(char menuSelection) {
    
        switch(menuSelection){

            case '2':
                System.out.println(Instructions.getInstructions());
            break;
            
            case '3':
                exitProgram = true;
            break;
            
            default:
                System.out.println();
            }
    }
    
    public boolean exitGame () {
        return exitProgram;
    }
    
}

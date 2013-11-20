package hangman;

import java.io.Serializable;

/**
 *
 * @author gerrygj
 */
public class MainMenuControl implements Serializable {
// Lorna lesson 8
    public MainMenuControl() {
    }
    
    public static boolean exitProgram = false;
    
    public void activateControl(char menuSelection) {
    
        switch(menuSelection){

            case '2':
                System.out.println(Instructions.getInstructions());
            break;
            
            case '3':
                exitProgram = true;
                System.out.println("this is supposed to exit the game!!!!!!!!");
            break;
            
            default:
                System.out.println();
            }
    }
    
    public boolean isExitProgram() {
        return exitProgram;
    }

    public void setExitProgram(boolean exitProgram) {
        this.exitProgram = exitProgram;
    }
    
}

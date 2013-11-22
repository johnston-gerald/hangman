package hangman;

import java.io.Serializable;

/**
 *
 * @author gerrygj
 */
public class MainMenuControl implements Serializable {

    public MainMenuControl() {
    }
    
    public static boolean exitProgram = false;
    
    public void activateControl(char menuSelection) {
        
        Menu a = new Menu();  //These were added just for override example, Gerald and Lorna, paired assignment, lesson 9.
        Menu b = new MainMenuView();
    
        switch(menuSelection){

            case '2':
                System.out.println(Instructions.getInstructions());
            break;
            
            case '3':
                exitProgram = true;
            break;
                
             case '4':  //Added just to test override example, Gerald and Lorna, paired assignment, lesson 9.
                 a.displayClassName();
                 b.displayClassName();
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

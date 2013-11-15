package hangman;

/**
 *
 * @author gerrygj
 */
public class MainMenuControl {
    
    private boolean exitProgram = false;
    private boolean startNewGame = false;
    private boolean optionsMenuControl = false;
    
    public void activateControl(char menuSelection) {
    
        Instructions instructions = new Instructions();
        
        switch(menuSelection){

            case '2':
                instructions.displayInstructions();
            break;
            
            case '3':
                exitProgram = true;
            break;
            
            default:
                System.out.println();
            }
    }
    
    public boolean optionsMenuControl () {
        return optionsMenuControl;
    }

    public boolean newGame () {
        return startNewGame;
    }
    
    public void resetNewGame () {
        startNewGame = false;
    }
    
    public boolean exitGame () {
        return exitProgram;
    }
    
}

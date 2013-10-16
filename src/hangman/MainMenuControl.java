/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hangman;

/**
 *
 * @author gerrygj
 */
public class MainMenuControl {
    
    boolean exitProgram = false;
    boolean startNewGame = false;
    
    public void activateControl(char menuSelection) {
    
        Instructions instructions = new Instructions();
        PlayerMenuView playerMenuView = new PlayerMenuView();
        PlayerMenuControl playerMenuControl = new PlayerMenuControl();
        
        switch(menuSelection){
            case '2':
                instructions.displayInstructions();
            break;
            
            case '3':
                playerMenuControl.activateControl(playerMenuView.displayMenu());
            break;

            case '4':
                startNewGame = true;
                //System.out.println("\n***This will eventually start a new game.***\n");
            break;
                
            case '5':
                exitProgram = true;
            break;
            
            default:
                System.out.println();
            }
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

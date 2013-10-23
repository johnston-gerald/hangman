/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hangman;

/**
 *
 * @author gerrygj
 */
public class PlayerMenuControl {

    public void activateControl(char menuSelection) {
    
        Instructions instructions = new Instructions();
        PlayerMenuView playerMenuView = new PlayerMenuView();
        
        switch(menuSelection){
            case '1':
                System.out.println("\nThe game is now one player.\n"); //We will need to add some more stuff to this one when we develop a two player option for the game
            break;
            
            case '2':
                System.out.println("\n***Eventually we will add a two player option to the game.***\n");
            break;
                
            default:
                System.out.println();
            }
    }
    
}

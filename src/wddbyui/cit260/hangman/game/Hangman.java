package wddbyui.cit260.hangman.game;

import wddbyui.cit260.hangman.game.Game;
import java.io.IOException;
import java.io.Serializable;

/**
 *
 * @author gerrygj
 */
public class Hangman implements Serializable {

    public Hangman() {
    }

    public static void main(String[] args) throws IOException {

        PlayerName playerName = new PlayerName();
        System.out.println("\nWelcome " + playerName.getName());
       
        System.out.println(Instructions.getInstructions());
        
        Game game = new Game();
        game.playTheGame();
    }
    
}

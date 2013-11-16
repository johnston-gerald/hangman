package hangman;

import java.io.Serializable;

/**
 *
 * @author gerrygj
 */
public class Hangman implements Serializable {
//Gerald individual lesson 8
    public Hangman() {
    }

    public static void main(String[] args) {

        PlayerName playerName = new PlayerName();
        System.out.println("\nWelcome " + playerName.getName());
       
        System.out.println(Instructions.getInstructions());
        
        Game game = new Game();
        game.playTheGame();
    }
    
}

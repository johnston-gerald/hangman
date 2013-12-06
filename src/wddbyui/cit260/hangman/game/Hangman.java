package wddbyui.cit260.hangman.game;

import java.io.IOException;
import java.io.Serializable;
import wddbyui.cit260.hangman.enums.Help;
import wddbyui.cit260.hangman.exceptions.MenuException;

/**
 *
 * @author gerrygj
 */
public class Hangman implements Serializable {

    public Hangman() {
    }

    public static void main(String[] args) throws IOException, MenuException {

        PlayerName playerName = new PlayerName();
        System.out.println("\nWelcome " + playerName.getName());
       
        System.out.println(Help.WELCOME.getMessage());  //Gerald, Lesson 10, individual
        
        Game game = new Game();
        game.playTheGame();
    }
    
}

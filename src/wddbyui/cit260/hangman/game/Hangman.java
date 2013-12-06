package wddbyui.cit260.hangman.game;

import java.io.IOException;
import java.io.Serializable;
import wddbyui.cit260.hangman.enums.ErrorType;
import wddbyui.cit260.hangman.enums.Help;
import wddbyui.cit260.hangman.exceptions.MenuException;  //Gerald and Lorna Lesson 11 Paired assignment

/**
 *
 * @author gerrygj
 */
public class Hangman implements Serializable {

    public Hangman() {
    }

    public static void main(String[] args) throws IOException, MenuException {  //Gerald and Lorna Lesson 11 Paired assignment
        try {  //Gerald and Lorna Lesson 11 Paired assignment
        PlayerName playerName = new PlayerName();
        System.out.println("\nWelcome " + playerName.getName());
       
        System.out.println(Help.WELCOME.getMessage());  //Gerald, Lesson 10, individual
        
        Game game = new Game();
        game.playTheGame();
    } catch(Throwable e) {  //Gerald and Lorna Lesson 11 Paired assignment
       System.out.println(ErrorType.FATAL_ERROR.getMessage()
            + "\n" + e.getStackTrace().toString());
}
    
    finally { //Lesson 11, we don't have any input in this class.  Do we really need this?
    }
}
}

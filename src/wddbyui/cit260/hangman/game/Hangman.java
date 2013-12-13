package wddbyui.cit260.hangman.game;

import java.io.IOException;
import java.io.Serializable;
import wddbyui.cit260.hangman.enums.ErrorType;
import wddbyui.cit260.hangman.exceptions.MenuException;
import wddbyui.cit260.hangman.frames.MainFrame;

/**
 *
 * @author gerrygj
 */
public class Hangman implements Serializable {
    
    public static MainFrame mainFrame = null;

    public Hangman() {
    }

    public static void main(String[] args) throws IOException, MenuException {
        Hangman hangman = null;
        try {
            hangman = new Hangman();
            
            /* Create and display the form */   //Paired Lesson 12, Lorna & Gerald
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    Hangman.mainFrame = new MainFrame();
                    Hangman.mainFrame.setVisible(true);
                }
            });
            
            /*  //obsolete code
            PlayerName playerName = new PlayerName();
            System.out.println("\nWelcome " + playerName.getName());
       
            System.out.println(Help.WELCOME.getMessage());
        
            Game game = new Game();
            game.playTheGame();*/
        }
        catch(Throwable e) {
            System.out.println(ErrorType.FATAL_ERROR.getMessage()
                + "\n" + e.getStackTrace().toString());
        }
        finally {
            if (Hangman.mainFrame != null) {
                Hangman.mainFrame.dispose();
            }
        }
    }
}

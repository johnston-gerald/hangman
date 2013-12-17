package wddbyui.cit260.hangman.game;

import java.io.IOException;
import java.io.Serializable;
import wddbyui.cit260.hangman.enums.ErrorType;
import wddbyui.cit260.hangman.frames.MainFrame;

/**
 *
 * @author gerrygj
 */
public class Hangman implements Serializable {
    
    public static MainFrame mainFrame = null;

    public Hangman() {
    }

    public static void main(String[] args) throws IOException {
        Hangman hangman = null;
        try {
            hangman = new Hangman();
            
            /* Create and display the form */
            java.awt.EventQueue.invokeLater(new Runnable() {
                @Override
                public void run() {
                    Hangman.mainFrame = new MainFrame();
                    Hangman.mainFrame.setVisible(true);
                }
            });
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

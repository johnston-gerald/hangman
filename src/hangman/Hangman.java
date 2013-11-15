package hangman;

/**
 *
 * @author gerrygj
 */
public class Hangman {

    public static void main(String[] args) {

        PlayerName playerName = new PlayerName();
        System.out.println("\nWelcome " + playerName.getName());
       
        System.out.println(Instructions.getInstructions());
        
        Game game = new Game();
        game.playTheGame();
    }
    
}

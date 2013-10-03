/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hangman;

public class Game {

    public Game() {
    }

    public void displayWinningMessage () {
        System.out.println(
             "\n\t*******************************************************************************"
             + "\n\t Congratulations. You win!"
             + "\n\t*******************************************************************************");
    }

    public void displayLosingMessage () {
        System.out.println(
             "\n\t*******************************************************************************"
             + "\n\t Sorry. You lose." 
             + "\n\t*******************************************************************************");
    }
    
}

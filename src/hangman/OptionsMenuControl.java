/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hangman;

/**
 *
 * @author Lorna
 */
public class OptionsMenuControl {
    
    boolean mainMenuControl = false;
    
    public void activateOptionsControl(char optionsSelection) {
       //EasyGame easyGame = new EasyGame();  //This class is not written yet.
       //MediumGame mediumGame = new MediumGame();  //This class is not written yet.
       //DifficultGame difficultGame = new DifficultGame();  //This class is not written yet.
       
       switch(optionsSelection){
           case '1':
               //easyGame.activateGame();
           break;
               
           case '2':
               //mediumGame.activateGame();
           break;
               
           case '3':
               //difficultGame.activateGame();
           break;
               
           case '4':
               mainMenuControl = true;
           break;
               
           default:
               System.out.println((String)"Not a valid selection.");
                       
       }
    }
    
    public boolean menuControl() {
        return mainMenuControl;
    }
}

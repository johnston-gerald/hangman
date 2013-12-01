/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hangman;

/**
 *
 * @author gerrygj
 */
public enum Status {    //Lesson 10 Paired, Lorna & Gerald
    
    PLAYING ("PLAYING"), 
    WIN_GAME ("WIN_GAME"), 
    LOSE_GAME ("LOSE_GAME"), 
    EXIT ("EXIT");
    
    String value;
    
    Status(String value) {
        this.value = value;   
    }
    
    public String getValue() {
        return value;
    }
}

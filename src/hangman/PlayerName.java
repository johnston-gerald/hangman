/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hangman;

import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author gerrygj
 */
public class PlayerName implements Serializable {
//Gerald lesson 8
    public PlayerName() {
        this.promptName();
    }
    
    private String name;
    
    private void promptName() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");
        this.name = input.next();
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
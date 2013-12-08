package wddbyui.cit260.hangman.game;

import java.io.Serializable;
import java.util.Scanner;
import wddbyui.cit260.hangman.enums.ErrorType;
import wddbyui.cit260.hangman.exceptions.HangmanException;   //Lesson 11 Lorna Individual

/**
 *
 * @author gerrygj
 */
public class PlayerName implements Serializable {

    public PlayerName() {
        this.promptName();
    }
    
    private String name;
    
    private void promptName() {
        try {  //Lesson 11 Lorna Individual
             Scanner input = new Scanner(System.in);
             Boolean valid = false;
        
           while(!valid) {
                System.out.println("Enter your name: ");
                this.name = input.next();
                if (this.name.equals(this.name.toString())) {
                    valid = true;
                }
                else {
                    throw new HangmanException();   //Lesson 11 Lorna Individual
                }
                 //   throw new HangmanException();  I used this line to test my exception handling for Lorna's individual lesson 11
            }

        } catch(HangmanException exc){   //Lesson 11 Lorna Individual
            System.out.println("\n" + ErrorType.NAME_ERROR.getMessage() + "\n");
        }
    }
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}

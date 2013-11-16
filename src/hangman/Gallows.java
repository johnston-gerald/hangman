package hangman;

import java.io.Serializable;

/**
 *
 * @author gerrygj
 */
public class Gallows implements Serializable {

    public Gallows() {
    }
    
    public void displayGallows(int gallowsChoice) {
        
        switch(gallowsChoice){
            case 6:
                System.out.println("\t------------"
                               + "\n\t|          |"
                               + "\n\t|          |"
                               + "\n\t|"
                               + "\n\t|" 
                               + "\n\t|"
                               + "\n\t|"
                               + "\n\t|"
                               + "\n\t|"
                               + "\n\t|"
                               + "\n");
            break;
            
            case 5:
                System.out.println("\t------------"
                               + "\n\t|          |"
                               + "\n\t|          |"
                               + "\n\t|          O"
                               + "\n\t|" 
                               + "\n\t|"
                               + "\n\t|"
                               + "\n\t|"
                               + "\n\t|"
                               + "\n\t|"
                               + "\n");
            break;
                
            case 4:
                System.out.println("\t------------"
                               + "\n\t|          |"
                               + "\n\t|          |"
                               + "\n\t|          O"
                               + "\n\t|          |" 
                               + "\n\t|          |"
                               + "\n\t|"
                               + "\n\t|"
                               + "\n\t|"
                               + "\n\t|"
                               + "\n");
            break;
            
            case 3:
                System.out.println("\t------------"
                               + "\n\t|          |"
                               + "\n\t|          |"
                               + "\n\t|          O"
                               + "\n\t|         /|" 
                               + "\n\t|          |"
                               + "\n\t|"
                               + "\n\t|"
                               + "\n\t|"
                               + "\n\t|"
                               + "\n");
            break;
            
            case 2:
                System.out.println("\t------------"
                               + "\n\t|          |"
                               + "\n\t|          |"
                               + "\n\t|          O"
                               + "\n\t|         /|\\" 
                               + "\n\t|          |"
                               + "\n\t|"
                               + "\n\t|"
                               + "\n\t|"
                               + "\n\t|"
                               + "\n");
            break;
            
            case 1:
                System.out.println("\t------------"
                               + "\n\t|          |"
                               + "\n\t|          |"
                               + "\n\t|          O"
                               + "\n\t|         /|\\" 
                               + "\n\t|          |"
                               + "\n\t|         /"
                               + "\n\t|"
                               + "\n\t|"
                               + "\n\t|"
                               + "\n");
            break;
            
            case 0:
                System.out.println("\t------------"
                               + "\n\t|          |"
                               + "\n\t|          |"
                               + "\n\t|          O"
                               + "\n\t|         /|\\" 
                               + "\n\t|          |"
                               + "\n\t|         / \\"
                               + "\n\t|"
                               + "\n\t|"
                               + "\n\t|"
                               + "\n");
            break;
            
            default:
                System.out.println();
            }
    }
       
}




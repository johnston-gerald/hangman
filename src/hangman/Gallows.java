/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hangman;

/**
 *
 * @author gerrygj
 */
public class Gallows {
    
    
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
        + "\n\t|          /\\"
        + "\n\t|"
        + "\n\t|"
        + "\n\t|"
        + "\n");
                    break;
                default:
                System.out.println();
            }
        }
       //asignment method only.
       public void assignmentMethod(){
           int a = 1;   
           double b = 2.0;
           int c = 3;
           System.out.println((a + (int)b)/c );
       }
       
       boolean validInput(int gallowsChoice){
           if ((gallowsChoice < '0' ) | (gallowsChoice > '6')) return false;
           else return true;
       }
    }




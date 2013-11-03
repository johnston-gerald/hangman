/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hangman;

/**
 *
 * @author gerrygj
 */
public class AssignmentsGerald {
    
    //This main was created to make the file run individually.
    public static void main(String[] args) { 

        int rows = 12;
        int columns = 12;
        int[][] timesTable = new int[rows][columns];
        
        System.out.println("The 12 times table:\n");
        
        // fill array with 12 x 12 times table
        for (int i=0; i < rows; i++) {
            
            for (int j=0; j < columns; j++) {
                timesTable[i][j] = (i+1)*(j+1);
            }
        }

        // display the array
        for (int[] i : timesTable) {
            
            for (int j : i) {
                System.out.print(j + "\t");
            }
            System.out.println( "" );
        }

        // determine and display the minimum and maximum values of the table
        int min = timesTable[0][0];
        int max = timesTable[0][0];
        
        for (int[] i : timesTable) {
            
            for (int j : i) {
                min = Math.min(j,min);
                max = Math.max(j,max);
            }
        }
        System.out.println("\nThe minimum value in the table is " + min +".");
        System.out.println("The maximum value in the table is " + max +".");
        
    }
   
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hangman;

/**
 *
 * @author Lorna
 */
public class AssignmentsLorna {  
  
        public static void main(String[] args) { 
            //This main was created to make the file run individually.
          
           AssignmentsLorna assignmentslorna = new AssignmentsLorna();
            assignmentslorna.arrayLesson();
            assignmentslorna.multiDimArr();
        }
        
       public void arrayLesson() {
       int[] array;
       int numsArray[] = {1, 12, 4, 3, 7, 6, 14};
       int sum = 0;
      
       //Here is Lorna's Individual Assignment for loop.
        for (int i=0; i < numsArray.length; i++) {sum += numsArray[i] + 2;
   
    System.out.println("The new value is " + sum + ".");  
    }
    }
       
       // lesson 6 - Lorna's Individual Assignment
       public static void multiDimArr() { //multidimensional array
        int sum = 0;
        int nums[][] = new int [4][6];
        int average = 0;
        int row = 4;
        int col = 6;
        
            for(int i = 0; i < 4; i++)
                for(int j = 0; j < 6; j++)
                    nums[i][j] = (i+2)+(j*3);

            for(int a[] : nums) { //nested for each loops
                for(int b  : a) {
                    System.out.println("\t The sum is " + b);
                    sum += b;
                }
            }
        average = sum / (row * col);
        System.out.println("\t The total is " + sum); //sum
        System.out.println("\t The average is " + average); //average
      }
}
 
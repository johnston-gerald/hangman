/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hangman;

/**
 *
 * @author Lorna
 */
public class ExerciseSuperClass { /*This is created for Lorna's individual assignment for Lesson 9*/

              public static final int[] numsArray = {1, 12, 4, 3, 7, 6, 14};
              public int sum = 0;

    public ExerciseSuperClass() {
    }

    public ExerciseSuperClass(int sum) {
        this();
        this.sum = sum;
    }
       
    
          public void arrayDisplay() {
      
        for (int i=0; i < numsArray.length; i++) {sum += numsArray[i] + 2;
   
    System.out.println("The old value is " + sum + "."); 
    }
    }
}
 
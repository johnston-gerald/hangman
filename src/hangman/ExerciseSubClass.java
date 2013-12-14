/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hangman;

/**
 *
 * @author Lorna
 */
public class ExerciseSubClass extends ExerciseSuperClass {  //This is created for Lorna's individual assignment for Lesson 9

    private static int sum = 5;
    
     public ExerciseSubClass() {
       super (sum);
     }

     @Override
       public void arrayDisplay() {

         int total = sum;
       for (int i=0; i < numsArray.length; i++) {total += numsArray[i] + 3;
   
    System.out.println("The new value is " + total + ".");  
    }

}
}
 
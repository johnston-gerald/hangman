/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hangman;


/**
 *
 * @author Lorna
 */
public class ExerciseStart { /*This is created for Lorna's individual assignment for Lesson 9.
 It was necessary in order to run the ExerciseSuperClass and ExerciseSub Class since they aren't part of the hangman game.*/

    public ExerciseStart() {
    }


    public static void main(String[] args) {

        ExerciseSuperClass exerciseSuperClass = new ExerciseSuperClass();
        ExerciseSubClass exerciseSubClass = new ExerciseSubClass();
        exerciseSuperClass.arrayDisplay();
        exerciseSubClass.arrayDisplay();
    
    }
    
}

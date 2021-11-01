/* Challenge Activity 2
 * 
 * When I was in college my MET100 Professor only gave us 3 exams. 
 * There were 150 questions on each exam. 
 * Your final grade in the course was the sum of the number of questions
 * you got right on each of exam1, exam2 and exam3 divided by 450 (the 
 * maximum possible points) 
 * 
 * Write a program which given 3 exam scores displays your total of all 3
 * exam scores and percentage (as a whole number) 
 * 
 * SAMPLE RUN: 
 *  Exam 1 Score : 120
 *  Exam 2 Score : 135
 *  Exam 3 Score : 130
 *  Total points : 385
 *  Percentage : 85
 *  
 */

package finalgradeinmet100;

import java.util.Scanner;

public class FinalGradeInMET100 {

    public static void main(String[] args) {
       // TODO: Write solution here.
       int exam1 = 120, exam2 = 135, exam3 = 130;
       int sum = exam1 + exam2 + exam3;
       double percentage = (sum * 100) / 450;
        System.out.println("Exam1 score: " + exam1);
        System.out.println("Exam2 score: " + exam2);
        System.out.println("Exam3 score: " + exam3);
        System.out.println("Total points: " + sum);
        System.out.printf("Percentage: %4.2f", percentage);    
    }
}

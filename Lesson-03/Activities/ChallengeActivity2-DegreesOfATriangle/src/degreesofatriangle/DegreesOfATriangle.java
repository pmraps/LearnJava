/*Challenge Activity 2 - degrees of a triangle
 * 
 * The sum of the 3 angles of any triangle should total 180 degrees.
 * Any more or any less then the figure cannot be a triangle.
 * 
 * Write a program to accept 3 integer angles as input and checks 
 * whether it is a valid triangle by checking the sum against 180 degrees
 * 
 * SAMPLE OUTPUT:
 * 
 *   Enter degrees for angle 1 : 50
 *   Enter degrees for angle 2 : 40
 *   Enter degrees for angle 3 : 90
 *   180 degrees. That's a GOOD triangle!
 * 
 *   Enter degrees for angle 1 : 51
 *   Enter degrees for angle 2 : 40
 *   Enter degrees for angle 3 : 90
 *   181 degrees. That's a BAD triangle!
 */
package degreesofatriangle;

import java.util.Scanner;

public class DegreesOfATriangle {

    public static void main(String[] args) {
	// TODO: Write code here
        Scanner input = new Scanner(System.in);
        
        System.out.print("Insira o 1º ângulo do triângulo: ");
        double first = input.nextDouble();
        System.out.print("Insira o 2º ângulo do triângulo: ");
        double second = input.nextDouble();
        System.out.print("Insira o 3º ângulo do triângulo: ");
        double third = input.nextDouble();
        double sum = first + second + third;
        if (sum == 180) {
            System.out.println("Tem um triângulo correcto!");
        } else {
            System.out.println("Não é um triângulo!");
        }
    }
}

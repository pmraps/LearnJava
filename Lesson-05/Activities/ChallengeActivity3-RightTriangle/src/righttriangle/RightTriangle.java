/* Challenge Activity 3 - Area and Perimeter of a right triangle

This activity is similar to the video lesson. You will take input for lengths of 
sides a and b of of a right triangle, en.wikipedia.org/wiki/Right_triangle
then calculate the area and perimeter.

the area is easy:  0.5 x a x b
the permieter is: a + b + c where c is calculated by the pythagorean theorem
to be the square root of a squared + b squared

SAMPLE OUTPUT:

Enter Right Triangle Side A : 3
Enter Right Triangle Side B : 4
Area: 6.000000; Perimeter: 12.000000

*/
package righttriangle;

import java.util.Scanner;
import static javax.swing.Spring.height;

public class RightTriangle {

    public static void main(String[] args) {
        // TODO code application logic here get input, 
        // calculate area, perimeter then display output.
        Scanner input = new Scanner(System.in);
        
        System.out.print("Insira a base do triângulo: ");
        double base = input.nextDouble();
        System.out.print("Insira a altura do triângulo: ");
        double height = input.nextDouble();
        System.out.printf("A área do triângulo é %4.2f e o seu perímetro é %4.2f.\n", triangleArea(base, height), trianglePerimeter(base, height));

    }
    /**
     * Calculates the area of a right triangle
     * @param a side a length
     * @param b side b  length
     * @return the area as a double
     */
    public static double triangleArea( double base, double height) {
        return ((base * height) / 2);
    }
    
    /**
     * Calculates the perimeter of a right triangle
     * @param a side a length
     * @param b side b length 
     * @return the perimeter as a double
     */
    public static double trianglePerimeter( double base, double height) {
        // Teorema de Pitágoras
        return (base + height + Math.sqrt(Math.pow(base, 2) + Math.pow(height, 2)));
    }
}

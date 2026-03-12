/* Challenge Activity 1
 * 
 * This program should take two integer inputs:
 *  length and width of a rectangle. 
 *  using those inputs it should calculate and display the 
 *  the area and perimeter of the recrangle. 
 * 
 *  Area = Length x Width
 *  Perimeter = 2 x (Length + Width)
 * 
 * SAMPLE RUN: 
 *  Enter Length: 7
 *  Enter Width: 5
 *  Perimeter : 24
 *  Area : 35
 */

package areaandperimeterofarectangle;

import java.util.Scanner;

public class AreaAndPerimeterOfARectangle {

    public static void main(String[] args) {
        // declare variables

        // get length and width with inputs
        Scanner input = new Scanner(System.in);
        
        System.out.println("Insira a medida do primeiro lado: ");
        double side1 = input.nextDouble();
        System.out.println("");
        System.out.println("Insira a medida do segundo lado: ");
        double side2 = input.nextDouble();
        System.out.println("");
        
        // perform area, perimeter calculations and display outputs
        System.out.printf("A área é %4.2f e o perímetro é %4.2f", side1 * side2, side1 * 2 + side2 * 2);
    }
}

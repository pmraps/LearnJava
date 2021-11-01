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

public class PAAreaAndPerimeterOfARectangle {

    public static void main(String[] args) {
        // declare variables
        Scanner input = new Scanner(System.in);
        int widthRectangle = 0, lengthRectangle = 0, area, perimeter;

        // get length and width with inputs
        System.out.print("Enter the length of the rectangle: ");
        try{
            lengthRectangle = input.nextInt();
        }
        catch (NumberFormatException ex){
            ex.printStackTrace();
        }
        System.out.print("\nEnter the width of the rectangle: ");
        try{
            widthRectangle = input.nextInt();
        }
        catch (NumberFormatException ex){
            ex.printStackTrace();
        }
        
        // perform area, perimeter calculations
        area = lengthRectangle * widthRectangle;
        perimeter = (lengthRectangle * 2) + (widthRectangle * 2);
        
        // display outputs
        System.out.printf("Rectangle Area is %d square meters\n", area);
        System.out.printf("Rectangle Perimeter is %d meters\n", perimeter);        
    }
}

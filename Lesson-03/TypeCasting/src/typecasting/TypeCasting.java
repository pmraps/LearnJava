/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package typecasting;

/**
 *
 * @author pmralbuquerque
 */
public class TypeCasting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // 20/15 == 1.333333...
        int x = 20;
        int y = 15;
        int div = x / y;            // int / int ==> int
        double d1 = x / y;          // int / int ==> int ==> double
        double d2 = x / (1.0 * y);  // int / (double * int) ==> double IMPLICIT CONVERSION
        double d3 = x / (double) y; // int / double ==> double EXPLICIT CONVERSION
        
        System.out.println(x / y);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
    }
    
}

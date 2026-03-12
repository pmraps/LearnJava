/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mathexample;

import static java.lang.Math.pow;
import java.util.Scanner;

/**
 *
 * @author pmralbuquerque
 */
public class MathExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.print("Insira o raio do círculo: ");
        double radius = input.nextDouble();
        System.out.printf("O círculo tem uma circunferência de %4.2f e uma área de %4.2f\n", 2 * Math.PI * radius, Math.PI * pow(radius, 2));
    }
    
}

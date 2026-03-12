/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package interactivecommondatatypes;

import java.util.Scanner;


/**
 *
 * @author pmralbuquerque
 */
public class InteractiveCommonDataTypes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        final int RETIREMENT = 70;
        final double DEANSLIST = 3.2;
        String heshe = "";
        Scanner input = new Scanner(System.in);
        
        System.out.print("Qual é o seu nome? ");
        String name = input.nextLine();
        System.out.println("");
        System.out.print("È mulher (true/false)? ");        
        boolean isFemale = input.nextBoolean();
        heshe = isFemale ? "dela" : "dele";
        System.out.println("");
        System.out.print("Qual é a sua média final? ");
        double gpa = input.nextDouble();
        System.out.println("");        
        System.out.print("Qual é a sua idade? ");
        int age = input.nextInt();
        System.out.println("");        
        
        System.out.printf("O nome %s é %s, tem %d anos, faltam-lhe %d dias para a reforma.\n",
                heshe, name, age, (RETIREMENT - age)*365);
        if (gpa >= DEANSLIST) {
             System.out.printf("Entrou na lista do reitor com a média de %4.2f\n", gpa);
        } else {
            System.out.printf("A média de %4.2f não chega para a lista do reitor.\n", gpa);
        }
    }
    
}

package factorial;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Calcular factorial de: ");
        int calcFact = input.nextInt();
        System.out.printf("O factorial de %d é %d\n", calcFact, factorial(calcFact));
    }
    
    /*
     * Calculates the factorial of a positive integer n
     * Example factorial(4) == 4*3*2*1 == 24
     */
    public static int factorial( int n ) {
        int temp = 0;
        temp = n <=0 ? 1 : n * factorial(n-1);
        return temp;
    }
}

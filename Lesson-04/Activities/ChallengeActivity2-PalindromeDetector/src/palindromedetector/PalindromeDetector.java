/* Challenge Activity 2 - Palindrome Detector.
 * 
 * Write a program which given a string input will detect whether that
 * string is a palindrome. see: https://en.wikipedia.org/wiki/Palindrome 
 * for details.
 * 
 * HINT: use the reverse method of StringBuilder to assist you.
 * 
 * SAMPLE OUTPUT:
 * 
 *   Enter phrase : abba 
 *   That's a palindrome!
 * 
 *   Enter phrase : mike 
 *   That's not a palindrome!
 * 
 */
package palindromedetector;

import java.util.Scanner;

public class PalindromeDetector {

    public static void main(String[] args) {
        // TODO: write code here
        Scanner input = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        
        System.out.print("Insira a palavra a testar: ");
        String palindrome = input.nextLine();
        
        sb.append(palindrome);
        String reverse = sb.reverse().toString();
        if (palindrome.equals(reverse)) {
            System.out.println("That is a palindrome!");
        } else 
            System.out.println("That is not a palindrome!");
    }
}

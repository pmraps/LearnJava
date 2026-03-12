/* Challenge Activity 3

This challenge activitiy should ask for the following inputs:
- a basketball player's name
- average points per game
- height in inches

and then display the player name, average points per game, 
and height in ft and inches

There are 12 inches in 1 ft. so 75 inches is 6ft 3 inches

 */
package basketballplayer;

import java.util.Scanner;

/**
 *
 * @author pmra
 */
public class PABasketballPlayer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);        
        
        System.out.println("Enter the player's name: ");
        String name = input.nextLine();
        System.out.println("");
        System.out.print("\nEnter the average points per game: ");
        int average = input.nextInt();
        System.out.println("");
        System.out.print("\nEnter the players height (inches): ");
        int height = input.nextInt();
        System.out.println("");
        
        System.out.printf("\nPlayer %s scores an average of %d points per game and measures %d feet and %d inches",
                name, average, height/12, height % 12);
    }
    
}

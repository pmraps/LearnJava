/* Challenge Activity 3 - Basketball Player Stats

This challenge activitiy should ask for the following inputs:
- a basketball player's name and the following "stats" (all integers)
- total free throws made / attempted
- total field goals made / attempted

and then display the player's "Stats"

player name, total points, free throw pct, field goal pct

For example:

Enter player's name: Tony
Free throws attempted: 4
Free throws made: 3
Field goals attempted: 10
Field goals made: 5

Tony's stats:
Points: 13 
FT %: 0.75
FG %: 0.50

 */
package basketballplayer;

import java.util.Scanner;


/**
 *
 * @author mafudge
 */
public class BasketballPlayerStats {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.print("Insira o nome do jogador: ");
        String name = input.nextLine();
        System.out.println("");
        System.out.print("Insira os lançamentos feitos: ");
        int freeMade = input.nextInt();
        System.out.println("");
        System.out.print("Insira os lançamentos marcados: ");
        int freeIn = input.nextInt();
        System.out.println("");
        System.out.print("Insira os cestos feitos: ");
        int goalsMade = input.nextInt();
        System.out.println("");
        System.out.print("Insira os cestos marcados: ");
        int goalsIn = input.nextInt();
        System.out.println("");
        
        System.out.printf("O jogador %s fez um total de %d lançamentos livres e um total de %d lançamentos ao cesto.\n", name, freeMade, goalsMade);
        System.out.printf("Somou um total de %d pontos, sendo %d de lançamentos livres e %d de jogadas normais.\n", (freeIn * 3 + goalsIn * 1), freeIn * 3, goalsIn * 1);
        System.out.printf("%3.1f%% correspondem aos lançamentos livres, %3.1f%% aos cestos marcados.\n", (freeIn * 100 / (double)freeMade), (goalsIn * 100 / (double)goalsMade));
        
    }
    
}

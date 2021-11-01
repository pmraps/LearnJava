package interactivecommondatatypes;

import java.util.Scanner; // Bring in the scanner to read input

/**
 *
 * @author mafudge
 */
public class PAInteractiveCommonDataTypes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // declare our variables
        Scanner input = new Scanner(System.in);        
        String studentName;
        int age, retirement = 67, daysUntil;       
        double gpa;
        boolean isFemale, deansList;
        
        System.out.print("Enter student's name : ");
        studentName = input.nextLine();        
        System.out.print("Enter student's gpa : ");
        gpa = input.nextDouble();
        deansList = gpa > 3.2;
        System.out.print("Enter student's age : ");
        age = input.nextInt();
        daysUntil = retirement - age;
        System.out.print("Is this student female? (true/false) : ");
        isFemale = input.nextBoolean();
               
        System.out.printf("%s is %d years old and has %d years till retirement.\n"
                + " %s has a %4.3f gpa and %s to the dean's list.\n",
                studentName,
                age, daysUntil, 
                (isFemale ? "She" : "He"),
                gpa,
                (deansList ? "made it" : "didn't made it"));
    }
}

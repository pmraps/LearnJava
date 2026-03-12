/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package randomexample;

import java.util.Random;

/**
 *
 * @author pmralbuquerque
 */
public class RandomExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random generator = new Random();
        int randomSeed = generator.nextInt(1000);
        Random alien = new Random (randomSeed);
        int i = alien.nextInt(randomSeed);
        System.out.println(i);
        i = alien.nextInt(randomSeed);
        System.out.println(i);
        i = alien.nextInt(randomSeed);
        System.out.println(i);
    }
    
}

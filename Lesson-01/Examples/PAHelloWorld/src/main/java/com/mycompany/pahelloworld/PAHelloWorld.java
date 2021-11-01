/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 * Comentário multi-linha, que será ignorado pelo java
 */
package com.mycompany.pahelloworld;

import java.util.Scanner;

/**
 *
 * @author pmra
 */
public class PAHelloWorld {
    public static void main(String[] args) {      
    /**
     * main() function executes when Java program is run. 
     * public = accessible to all
     * static = does not need to be declared to be used
     * void = returns nothing
     */
         
        // Código da aplicação aqui
        Scanner input = new Scanner(System.in);
        System.out.print("Qual é o seu nome? ");
        String yourName = input.nextLine();
        System.out.printf("\nOlá %s !!\n", yourName);
    }
} // Comentário de linha única. Fim da classe PAHelloWorld

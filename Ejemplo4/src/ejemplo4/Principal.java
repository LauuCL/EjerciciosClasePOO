/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo4;

import java.util.Scanner;

/**
 *
 * @author labc205
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime tu edad: ");
        int edad = sc.nextInt();
        System.out.println("Tu edad es: " + edad);
    }
    
}

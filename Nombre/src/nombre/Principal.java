/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nombre;

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
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Dime, ¿Cómo te llamas?");
        String nombre = sc.nextLine();
        System.out.println("Hola "+ nombre + ", mucho gusto. ¡Tienes un lindo nombre!");
    }
    
}

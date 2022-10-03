/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cadenas;

/**
 *
 * @author labc205
 */
public class Cadenas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        String nombre;
        nombre = "Juan Caldera";

        System.out.println("Tamaño o cantidad de letras: " + nombre.length());
        System.out.println("Convertir a mayuscula: " + nombre.toUpperCase());
        System.out.println("Convertir a mayuscula: " + nombre.toLowerCase());

        for (int i = 0; i < nombre.length(); i++) {
            System.out.println(nombre.charAt(i));
        }

        String pw = "Juan Caldera";
        if (nombre.equals(pw)) {
            System.out.println("Ok");
        } else {
            System.out.println("no Ok");
        }
    }


}

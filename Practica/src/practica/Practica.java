/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica;

import java.util.ArrayList;

/**
 *
 * @author labc205
 */
public class Practica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        /*ArrayList<Integer> listado = new ArrayList<>();

        listado.add(1);
        listado.add(2);
        listado.add(3);

        for (int num : listado) {
            System.out.println(num);
        }

//Eliminar elementos de un arrayList

listado.remove(1);
        System.out.println("Eliminando la posicion: ");
for (int num : listado) {
            System.out.println(num);
        }*/
        ArrayList<String> libros = new ArrayList<>();
        libros.add("POO");
        libros.add("Lenguaje c");
        libros.add("Python");

        for (String titulo : libros) {
            System.out.println(titulo);
        }

        System.out.println("Eliminando POO");
        libros.remove("POO");
        for (String titulo : libros) {
            System.out.println(titulo);
        }

    }

}

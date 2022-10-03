/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package almacen;

import java.util.Set;
import modelos.productos.Producto;
import modelos.productos.ProductoDAO;

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
        /* Producto cafe = new Producto(1, "cafe", "rico", 20.50);
     Producto leche = new Producto();

Producto teclado = new Producto();
String texto = teclado.probar();
System.out.println(texto);*/

        /*Producto cel = new Producto(1, "Nokia", "Indestructibles", 200);
        System.out.println(cel.getNombre());
        System.out.println(cel.toString());
        cel.setNombre("iphone 14");
        String nombre = cel.getNombre();
        System.out.println(nombre);*/

ProductoDAO lista = new ProductoDAO();
lista.agregar(1, "Cafe", "Cafe con leche", 120);
lista.agregar(2, "Pan dulce", "Pico", 20);
lista.agregar(3, "Desayuno", "Ensalada con Pollo", 150);
lista.agregar(4, "Baho", "Baho", 200);
lista.agregar(5, "Frijolada", "Frijolada", 350);
lista.agregar(6, "Rundown", "Rundown", 450);

for(int i= 0; i< lista.getListaP().size(); i++){
    System.out.println(lista.getListaP().get(i));
}

    }

}

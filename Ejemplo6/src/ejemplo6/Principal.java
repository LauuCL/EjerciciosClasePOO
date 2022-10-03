/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo6;

import javax.swing.JOptionPane;

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
        
        //Calcular el total a pagar por un producto
        double precio, cantidad;
        String nombreProd;
        nombreProd = JOptionPane.showInputDialog("Nombre dle producto");
        precio = Double.parseDouble(JOptionPane.showInputDialog("Precio: "));
        cantidad = Double.parseDouble(JOptionPane.showInputDialog("Cantidad: "));
        double total = precio * cantidad;
        JOptionPane.showMessageDialog(null, "Producto: "+nombreProd+ "\nCantidad: "
                +cantidad+ "\nPrecio U$: "+precio+ "\nMonto U$: "+total);
    }
    
}

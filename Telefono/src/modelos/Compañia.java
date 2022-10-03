/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author labc205
 */
public class Compañia {

    private int id;
    private String nombre;
    private double precioMsn;

    public Compañia() {
    }

    public Compañia(int id, String nombre, double precioMsn) {
        this.id = id;
        this.nombre = nombre;
        this.precioMsn = precioMsn;
    }

    public double getPrecioMsn() {
        return precioMsn;
    }

    public void setPrecioMsn(double precioMsn) {
        this.precioMsn = precioMsn;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double disminuirSaldo(double saldo) {
        return saldo - this.precioMsn;
    }

    public String toString() {
        return "Id: " + id + " Nombre : "+ nombre + " Precio por mensaje: " + precioMsn;
    }
}

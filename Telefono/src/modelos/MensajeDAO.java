/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

import java.util.ArrayList;

/**
 *
 * @author labc205
 */
public class MensajeDAO {

    private ArrayList<Mensaje> listaM;

    public MensajeDAO() {
        this.listaM = listaM;
    }

    public ArrayList<Mensaje> getListaM() {
        return listaM;
    }

    public void setListaM(ArrayList<Mensaje> listaM) {
        this.listaM = listaM;
    }

    public void recibirMensaje(int origen, int destino, String msn) {
        listaM.add(new Mensaje(origen, destino, msn));
    }
}

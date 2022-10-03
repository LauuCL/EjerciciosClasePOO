/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo;

/**
 *
 * @author labc205
 */
public class Persona {
    
    private int añoNac;
    private int añoAct;
    private int edad;

    public int getAñoNac() {
        return añoNac;
    }

    public void setAñoNac(int añoNac) {
        this.añoNac = añoNac;
    }

    public int getAñoAct() {
        return añoAct;
    }

    public void setAñoAct(int añoAct) {
        this.añoAct = añoAct;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad() {
        this.edad = añoAct-añoNac;
    }

    public Persona() {
    }

    public Persona(int añoNac, int añoAct) {
        this.añoNac = añoNac;
        this.añoAct = añoAct;
         this.setEdad();
    }

    @Override
    public String toString() {
        return "Persona{" + "a\u00f1oNac=" + añoNac + ", a\u00f1oAct=" + añoAct + ", edad=" + edad + '}';
    }
    
    
    
    
}

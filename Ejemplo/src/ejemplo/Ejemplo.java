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
public class Ejemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona lau = new Persona();
        
        lau.setAñoNac(2002);
        lau.setAñoAct(2022);
        lau.setEdad();
        
        System.out.println(lau.toString());
        
        
        Persona luis = new Persona(2000,2022);
        System.out.println(luis.toString());
    }
    
}

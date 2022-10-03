/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo3;

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
        
        int a = 10;
        int b = 5;
        
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        
        System.out.println("Operadores relacionales");
        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a<=b);
        System.out.println(a>=b);
        
        System.out.println("Operadores de igualdad");
        System.out.println(a == b);
        System.out.println(a != b);
        boolean x,y;
        x= a==b;
        y= a!=b;
        System.out.println(x + " " + y);//concatenar los dos valores
        
        int num1=10, num2=2;
        System.out.println(num1 % num2);
        
        
    }
    
}

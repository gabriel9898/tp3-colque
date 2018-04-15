/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp03.ejercicio05.test;

import java.text.DecimalFormat;
import tp03.ejercicio05.modelo.Circulo;
import tp03.ejercicio05.util.GestorCirculo;

/**
 *
 * @author gabriel-not
 */
public class Ejer5 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.00");
        
        Circulo c1 = new Circulo(4);
        Circulo c2 = new Circulo(2);
        
        GestorCirculo gc = new GestorCirculo();
        
        gc.agregarcirculo(c1);
        gc.agregarcirculo(c2);
        
        for (Circulo circulo: gc.getCirculo()){
            System.out.println("Radio: "+circulo.getRadio());
            System.out.println("Superficie "+df.format(circulo.calcularSuperfie()));
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp03.ejercicio06.test;

import tp03.ejercicio06.modelo.Rectangulo;
import tp03.ejercicio06.util.GestorRectangulo;
/**
 *
 * @author gabriel-not
 */
public class Ejer6 {
    public static void main(String[] args) {
        Rectangulo r1 = new Rectangulo(2, 5, 3);
        Rectangulo r2 = new Rectangulo(4, 10, 6);
        Rectangulo r3 = new Rectangulo(6, 10, 2);
        
        GestorRectangulo gr = new GestorRectangulo();
        
        gr.agregarRectangulo(r1);
        gr.agregarRectangulo(r2);
        gr.agregarRectangulo(r3);
        
        for (Rectangulo rectangulo: gr.getRectangulo()){
            rectangulo.mostrarRectangulo();
        }
       
        System.out.println("Tamaño del ArrayList (contando el 0): "+gr.tamañoArraylist());
        gr.eliminarElementoArraylist(1);
        
        for (Rectangulo rectangulo: gr.getRectangulo()){
            rectangulo.mostrarRectangulo();
        }
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp03.ejercicio08.test;

import tp03.ejercicio08.modelo.Libros;
import tp03.ejercicio08.util.GestorLibros;

/**
 *
 * @author gabriel-not
 */
public class testejer8 {
    public static void main(String[] args) {
        Libros l1 = new Libros("115", "sherlock", "asdasd", 240);
        Libros l2 = new Libros("116", "sherlock", "adddd", 300);
        
        GestorLibros gl = new GestorLibros();
        
        gl.agregarLibros(l1);
        gl.agregarLibros(l2);
        
        
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp03.ejercicio09.test;

import tp03.ejercicio09.modelo.Libros;
import tp03.ejercicio09.util.GestorLibros;

/**
 *
 * @author gabriel-not
 */
public class TestEjer9 {
    public static void main(String[] args) {
        Libros l1 = new Libros("115", "sherlock", "asdasd", 240);
        Libros l2 = new Libros("116", "assasind", "adddd", 300);
        
        GestorLibros gl = new GestorLibros();
        
        gl.agregarLibros(l1);
        gl.agregarLibros(l2);
        
        gl.buscarLibros("sherlock");
        gl.buscarLibros("assasin");
        
    }
}

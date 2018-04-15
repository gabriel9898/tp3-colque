/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp03.ejercicio08.util;

import java.util.ArrayList;
import tp03.ejercicio06.modelo.Rectangulo;
import tp03.ejercicio08.modelo.Libros;

/**
 *
 * @author gabriel-not
 */
public class GestorLibros {
    private ArrayList <Libros> libros = new ArrayList ();

    /**
     * @return the libros
     */
    public ArrayList <Libros> getLibros() {
        return libros;
    }

    /**
     * @param libros the libros to set
     */
    public void setLibros(ArrayList <Libros> libros) {
        this.libros = libros;
    }
    
    public void agregarLibros (Libros libro){
        this.libros.add(libro);
        System.out.println("Libro cargado con exito");
        System.out.println("Libros cargados actualmente");
        for (Libros libros:  getLibros()){
            libros.mostrarLibros();
        }
    }     

    public void buscarLibros (String titulo){
        System.out.println(this.libros.contains(titulo));
    }
}

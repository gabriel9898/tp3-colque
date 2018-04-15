/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp03.ejercicio06.util;

import java.util.ArrayList;
import tp03.ejercicio06.modelo.Rectangulo;


/**
 *
 * @author gabriel-not
 */
public class GestorRectangulo {
    private ArrayList <Rectangulo> rectangulo = new ArrayList();

    /**
     * @return the rectangulo
     */
    public ArrayList <Rectangulo> getRectangulo() {
        return rectangulo;
    }

    /**
     * @param rectangulo the rectangulo to set
     */
    public void setRectangulo(ArrayList <Rectangulo> rectangulo) {
        this.rectangulo = rectangulo;
    }
    
    public void agregarRectangulo (Rectangulo rectangulo){
        this.rectangulo.add(rectangulo);
    }
    
    public int tamañoArraylist (){
        return this.rectangulo.size()-1;
    }
    
    public void eliminarElementoArraylist( int pos){
        System.out.println("Elemento del Array list con posicion "+pos+" fue eliminado");
        this.rectangulo.remove(pos);
    }
}

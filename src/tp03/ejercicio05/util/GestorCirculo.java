/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp03.ejercicio05.util;

import java.util.ArrayList;
import tp03.ejercicio05.modelo.Circulo;

/**
 *
 * @author gabriel-not
 */
public class GestorCirculo {
    private ArrayList <Circulo> circulo = new ArrayList ();

    

    /**
     * @return the circulo
     */
    public ArrayList <Circulo> getCirculo() {
        return circulo;
    }

    /**
     * @param circulo the circulo to set
     */
    public void setCirculo(ArrayList <Circulo> circulo) {
        this.circulo = circulo;
    }
    
    public void agregarcirculo (Circulo circulo){
        this.circulo.add(circulo);
    }
    
}

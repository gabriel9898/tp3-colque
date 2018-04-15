/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp03.ejercicio05.modelo;

/**
 *
 * @author gabriel-not
 */
public class Circulo {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    /**
     * @return the radio
     */
    public double getRadio() {
        return radio;
    }

    /**
     * @param radio the radio to set
     */
    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    public double calcularSuperfie (){
        return Math.PI * Math.pow(this.radio, 2);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp03.ejercicio07.test;

import tp03.ejercicio07.modelo.Autos;

/**
 *
 * @author gabriel-not
 */
public class ejer7 {
    public static void main(String[] args) {
        Autos a1 = new Autos("SC 101", "Toyota", "4x4", "Blanco", "Gasoil");
        Autos a2 = new Autos("SC 333", "ferrari", "4x4", "rojo", "Gasoil");
        
        Autos [] autos = new Autos[2];
        autos[0]= a1;
        autos[1]=a2;
        
        for (Autos a: autos){
            
            a.mostrarAuto();
        }
        
        autos[0].modificarAuto();
        
        for (Autos a: autos){
            
            a.mostrarAuto();
        }
    }
}

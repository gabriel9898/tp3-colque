/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp03.ejercicio02;

/**
 *
 * @author gabriel-not
 */
public class Rectangulo {
    public void mostrarTresPuntosFaltantes (double x1 , double y1 , double base , double altura){
        System.out.println("Las Coordenadas de los puntos del rectangulo son:");
        System.out.println("Punto 1 es x1 = "+x1 + ", y1 = "+y1);
        System.out.println("Punto 2 es x2 = "+(x1 + base) + ", y2 = "+y1);
        System.out.println("Punto 3 es x3 = "+x1 + ", y3 = "+(y1 + altura));
        System.out.println("Punto 4 es x4 = "+(x1 + base) + ", y4 = "+ (y1+altura));
    }
    
    public double superficie (double base, double altura){
        return base * altura;   
    }
    
    public double perimetro (double base , double altura){
        return 2 * (base + altura);
    }
}

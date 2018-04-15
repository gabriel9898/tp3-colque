/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp03.ejercicio04;

import java.util.Scanner;

/**
 *
 * @author gabriel-not
 */
public class ejer4 {
    public static void main(String[] args) {
        double num [] = new double[3];
        Scanner scanner = new Scanner(System.in);
        Arreglo arreglo = new Arreglo();
        
        System.out.println("Ingrese 10 numeros");
        for (int i = 0; i < num.length; i++){
            System.out.print("Num"+i+1+": ");
            num[i] = scanner.nextDouble();
        }
        
        arreglo.muestraMayoryMenor(num);
        System.out.println("el promedio es: " + arreglo.promedio(num) );
        arreglo.muestra(num);
        
        
        
    }
    
}

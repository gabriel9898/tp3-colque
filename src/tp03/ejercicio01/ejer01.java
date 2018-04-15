/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp03.ejercicio01;

import java.util.Scanner;

/**
 *
 * @author gabriel-not
 */
public class ejer01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Punto punto = new Punto();
        
        System.out.println("Ingrese el primer numero");
        double num1 = scanner.nextDouble();
        System.out.println("Ingrese el segundo numero");
        double num2 = scanner.nextDouble();
        
        System.out.println("La distancia entre los dos numeros es: "+punto.distancia(num1, num2));
    }
}

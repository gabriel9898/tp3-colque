/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp03.ejercicio10.test;

import java.util.Scanner;
import tp03.ejercicio10.modelo.Cuotas;

/**
 *
 * @author gabriel-not
 */
public class TestEjer10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese cantidad de cuotas");
        int num = scanner.nextInt();
        Cuotas [] cuotas = new Cuotas[num];
        
        double pu = 1000,total=0;
        for (int i=0;i < cuotas.length; i++){
            Cuotas c1 = new Cuotas("101", "cuentas de luz", pu );
            cuotas [i] = c1;
            pu = pu + (pu*1.5/100);
            total = total +pu;
        }
        
        for (Cuotas c:cuotas){
            c.mostrarCuota();
        }
        
        System.out.println("Total a pagar: " + total);
    }
}

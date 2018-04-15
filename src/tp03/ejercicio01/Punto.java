/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp03.ejercicio01;

/**
 *
 * @author gabriel-not
 */
public class Punto {
    public double distancia (double num1,double num2){
        double resta = 0;
        if (num1 == num2 ){
            System.out.println("los dos parametros ingresados son iguales");
        }else{
            if (num1 > num2){
                resta = num1 - num2;
            }else{
                resta = num2 - num1;
            }
        }
        return resta;
    }
}

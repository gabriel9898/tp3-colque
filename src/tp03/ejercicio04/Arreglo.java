/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp03.ejercicio04;

/**
 *
 * @author gabriel-not
 */
public class Arreglo {
    public void muestraMayoryMenor (double [] num){
        double mayor = 0 ,menor = 0, suma = 0;
        for (int i = 0; i < num.length; i++){
            if (i == 0){
                mayor = num[i];
                menor = num[i];
            }else{
                if ( num[i] >= mayor){
                    mayor = num[i];
                }  
                if ( num[i] <= menor){
                    menor = num[i];
                }  
            }
            suma = suma + num[i];
        }
        System.out.println("el mayor numero del arreglo es "+ mayor);
        System.out.println("el menor numero del arreglo es "+ menor);
    } 
    public double promedio ( double [] num){
        double suma = 0;
        for (int i = 0; i < num.length; i++){
            suma = suma + num[i];
        }   
    return (suma / num.length);
    }
    public void muestra ( double [] num){
        System.out.println("Muestra del arreglo");
        for (int i = 0; i < num.length; i++){
            System.out.println("Indice "+i+" valor: "+ num[i]);
        }
    }
}

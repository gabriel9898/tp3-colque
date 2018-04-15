/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp03.ejercicio07.modelo;

import java.util.Scanner;

/**
 *
 * @author gabriel-not
 */
public class Autos {
    private String patente ,  marca , modelo, color, tipoDeCombustible;

    public Autos(String patente, String marca, String modelo, String color, String tipoDeCombustible) {
        this.patente = patente;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.tipoDeCombustible = tipoDeCombustible;
    }

    
    /**
     * @return the patente
     */
    public String getPatente() {
        return patente;
    }

    /**
     * @param patente the patente to set
     */
    public void setPatente(String patente) {
        this.patente = patente;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the tipoDeCombustible
     */
    public String getTipoDeCombustible() {
        return tipoDeCombustible;
    }

    /**
     * @param tipoDeCombustible the tipoDeCombustible to set
     */
    public void setTipoDeCombustible(String tipoDeCombustible) {
        this.tipoDeCombustible = tipoDeCombustible;
    }
    
    public void mostrarAuto (){
        System.out.println("============ Informacion del auto ================");
        System.out.println("Patente: "+getPatente());
        System.out.println("Marca: "+getMarca());
        System.out.println("Modelo: "+getModelo());
        System.out.println("Color: "+getColor());
        System.out.println("Tipo de Combustible: "+ getTipoDeCombustible());
    }
    
    public void modificarAuto(){
        System.out.println("============ Modificacion de la informacion del auto ================"); 
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Anterior Patente: "+getPatente());
        System.out.print("Nueva Patente: ");
        this.patente = scanner.next();
        
        System.out.println("Anterior Marca: "+getMarca());
        System.out.print("Nueva Marca: ");
        this.marca = scanner.next();
        
        System.out.println("Anterior Modelo: "+getModelo());
        System.out.print("Nuevo Modelo: ");
        this.modelo = scanner.next();
        
        System.out.println("Anterior Color: "+getColor());
        System.out.print("Nuevo Color: ");
        this.color = scanner.next();
        
        System.out.println("Anterior Tipo de Combustible: "+getTipoDeCombustible());
        System.out.print("Nuevo Tipo de Combustible ");
        this.color = scanner.next();
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp03.ejercicio06.modelo;

/**
 *
 * @author gabriel-not
 */
public class Rectangulo {
    private double p1 ;
    private double base;
    private double altura;

    public Rectangulo(double p1, double base, double altura) {
        this.p1 = p1;
        this.base = base;
        this.altura = altura;
    }

    /**
     * @return the p1
     */
    public double getP1() {
        return p1;
    }

    /**
     * @param p1 the p1 to set
     */
    public void setP1(double p1) {
        this.p1 = p1;
    }

    /**
     * @return the base
     */
    public double getBase() {
        return base;
    }

    /**
     * @param base the base to set
     */
    public void setBase(double base) {
        this.base = base;
    }

    /**
     * @return the altura
     */
    public double getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public double calcularSuperficie (){
     return this.base*this.altura;   
    }
    
    public double calcularPerimetro (){
        return (2*this.base)+(2*this.altura);
    }
    
    public void mostrarRectangulo (){
        System.out.println("============ Rectangulo =============");
        System.out.println("Punto: "+getP1());
        System.out.println("Base: "+ getBase());
        System.out.println("Altura: "+getAltura());
        System.out.println("Superficie: "+calcularSuperficie());
        System.out.println("Perimetro: "+calcularPerimetro());
    }
}

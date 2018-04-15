/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp03.ejercicio10.modelo;

/**
 *
 * @author gabriel-not
 */
public class Cuotas {
    private String Codigo, Nombre;
    private double PrecioUnitario;

    public Cuotas(String Codigo, String Nombre, double PrecioUnitario) {
        this.Codigo = Codigo;
        this.Nombre = Nombre;
        this.PrecioUnitario = PrecioUnitario;
    }

    /**
     * @return the Codigo
     */
    public String getCodigo() {
        return Codigo;
    }

    /**
     * @param Codigo the Codigo to set
     */
    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    /**
     * @return the Nombre
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * @param Nombre the Nombre to set
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    /**
     * @return the PrecioUnitario
     */
    public double getPrecioUnitario() {
        return PrecioUnitario;
    }

    /**
     * @param PrecioUnitario the PrecioUnitario to set
     */
    public void setPrecioUnitario(double PrecioUnitario) {
        this.PrecioUnitario = PrecioUnitario;
    }
   
    public void mostrarCuota (){
        System.out.println("============ Informacion de la cuota =============");
        System.out.println("Codigo: " + getCodigo());
        System.out.println("Nombre: " + getNombre());
        System.out.println("Precio Unitario: " + getPrecioUnitario());
        System.out.println("==================================================");
    }
}

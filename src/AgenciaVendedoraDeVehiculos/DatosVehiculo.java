/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AgenciaVendedoraDeVehiculos;

/**
 *
 * @author Camilo
 */
public class DatosVehiculo {
    protected String numeroDeSerie;
    protected String marca;
    protected int año;
    protected double precio;

    public DatosVehiculo(String numeroDeSerie, String marca, int año, double precio) {
        this.numeroDeSerie = numeroDeSerie;
        this.marca = marca;
        this.año = año;
        this.precio = precio;
    }

    public String getNumeroDeSerie() {
        return numeroDeSerie;
    }

    public void setNumeroDeSerie(String numeroDeSerie) {
        this.numeroDeSerie = numeroDeSerie;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
    public void imprimir(){
        System.out.println();
        System.out.println("Numero de Serie : " + this.getNumeroDeSerie());
        System.out.println("Marca : " + this.getMarca());
        System.out.println("Año : " + this.getAño());
        System.out.println("Precio : " + this.getPrecio());
        
    }
    
    
    

    @Override
    public String toString() {
        return "DatosVehiculo{" + "numeroDeSerie=" + numeroDeSerie + ", marca=" + marca + ", a\u00f1o=" + año + ", precio=" + precio + '}';
    }
    
    
    
    
    
    
}

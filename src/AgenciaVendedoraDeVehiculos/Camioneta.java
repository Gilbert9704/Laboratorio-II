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
public class Camioneta extends DatosVehiculo{
    private double capacidadDeCarga;
    private int numeroDeEjes;
    private int numeroDeRodades;

    public Camioneta(double capacidadDeCarga, int numeroDeEjes, int numeroDeRodades, String numeroDeSerie,String marca, int año, double precio) {
        super(numeroDeSerie, marca, año, precio);
        this.capacidadDeCarga = capacidadDeCarga;
        this.numeroDeEjes = numeroDeEjes;
        this.numeroDeRodades = numeroDeRodades;
    }

    public double getCapacidadDeCarga() {
        return capacidadDeCarga;
    }

    public void setCapacidadDeCarga(double capacidadDeCarga) {
        this.capacidadDeCarga = capacidadDeCarga;
    }

    public int getNumeroDeEjes() {
        return numeroDeEjes;
    }

    public void setNumeroDeEjes(int numeroDeEjes) {
        this.numeroDeEjes = numeroDeEjes;
    }

    public int getNumeroDeRodades() {
        return numeroDeRodades;
    }

    public void setNumeroDeRodades(int numeroDeRodades) {
        this.numeroDeRodades = numeroDeRodades;
    }

    public void imprimir(){
        System.out.println();
        System.out.println("Camioneta : ");
        super.imprimir();
        System.out.println("Capacidad de Carga : " + this.getCapacidadDeCarga() + "Kg");
        System.out.println("Numero de Ejes : " + this.getNumeroDeEjes());
        System.out.println("Numero de Rodades : " + this.getNumeroDeRodades());
    }
    
    @Override
    public String toString() {
        return "Camioneta{"  + "capacidadDeCarga=" + capacidadDeCarga + ", numeroDeEjes=" + numeroDeEjes + ", numeroDeRodades=" + numeroDeRodades + "  " + super.toString() +'}';
    }
    
    
    
    
}

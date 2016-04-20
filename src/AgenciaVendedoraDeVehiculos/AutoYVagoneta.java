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
public class AutoYVagoneta extends DatosVehiculo  {
    private int numeroDePasajeros;
    private int tipoDeAuto;

    public AutoYVagoneta(int numeroDePasajeros,int tipoDeAuto, String numeroDeSerie,String marca, int año, double precio) {
        super(numeroDeSerie, marca, año, precio);
        this.numeroDePasajeros = numeroDePasajeros;
        this.tipoDeAuto = tipoDeAuto;
    }

    public int getNumeroDePasajeros() {
        return numeroDePasajeros;
    }

    public void setNumeroDePasajeros(int numeroDePasajeros) {
        this.numeroDePasajeros = numeroDePasajeros;
    }

    public int getTipoDeAuto() {
        return tipoDeAuto;
    }

    public void setTipoDeAuto(int tipoDeAuto) {
        this.tipoDeAuto = tipoDeAuto;
    }

    
    @Override 
    public void imprimir(){
        System.out.println();
        if(this.getTipoDeAuto() == 1){
            System.out.println("Auto Compacto : ");
        }
        if(this.getTipoDeAuto() == 2){
            System.out.println("Auto de Lujo : ");
        }
        if(this.getTipoDeAuto() == 3){
            System.out.println("Vagoneta : ");
        }
        super.imprimir();
        System.out.println("Numero de Pasajeros : " + this.getNumeroDePasajeros());
    }
    
    
    
    
    @Override
    public String toString() {
        return "AutoYVagoneta{"  + "numeroDePasajeros=" + numeroDePasajeros + "  " + super.toString() + '}';
    }
    
    
    

    
    
}

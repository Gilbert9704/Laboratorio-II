/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco;

import java.util.*;

/**
 *
 * @author User
 */
public class CuentaDeAhorros extends Cuenta {
    
    private int dia, mes, año;
    private final double porcIntrs = 0.1;
    Calendar fecha = Calendar.getInstance();
    int day = fecha.get(Calendar.DATE);
    int month = fecha.get(Calendar.MONTH);
    int year = fecha.get(Calendar.YEAR);
    
    HashMap <Integer, CuentaDeAhorros> cuentasAhorro = new HashMap <>();

    public CuentaDeAhorros(String nombreCliente, int numCuenta, double saldoCliente, int dia, int mes, int año) {
        super(nombreCliente, numCuenta, saldoCliente);
        this.dia = day;
        this.mes = month;
        this.año = year;
    }
    
    public void depositarIntereses(){
        
    }
    
    @Override
    public void crearCuenta(){

        super.crearCuenta();
        //Para la fecha de vencimiento
        mes = month;
        mes += 2;
        System.out.println("Fecha de Vencimiento de la Cuenta(DD/MM/AA): " + dia + "/" + mes + "/" + año);
        
        if (cuentasAhorro.containsKey(numCuenta)){
            System.out.println("Este numero de cuenta " + numCuenta + " ya existe, intente nuevamnete");
        }
        else{
            cuentasAhorro.put(numCuenta, new CuentaDeAhorros(nombreCliente, numCuenta, saldoCliente, dia, mes,año));
        }
        
        System.out.println("------------------\nOPERACION EXITOSA\n------------------\n");
    }
    
    @Override
    public void consultarDatos(){
        System.out.println("-----------------\nCONSULTA DE DATOS\n------------------\n"
                            + "Ingrese el Numero de Cuenta:");
        numCuenta = noCuenta.nextInt();
        
        CuentaDeAhorros consulta = cuentasAhorro.get(numCuenta);
        
        if (consulta != null){
            System.out.println("-------------------\nDATOS DE LA CUENTA\n-------------------");
            System.out.println("Nombre del Propietario: " + consulta.getNombreCliente());
            System.out.println("Numero de Cuenta: " + consulta.getNumCuenta());
            System.out.println("Saldo Disponible: " +  consulta.getSaldoCliente());
            System.out.println("Fecha de vencimiento (DD/MM/AA): " + consulta.dia +  "/" + consulta.mes + "/" + consulta.año + 
                                "\n¡¡Sólo es posible Retirar en esta Fecha!!");
        }
    }                                                     
    
    @Override
    public void depositar(){
        double cantDepostd = 0;
        System.out.println("-----------------\nDEPOSITO DE DINERO\n-----------------\n" 
                            + "Ingrese el numero de Cuenta");
        numCuenta = noCuenta.nextInt();
        
        CuentaDeAhorros deposito = cuentasAhorro.get(numCuenta);
        
        if (deposito != null){
            System.out.println("Ingrese la cantidad que sea depositar: ");
            cantDepostd = saldo.nextDouble();
            saldoCliente = deposito.getSaldoCliente();
            saldoCliente += cantDepostd;
            deposito.setSaldoCliente(saldoCliente);
            
            System.out.println("\n------------------\nTRANSACCION EXITOSA\n------------------");
            System.out.println("Numero de Cuenta: " + deposito.getNumCuenta());
            System.out.println("Nombre del Propietario: " + deposito.getNombreCliente());
            System.out.println("Saldo Total Disponible: " + deposito.getSaldoCliente());
            System.out.println("Fecha de Vencimiento: " + deposito.dia + "/" + deposito.mes + "/" + deposito.año +
                                "\n(Recuerde que solo es posible efectuar retiros el dia de la fecha de vencimiento)\n");
        } 
    }
    
    @Override
    public void retirar(){
        
    }
}

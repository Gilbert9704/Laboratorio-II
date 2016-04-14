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
    Calendar fecha = Calendar.getInstance();
    int day = fecha.get(Calendar.DATE);
    int month = fecha.get(Calendar.MONTH);
    int year = fecha.get(Calendar.YEAR);
    
    
    Scanner noCuenta = new Scanner(System.in);
    
    HashMap <Integer, CuentaDeAhorros> cuentasAhorro = new HashMap <>();

    public CuentaDeAhorros(String nombreCliente, int numCuenta, double saldoCliente, int dia, int mes, int año) {
        super(nombreCliente, numCuenta, saldoCliente);
        this.dia = day;
        this.mes = month;
        this.año = year;
    }
   
    @Override
    public void crearCuenta(){

        super.crearCuenta();
        //Para la fecha de vencimiento
        mes += 2;
        System.out.println("Fecha de Vencimiento de la Cuenta(DD/MM/AA): " + dia + "/" + mes + "/" + año);
        
        if (cuentasAhorro.containsKey(numCuenta)){
            System.out.println("Este numero de cuenta " + numCuenta + " ya existe, intente nuevamnete");
        }
        else{
            cuentasAhorro.put(numCuenta, new CuentaDeAhorros(nombreCliente, numCuenta, saldoCliente, dia, mes,año));
        }
    }
    
    @Override
    public void consultarDatos(){
        System.out.println("Ingrese el Numero de Cuenta");
        numCuenta = noCuenta.nextInt();
        
        CuentaDeAhorros consulta = cuentasAhorro.get(numCuenta);
        
        if (consulta != null){
            System.out.println("-------------------\nDATOS DE LA CUENTA\n-------------------");
            System.out.println("Nombre del Propietario: " + consulta.getNombreCliente());
            System.out.println("Numero de Cuenta: " + consulta.getNumCuenta());
            System.out.println("Saldo Disponible: " +  consulta.getSaldoCliente());
            System.out.println("Fecha de vencimiento (DD/MM/AA): " + consulta.dia +  "/" + consulta.mes + "/" + consulta.año + 
                                "\n¡¡Sólo Puede Retirar en esta Fecha!!");
        }
    }                                                     
    
    @Override
    public void depositar(){

    }
    
    @Override
    public void retirar(){
        
    }
}

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
public class CuentaDeCheque extends Cuenta {
    
    HashMap<Integer, CuentaDeCheque> cuentasCheque = new HashMap<>();
    
    public CuentaDeCheque(String nombreCliente, int numCuenta, double saldoCliente) {
        super(nombreCliente, numCuenta, saldoCliente);
    }
    
    public void comsnUsoCheq(){

    }
    
    public void comsCheqSldInsfc(){
        
    }
    @Override
    public void crearCuenta(){
        super.crearCuenta();
        if (cuentasCheque.containsKey(numCuenta)){
            System.out.println("Este numero de cuenta " + numCuenta + " ya existe, intente nuevamnete");
        }
        else{
            cuentasCheque.put(numCuenta, new CuentaDeCheque(nombreCliente, numCuenta, saldoCliente));
        }
        
        System.out.println("------------------\nOPERACION EXITOSA\n------------------\n");
    }
    
    @Override
    public void consultarDatos(){
                System.out.println("-----------------\nCONSULTA DE DATOS\n------------------\n"
                            + "Ingrese el Numero de Cuenta:");
        numCuenta = noCuenta.nextInt();
        
        CuentaDeCheque consulta = cuentasCheque.get(numCuenta);
        
        if (consulta != null){
            System.out.println("-------------------\nDATOS DE LA CUENTA\n-------------------");
            System.out.println("Nombre del Propietario: " + consulta.getNombreCliente());
            System.out.println("Numero de Cuenta: " + consulta.getNumCuenta());
            System.out.println("Saldo Disponible: " +  consulta.getSaldoCliente());
        }
        else {
            System.out.println("Numero de Cuenta Invalido: " + numCuenta);
        }
    }
    
    @Override
    public void depositar(){
        double cantDepostd;
        System.out.println("-----------------\nDEPOSITO DE DINERO\n-----------------\n" 
                            + "Ingrese el numero de Cuenta");
        numCuenta = noCuenta.nextInt();
        
        CuentaDeCheque deposito = cuentasCheque.get(numCuenta);
        
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
        }
    }
    
    @Override
    public void retirar(){
        final double comisionSaldInsft = 5000;
        final double comisionUsoCheq = 1200;
        double cantSolctd;
        System.out.println("-----------------\nRETIRO DE DINERO\n-----------------\n"
                            + "Ingrese el numero de cuenta: ");
        numCuenta = noCuenta.nextInt();
        
        CuentaDeCheque retiro = cuentasCheque.get(numCuenta);//Esta coleccion es la que me impide poder 
                                                              //usar codigo generico ya difiere para cuentas 
        if (retiro != null){                                  //de ahorros y de cheques
            System.out.println("Ingrese la cantidad que desea retirar: ");
            cantSolctd = saldo.nextDouble();
            saldoCliente = retiro.getSaldoCliente();
            
            if (saldoCliente < cantSolctd){
                System.out.println("¡¡ERROR!! FONDOS INSUFICIENTES");
                saldoCliente -= comisionSaldInsft;
                retiro.setSaldoCliente(saldoCliente);
                System.out.println("Costo Comisión: " + comisionSaldInsft);
            }
            else if (saldoCliente >= cantSolctd){ 
                saldoCliente -= cantSolctd;
                saldoCliente -= comisionUsoCheq;
                retiro.setSaldoCliente(saldoCliente);
                
                System.out.println("-----------------\nTRANSACCION EXITOSA\n-----------------");
                System.out.println("Numero de Cuenta: " + retiro.getNumCuenta());
                System.out.println("Nombre del Propietario: " + retiro.getNombreCliente());
                System.out.println("Saldo Total Disponible: " + retiro.getSaldoCliente());
                System.out.println("Costo comisión: " + comisionUsoCheq + "\n");
            }
        }
    }
}

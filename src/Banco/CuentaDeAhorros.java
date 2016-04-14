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
    
    private short contador = 0;
    private int dia, mes, año;
    private final double porcIntrs = 10;
    Calendar fecha = Calendar.getInstance();
    int day = fecha.get(Calendar.DAY_OF_MONTH);
    int month = fecha.get(Calendar.MONTH);
    int year = fecha.get(Calendar.YEAR);
    
    HashMap <Integer, CuentaDeAhorros> cuentasAhorro = new HashMap <>();

    public CuentaDeAhorros(String nombreCliente, int numCuenta, double saldoCliente, int dia, int mes, int año) {
        super(nombreCliente, numCuenta, saldoCliente);
        this.dia = day;
        this.mes = month;
        this.año = year;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
    
    public void depositarIntereses(){
        double capital = 0;
        double interes;
        final int tiempo = 30;
        
        //dia = 1;//El contador es para evitar que se sumen los intereses varias veces en el dia 1
        if (dia == 1 && contador == 0){
            for(CuentaDeAhorros cuentas : cuentasAhorro.values()){
                capital = cuentas.getSaldoCliente();
                //Calculo del Interes
                interes = (capital*tiempo*porcIntrs)/(100*360);
                //fin Calculo
                capital += interes;
                cuentas.setSaldoCliente(capital);
            }
            contador = 1;
        }
    }

    @Override
    public void crearCuenta(){
        super.crearCuenta();
        //Para la fecha de vencimiento
        mes = month;
        mes += 2;
        System.out.println("Fecha de Vencimiento de la Cuenta(DD/MM/AA): " + dia + "/" + mes + "/" + año);
        setDia(dia);
        setMes(mes);
        setAño(año);
        
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
        depositarIntereses();
        System.out.println("-----------------\nCONSULTA DE DATOS\n------------------\n"
                            + "Ingrese el Numero de Cuenta:");
        numCuenta = noCuenta.nextInt();
        
        CuentaDeAhorros consulta = cuentasAhorro.get(numCuenta);
        
        if (consulta != null){
            System.out.println("-------------------\nDATOS DE LA CUENTA\n-------------------");
            System.out.println("Nombre del Propietario: " + consulta.getNombreCliente());
            System.out.println("Numero de Cuenta: " + consulta.getNumCuenta());
            System.out.println("Saldo Disponible: " +  consulta.getSaldoCliente());
            System.out.println("Fecha de vencimiento (DD/MM/AA): " + consulta.getDia() +  "/" + consulta.getMes() + "/" + consulta.getAño() + 
                                "\n¡¡Sólo es posible Retirar en esta Fecha!!");
        }
    }                                                     
    
    @Override
    public void depositar(){
        double cantDepostd;
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
        double cantSolctd;
        System.out.println("-----------------\nRETIRO DE DINERO\n-----------------\n"
                            + "Ingrese el numero de cuenta: ");
        numCuenta = noCuenta.nextInt();
        
        CuentaDeAhorros retiro = cuentasAhorro.get(numCuenta);//Esta coleccion es la que me impide poder 
                                                              //usar codigo generico ya difiere para cuentas 
        if (retiro != null){                                  //de ahorros y de cheques
            System.out.println("Ingrese la cantidad que desea retirar: ");
            cantSolctd = saldo.nextDouble();
            saldoCliente = retiro.getSaldoCliente();
            
            if (saldoCliente < cantSolctd){
                System.out.println("¡¡ERROR!! FONDOS INSUFICIENTES");
            }
            else if (saldoCliente >= cantSolctd && dia == day && mes == month && año == year){ 
                saldoCliente -= cantSolctd;
                retiro.setSaldoCliente(saldoCliente);
                //Aqui se deberia aumentar el mes en 1, para renovar la fecha de vencimiento al siguente mes
                
                System.out.println("-----------------\nTRANSACCION EXITOSA\n-----------------");
                System.out.println("Numero de Cuenta: " + retiro.getNumCuenta());
                System.out.println("Nombre del Propietario: " + retiro.getNombreCliente());
                System.out.println("Saldo Total Disponible: " + retiro.getSaldoCliente());
                System.out.println("Fecha de Vencimiento: " + retiro.dia + "/" + retiro.mes + "/" + retiro.año +
                                    "\n(Recuerde que solo es posible efectuar retiros el dia de la fecha de vencimiento)\n"); 
            }
            else{
                System.out.println("La fecha de vencimiento de su cuenta aún no se ha cumplido, solo es posible retirar en esta fecha");
            }
        }
    }
}

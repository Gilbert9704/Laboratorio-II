/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco;

import java.util.*;
/**
 *<h1> Algoritmo Banco </h1>
 * Este algoritmo, permite crear una cantidad ilimitada de cuentas tanto de Ahorros como de Cheque,
 * permite la consulta de datos, el deposito y el retiro de dinero.
 * 
 * @author Camilo Molina, Jose Celis, Gilbert Angulo
 * @version 1.0
 * @since 16/04/2016
 * 
 */

public abstract class Cuenta {
    protected String nombreCliente;
    protected int numCuenta;
    protected double saldoCliente;
    
    Scanner nombre = new Scanner(System.in);
    Scanner noCuenta = new Scanner(System.in);
    Scanner saldo = new Scanner(System.in);
    
    public Cuenta(String nombreCliente, int numCuenta, double saldoCliente) {
        this.nombreCliente = nombreCliente;
        this.numCuenta = numCuenta;
        this.saldoCliente = saldoCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public int getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    public double getSaldoCliente() {
        return saldoCliente;
    }

    public void setSaldoCliente(double saldoCliente) {
        this.saldoCliente = saldoCliente;
    }
     
    public void crearCuenta(){

        System.out.println("--------------\nCREAR CUENTA\n--------------");
        System.out.println("Ingrese el Número de Cuenta:");
        numCuenta = noCuenta.nextInt();
        System.out.println("Ingrese el Nombre de quien será Titular:");
        nombreCliente = nombre.nextLine();
        System.out.println("Ingrese el Saldo del Cliente");
        saldoCliente = saldo.nextDouble();
    }
    
    public abstract void consultarDatos();
    
    public abstract void depositar();
    
    public abstract void retirar();
}
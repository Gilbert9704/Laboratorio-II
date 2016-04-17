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

public class Banco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String nombre = null;
        byte comando = 0;
        byte comandoPrinc;
        int cuenta = 0;
        int dia = 0, mes = 0, año = 0;
        double saldo = 0;
        
        CuentaDeAhorros cda = new CuentaDeAhorros(nombre, cuenta, saldo, dia, mes, año);
        CuentaDeCheque cdc = new CuentaDeCheque(nombre, cuenta, saldo);
        
        Scanner accion = new Scanner(System.in);
        
        do{
            System.out.println("------------------------");
            System.out.println("    BANCO LA MONEDA");
            System.out.println("------------------------");
            System.out.println("Bienvenido\n ¿Qué accion desea realizar?\n 1-Crear Cuenta\n 2-Consultar Datos\n 3-Depositar\n 4-Retirar");
            comandoPrinc = accion.nextByte();
                
                switch(comandoPrinc){
                    case 1://Crear Cuenta
                        System.out.println("¿Qué tipo de Cuenta?\n 1-Ahorros\n 2-Cheque\n 0-Regresar");
                        comando = accion.nextByte();
                            if (comando == 1){
                                cda.crearCuenta();
                            }
                            else if (comando == 2){
                                cdc.crearCuenta();
                            }
                        break;
                            
                    case 2://Consultar Datos
                        System.out.println("¿Qué tipo de Cuenta?\n 1-Ahorros\n 2-Cheque\n 0-Regresar");
                        comando = accion.nextByte();
                            if (comando == 1){
                                cda.consultarDatos();
                            }
                            else if (comando == 2){
                                cdc.consultarDatos();
                            }
                        break;
                    
                    case 3://Depositar
                        System.out.println("¿Qué tipo de Cuenta?\n 1-Ahorros\n 2-Cheque\n 0-Regresar");
                        comando = accion.nextByte();
                            if (comando == 1){
                                cda.depositar();
                            }
                            else if (comando == 2){
                                cdc.depositar();
                            }
                        break;
                    
                    case 4://Retirar
                        System.out.println("¿Qué tipo de Cuenta?\n 1-Ahorros\n 2-Cheque\n 0-Regresar");
                        comando = accion.nextByte();
                            if (comando == 1){
                                cda.retirar();
                            }
                            else if (comando == 2){
                                cdc.retirar();
                            }
                        break;
                    
                    default:
                        break;
                }
            
        }while (comando <= 4);
        
    }
    
}
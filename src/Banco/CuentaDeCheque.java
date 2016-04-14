/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco;

/**
 *
 * @author User
 */
public class CuentaDeCheque extends Cuenta {

    public CuentaDeCheque(String nombreCliente, int numCuenta, double saldoCliente) {
        super(nombreCliente, numCuenta, saldoCliente);
    }
    
    @Override
    public void crearCuenta(){
        super.crearCuenta();
    }
    
    @Override
    public void consultarDatos(){
        
    }
    
    @Override
    public void depositar(){
        
    }
    
    @Override
    public void retirar(){
        
    }
}

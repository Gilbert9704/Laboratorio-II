/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Juego;

/**
 *<h1> Juego de Computadora </h1>
 * Este algoritmo, permite asignarle valores determinados a los atributos de los objetos
 * tipo marciano y jupiteriano.
 * 
 * @author Camilo Molina, Jose Celis, Gilbert Angulo
 * @version 1.0
 * @since 10/04/2016
 * 
 */

public class Jupiter extends Alien {

    public Jupiter(String tipoDeAlien, String color, int numOjos, int numExtremidades, int numVidas) {
        super(tipoDeAlien, color, numOjos, numExtremidades, numVidas);
    }
    
    @Override
    public String toString(){
        return super.toString();
    }
    
}

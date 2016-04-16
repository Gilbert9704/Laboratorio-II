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

public class Alien {
    protected String tipoDeAlien;
    protected String color;
    protected int numOjos;
    protected int numExtremidades;
    protected int numVidas;
    
    
    public Alien(String tipoDeAlien, String color, int numOjos, int numExtremidades, int numVidas) {
        this.tipoDeAlien = tipoDeAlien;
        this.color = color;
        this.numOjos = numOjos;
        this.numExtremidades = numExtremidades;
        this.numVidas = numVidas;
    }
    
    @Override
    public String toString(){
        return "El Alien es un " + tipoDeAlien + " de color " +  color + " con " + 
                numOjos + " ojos "+ "y " + numExtremidades + " extremidades " + "además tiene  " + numVidas + " vidas "; 
    }
    
}

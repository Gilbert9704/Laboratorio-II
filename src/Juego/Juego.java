/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Juego;

/**
 *
 * @author User
 */
public class Juego {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Tipo de Alien, color, numero de ojos, numero de extremidades, numero de vidas
        Marte m = new Marte("Marciano", "verde", 3, 4, 2);
        Jupiter j = new Jupiter("Jupiteriano", "Azul", 5, 6, 1);
        
        System.out.println(m.toString());
        System.out.println(j.toString());
        
    }
    
}

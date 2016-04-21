/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shape;

/**
 *
 * @author Camilo
 */
public class Rectangle extends Shape {
    
    

    public Rectangle(int numSides,double width, double heigth){
        super(numSides,width, heigth);
    }
    
    
    
    @Override
    public double getArea(){
        double resultado = this.width*this.heigth;
        return resultado;
    }
    
    @Override
    public double getPerimeter(){
        double resultado = (2 * this.width) + (2 * this.heigth);
        return resultado;
        
    }
    
}

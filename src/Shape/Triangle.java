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
public class Triangle extends Shape {
    
    
    public Triangle(int numSides,double width, double heigth){
        super(numSides,width, heigth);
    }
    
    

    @Override
    public double getArea(){
        double resultado = (this.width * this.heigth) / 2;
        return resultado;
    }
    
    @Override
    public double getPerimeter(){
        double resultado = this.width + (2 * ((this.heigth * this.heigth) + (this.width * this.width)));
        return resultado;
        
    }
    
}

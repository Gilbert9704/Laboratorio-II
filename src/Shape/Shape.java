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
public abstract class Shape {
    
    protected int numSides;
    protected double width; 
    protected double heigth;

    public Shape(int numSides, double width, double heigth) {
        this.numSides = numSides;
        this.width = width;
        this.heigth = heigth;
    }

   
    
    public abstract double getArea();
    
    public abstract double getPerimeter();
    

    public int getNumSides() {
        return numSides;
    }

    public void setNumSides(int numSides) {
        this.numSides = numSides;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeigth() {
        return heigth;
    }

    public void setHeigth(double heigth) {
        this.heigth = heigth;
    }
    
    
    
}

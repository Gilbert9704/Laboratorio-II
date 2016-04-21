/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shape;

import java.util.*;
/**
 *
 * @author Camilo
 */
public class Clase9_Shape {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Shape 2.1 ");
        System.out.println("");
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Crear Rectangulo : ");
        System.out.println("Ingrese el Ancho : ");
        double width = sc.nextDouble();
        System.out.println("Ingrese el Alto : ");
        double higth = sc.nextDouble();
        System.out.println("");
        
        Rectangle r = new Rectangle(4, width, higth);
        
        System.out.println("Crear Triangulo : ");
        System.out.println("Ingrese la longitud de los lados : ");
        width = sc.nextDouble();
        System.out.println("Ingrese el Alto : ");
        higth = sc.nextDouble();
        System.out.println("");
        
        Triangle t = new Triangle(3, width, higth);  
        
        System.out.println("Area del Rectangulo = " + r.getArea());
        System.out.println("Perimetro del Rectangulo = " + r.getPerimeter());
        
        System.out.println("");
        System.out.println("Area del Triangulo = " + t.getArea());
        System.out.println("Perimetro del Triangulo = " + t.getPerimeter());
        
        
        
    }
    
}

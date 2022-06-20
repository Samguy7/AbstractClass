/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkgabstract;

/**
 *
 * @author sam
 */
public class Circle extends Shape {

    private double r;

    public double CalculateArea() {
        return Math.PI * Math.pow(r, 2.0);
    }

    public Circle() {
        this.Name = "Circle";
    }

    public Circle(double r) {
        this.r = r;
        this.Name = "Circle";
    }

    public static void main(String[] args) {
        Shape s2 = new Circle(5);
        s2.CalculateArea();
        s2.printShapeName();
        s2.setName("Test Circle");
        s2.printShapeName();
        System.out.println("The area = " + s2.CalculateArea());
    }
}

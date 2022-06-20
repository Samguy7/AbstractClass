/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkgabstract;

/**
 *
 * @author sam
 */
public class Rectangle extends Shape {

    protected double length;
    protected double width;

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public Rectangle() {
        this.Name = "Rectangle";
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
        this.Name = "Rectangle";
    }

    public double CalculateArea() {
        return (this.length * this.width);
    }
}

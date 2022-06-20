/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkgabstract;

/**
 *
 * @author sam
 */
public class InherAndPoly {

    public static void main(String[] args) {
        Shape s1 = new Rectangle(5, 6);
        s1.CalculateArea();
        s1.printShapeName();
        s1.setName("Test Rectangle");
        s1.printShapeName();
        System.out.println("The area = " + s1.CalculateArea());
        ((Rectangle)s1).setLength(55);
        System.out.println("The area = " + s1.CalculateArea());
    }
}

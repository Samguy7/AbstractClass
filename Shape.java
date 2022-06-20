/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkgabstract;

/**
 *
 * @author sam
 */
public abstract class Shape {

    protected String Name;

    public abstract double CalculateArea();

    public String printShapeName() {
        System.out.println("This shape is: " + this.Name);
        return this.Name;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

    public void setName(String name) {
        this.Name = name;
    }

}

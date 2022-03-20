import java.util.Scanner;

// Implement your own abstract classes and interfaces

// abstract class

abstract class Circle {
    abstract void area(double radius);       // abstract method to calculate area of circle.
}

// interface

interface CircleInterface {
    public void perimeter(double radius);    // method to calculate perimeter of circle. 
}

// class MyCircle inheriting the abstract class Circle and implementing CircleInterface

class MyCircle extends Circle implements CircleInterface {
    @Override                                                   // overridding the interface method
    public void perimeter(double radius) {
        double myPerimeter = 6.28 * radius;
        System.out.println("Perimeter of circle is: "+myPerimeter);
    }
    void area(double radius) {                                  // implementing the abstract method
        double myArea = 3.14 * radius * radius;
        System.out.println("Area of circle is: "+myArea);
    }
}

public class Q1 {
    public static void main(String[] args) {
        double radius;
        System.out.println("Enter radius of circle:");
        Scanner sc = new Scanner(System.in);
        radius = sc.nextDouble();
        sc.close();
        MyCircle circle = new MyCircle();
        circle.perimeter(radius);
        circle.area(radius);
    }    
}

// 2. Write a program to print the area of a rectangle by creating a class named
// 'Area' having two methods. First method named as 'setDim' takes length and
// breadth of the rectangle as parameters and the second method named as
// 'getArea' returns the area of the rectangle. Length and breadth of the
// rectangle are entered through the keyboard.

import java.util.Scanner;

public class Area {
    // Instance variables
    private double length;
    private double breadth;

    // Method to set dimensions
    public void setDim(double l, double b) {
        length = l;
        breadth = b;
    }

    // Method to calculate and return area
    public double getArea() {
        return length * breadth;
    }

    // Main method to test the class
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user for length and breadth
        System.out.print("Enter length of the rectangle: ");
        double l = scanner.nextDouble();

        System.out.print("Enter breadth of the rectangle: ");
        double b = scanner.nextDouble();

        // Create object and use methods
        Area rectangle = new Area();
        rectangle.setDim(l, b);
        double area = rectangle.getArea();

        // Print the result
        System.out.println("Area of the rectangle: " + area);

        scanner.close();
    }
}

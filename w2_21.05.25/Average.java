// 4. Print the average of three numbers entered by the user by creating a class
// named 'Average' having a method to calculate and print the average.

import java.util.Scanner;

public class Average {
    // Method to calculate and print average
    public void calculateAverage(double num1, double num2, double num3) {
        double average = (num1 + num2 + num3) / 3;
        System.out.println("The average is: " + average);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get numbers from the user
        System.out.print("Enter first number: ");
        double number1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double number2 = scanner.nextDouble();

        System.out.print("Enter third number: ");
        double number3 = scanner.nextDouble();

        // Create object and call method
        Average avg = new Average();
        avg.calculateAverage(number1, number2, number3);

        scanner.close();
    }
}

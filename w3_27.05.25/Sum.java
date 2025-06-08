// 1.Write a program to calculate the sum of two numbers using a constructor.

import java.util.Scanner;

public class Sum {
    int num1;
    int num2;

    // Constructor to initialize numbers and calculate sum
    public Sum(int a, int b) {
        num1 = a;
        num2 = b;
        int result = num1 + num2;
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + result);
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two numbers from the user
        System.out.print("Enter first number: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int number2 = scanner.nextInt();

        // Create an object and call constructor
        Sum sumObj = new Sum(number1, number2);

        scanner.close();
    }
}

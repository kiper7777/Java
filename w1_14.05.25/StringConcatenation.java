// 4. Write a Java program to concatenate a given string to the end of another
// string.

// Sample output
// String 1: Java and
// String 2: Assignments
// The concatenated string: Java and Assignments

import java.util.Scanner;

public class StringConcatenation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input first string
        System.out.print("String 1: ");
        String str1 = scanner.nextLine();

        // Input second string
        System.out.print("String 2: ");
        String str2 = scanner.nextLine();

        // Concatenate strings
        String result = str1 + " " + str2;

        // Display result
        System.out.println("The concatenated string: " + result);

        scanner.close();
    }
}

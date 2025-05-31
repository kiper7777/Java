// 2.Write a Java program to compare two strings lexicographically.
// Two strings are lexicographically(AsCII value) equal if they are the same length and contain the same characters in the same positions.

// Hint: you can use the Java String compareTo() Method for this assignment.

// Reference https://www.geeksforgeeks.org/java-string-compareto-method-with-examples/

import java.util.Scanner;

public class LexicographicalComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the first string
        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();

        // Get the second string
        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();

        // Compare using compareTo()
        int result = str1.compareTo(str2);

        // Display result
        if (result == 0) {
            System.out.println("The strings are lexicographically equal.");
        } else if (result < 0) {
            System.out.println("\"" + str1 + "\" is lexicographically less than \"" + str2 + "\".");
        } else {
            System.out.println("\"" + str1 + "\" is lexicographically greater than \"" + str2 + "\".");
        }

        scanner.close();
    }
}

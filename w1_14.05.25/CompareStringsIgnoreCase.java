// 3.Write a Java program to compare two strings lexicographically, ignoring
// case differences.

// Reference
// https://www.w3schools.com/java/ref_string_comparetoignorecase.asp

import java.util.Scanner;

public class CompareStringsIgnoreCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input first string
        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();

        // Input second string
        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();

        // Compare strings ignoring case
        int result = str1.compareToIgnoreCase(str2);

        // Display result
        if (result == 0) {
            System.out.println("The strings are lexicographically equal (ignoring case).");
        } else if (result < 0) {
            System.out.println("\"" + str1 + "\" is lexicographically less than \"" + str2 + "\" (ignoring case).");
        } else {
            System.out.println("\"" + str1 + "\" is lexicographically greater than \"" + str2 + "\" (ignoring case).");
        }

        scanner.close();
    }
}

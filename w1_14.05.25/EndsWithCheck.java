// 5.Write a Java program to check whether a given string ends with another
// string.

// "Java Exercises" ends with "se"? false
// "Java Exercise" ends with "se"? true

import java.util.Scanner;

public class EndsWithCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the main string
        System.out.print("Enter the main string: ");
        String mainString = scanner.nextLine();

        // Input the ending string
        System.out.print("Enter the ending string to check: ");
        String ending = scanner.nextLine();

        // Check if main string ends with the given substring
        boolean result = mainString.endsWith(ending);

        // Display the result
        System.out.println("\"" + mainString + "\" ends with \"" + ending + "\"? " + result);

        scanner.close();
    }
}

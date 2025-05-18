//1.Write a Java program to get the character at the given index within the string. 
//Example
//Original String = Software Developer!                                                                           
//The character at position 0 is S 
//The character at position 10 is e

import java.util.Scanner;

public class CharacterAtIndex {
    public static void main(String[] args) {
        String input = "Software Developer!";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Original String = " + input);

        System.out.print("Enter an index: ");
        int index = scanner.nextInt();

        if (index >= 0 && index < input.length()) {
            char result = input.charAt(index);
            System.out.println("The character at position " + index + " is " + result);
        } else {
            System.out.println("Error: Index out of range. Valid range is 0 to " + (input.length() - 1));
        }

        scanner.close();
    }
}

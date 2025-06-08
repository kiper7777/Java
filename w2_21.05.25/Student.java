// 1. Create a class named 'Student' with String variable 'name' and integer
// variable 'roll_no'. Assign the value of roll_no as '2' and that of name as
// "John" by creating an object of the class Student.

public class Student {
    // Instance variables
    String name;
    int roll_no;

    public static void main(String[] args) {
        // Creating an object of the class Student
        Student s1 = new Student();

        // Assigning values
        s1.name = "John";
        s1.roll_no = 2;

        // Printing the values
        System.out.println("Name: " + s1.name);
        System.out.println("Roll No: " + s1.roll_no);
    }
}

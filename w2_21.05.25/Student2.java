public class Student2 {
    // Instance variables
    String name;
    int rollNo;
    String phoneNumber;
    String address;

    // Method to print student details
    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Address: " + address);
        System.out.println(); // blank line between students
    }

    // Main method to test
    public static void main(String[] args) {
        // Create first student Sam
        Student2 student1 = new Student2();
        student1.name = "Sam";
        student1.rollNo = 1;
        student1.phoneNumber = "1234567890";
        student1.address = "123 Main Street";

        // Create second student John
        Student2 student2 = new Student2();
        student2.name = "John";
        student2.rollNo = 2;
        student2.phoneNumber = "9876543210";
        student2.address = "456 Park Avenue";

        // Print details
        System.out.println("Student 1:");
        student1.printDetails();

        System.out.println("Student 2:");
        student2.printDetails();
    }
}

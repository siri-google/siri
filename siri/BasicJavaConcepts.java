// Basic Java program demonstrating essential concepts
class Student {
    // Instance variables
    String name;
    int age;

    // Constructor to initialize Student object
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display student details
    void displayInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
    }
}

public class BasicJavaConcepts {
    public static void main(String[] args) {
        // Primitive data types
        int num = 10;  // Integer variable
        double price = 99.99; // Double variable
        char grade = 'A'; // Character variable
        boolean status = true; // Boolean variable

        // Displaying variable values
        System.out.println("Integer Value: " + num);
        System.out.println("Double Value: " + price);
        System.out.println("Character Value: " + grade);
        System.out.println("Boolean Value: " + status);

        // Using loops (for loop)
        System.out.println("\nLoop Example:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Iteration: " + i);
        }

        // Using conditional statement (if-else)
        System.out.println("\nConditional Statement Example:");
        if (num > 5) {
            System.out.println("Number is greater than 5");
        } else {
            System.out.println("Number is 5 or less");
        }

        // Creating and using an object
        Student student1 = new Student("Suraj", 20);
        System.out.println("\nObject-Oriented Programming Example:");
        student1.displayInfo();
    }
}
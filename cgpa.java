import java.util.*;

// Parent class
class student {
    String name;
    float total_percentage;
    Scanner scanner = new Scanner(System.in);

    public void accept() {
        System.out.print("Enter Name :");
        name = scanner.next();
        System.out.print("Enter Total CGPA :");
        total_percentage = scanner.nextFloat();
    }
}

class details extends student {
    public void cgpatopercentage() {
        System.out.println("Name : " + name);
        System.out.println("Percentage : " + total_percentage * 9.5);
    }
    
    public void percentagetocgpa() {
        System.out.print("Enter Total Percentage :");
        total_percentage = scanner.nextFloat();
        System.out.println("Name : " + name);
        System.out.println("CGPA : " + total_percentage / 9.5);
    }
}

// Derived class
public class cgpa {
    // Main function
    public static void main(String[] args) {
        details obj = new details();
        obj.accept();
        System.out.println("__________");
        obj.cgpatopercentage();
        obj.percentagetocgpa();
        System.out.println("__________");
    }
}


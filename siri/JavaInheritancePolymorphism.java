// Demonstrating Inheritance and Polymorphism

// Single Inheritance - Parent Class
class Animal {
    void makeSound() {
        System.out.println("Animals make sounds...");
    }
}

// Single Inheritance - Child Class
class Dog extends Animal {
    void specificSound() {
        System.out.println("Dog barks...");
    }
}

// Multilevel Inheritance
class Puppy extends Dog {
    void puppySound() {
        System.out.println("Puppy whines...");
    }
}

// Hierarchical Inheritance
class Cat extends Animal {
    void specificSound() {
        System.out.println("Cat meows...");
    }
}

// Multiple Inheritance using Interfaces
interface Flyable {
    void fly();
}

class Bird extends Animal implements Flyable {
    public void fly() {
        System.out.println("Bird flies...");
    }
}

// Polymorphism - Method Overloading
class MathOperations {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }
}

// Polymorphism - Method Overriding
class Vehicle {
    void move() {
        System.out.println("Vehicles can move...");
    }
}

class Car extends Vehicle {
    @Override
    void move() {
        System.out.println("Car moves faster...");
    }
}

public class JavaInheritancePolymorphism {
    public static void main(String[] args) {
        // Demonstrating Inheritance
        Dog dog = new Dog();
        dog.makeSound();
        dog.specificSound();

        Puppy puppy = new Puppy();
        puppy.makeSound();
        puppy.specificSound();
        puppy.puppySound();

        Cat cat = new Cat();
        cat.makeSound();
        cat.specificSound();

        Bird bird = new Bird();
        bird.makeSound();
        bird.fly();

        // Demonstrating Method Overloading
        MathOperations math = new MathOperations();
        System.out.println("Addition (int): " + math.add(5, 10));
        System.out.println("Addition (double): " + math.add(5.5, 10.5));

        // Demonstrating Method Overriding
        Vehicle myCar = new Car();
        myCar.move();
    }
}
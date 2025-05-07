/*
class First extends Thread {
    public void run() {
        System.out.println("Thread is Running from First class");
    }
}

class Second extends Thread {
    public void run() {
        System.out.println("Thread is Running from Second class");
    }
}

public class multithread {
    public static void main(String[] args) {
        First obj1 = new First();
        Second obj2 = new Second();

        obj1.start(); // Start the first thread
        obj2.start(); // Start the second thread
    }
}
*/

class First implements Runnable {
    public void run() {
        System.out.println("Thread is Running from First class");
    }
}

class Second implements Runnable {
    public void run() {
        System.out.println("Thread is Running from Second class");
    }
}

public class multithread {
    public static void main(String[] args) {
        First obj1 = new First();
        Second obj2 = new Second();

        Thread thread1 = new Thread(obj1); // Create Thread instance for the first Runnable
        Thread thread2 = new Thread(obj2); // Create Thread instance for the second Runnable

        thread1.start(); // Start the first thread
        thread2.start(); // Start the second thread
    }
}




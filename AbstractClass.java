abstract class AbstractClassstd {
    abstract void display();
}

interface SY {
    void show();
}

class SYA extends AbstractClassstd implements SY {
    public void display() {
        System.out.println("Abstract Class");
    }
      public void show() {
        System.out.println("Hello, my name is Suraj");
    }
}

public class AbstractClass{
    public static void main(String[] args) {
    
        SYA sya = new SYA();
        sya.show();
        sya.display();
    }
}


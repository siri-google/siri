// concept of single inheritance
import java.util.*;
//final keyword is to stop the inheritance 
// Parent class
class One{
    String name = "Suraj";
    public void print_hello(){
        System.out.println("Hello " +name);
    }
}

final class Two extends One{
    public void print_name(){ 
      System.out.println("Welcome Back"); 
    }
}
/*
class three extends Two{
  public void display(){
    System.out.println("class three");
  }
}
*/

// Derived class
public class one{
      // Main function
    public static void main(String[] args){
        Two obj = new Two();
        obj.print_hello();
        obj.print_name();
    }
}

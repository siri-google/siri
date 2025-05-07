class A{
	void display(){
		System.out.println("Parent Class");
	}
}

class B extends A{
	void display(){
	//super is used to reduce the ambiguity
		super.display();
		System.out.println("Child Class");
	}
}

public class funOverride{
public static void main(String[] args){
	B objB = new B();
	objB.display();
}
}

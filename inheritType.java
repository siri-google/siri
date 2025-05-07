class A{
	void display(){
		System.out.println("Class A");
	}
}
//child of A (hierarchical)
class B extends A{
	void display(){
		System.out.println("Class B");
	}
}
//child of A (hierarchical)
class C extends A{
	void display(){
		System.out.println("Class C");
	}
}
//child of B and GrandChild of A (multilevel)
class E extends B{
	void display(){
		System.out.println("Class E");
	}
}

public class inheritType{
	public static void main(String[] args){
		E objE = new E();
		objE.display();
	}

}

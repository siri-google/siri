class add{
	void add(){
		System.out.println("normal add without parameter");
	}
	
	void add(int a , int b){
		System.out.println("Addition of Integer Number");
	}
	void add(float a , float b){
		System.out.println("Addition of float Number");
	}
}

public class funcionoverload{
	public static void main(String[] args){
		add obj = new add();
		obj.add();
	}
}

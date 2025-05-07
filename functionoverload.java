class functionoverload{
	void add(){
		System.out.println("normal add without parameter");
	}
	
	void add(int a , int b){
		System.out.println(a + b);
	}
	void add(double a , double b){
		System.out.println(a + b);
	}
  
  


	public static void main(String[] args){
		functionoverload obj = new functionoverload();
		obj.add();
		obj.add(3,4);
		obj.add(2.3,7.5);
	}
}

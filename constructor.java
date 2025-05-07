class constructor{
	String firstname;
	int myage;
	//default constructor
	constructor(){
		System.out.println("constructor is initialised");
	}
  //default constructor
  	constructor(String name){
  	firstname = name;
		System.out.println("my names is : " + firstname );
	}
	
	constructor(int age){
  	myage = age;
		System.out.println("my age is : " + myage );
	}
  //copy constructor
  
   // constructor(constructor obj){
    //	firstname = obj.name;
	//	System.out.println(firstname +" is initialised");
//	}


	public static void main(String[] args){
		constructor obj = new constructor();
		constructor obj1 = new constructor("suraj");
		constructor obj2 = new constructor(19);
	//	constructor obj2 = new constructor(obj1);
	}
}

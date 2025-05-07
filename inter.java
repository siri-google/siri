interface a{
	public void displaya(){
		System.out.println("ok");
	}
}

interface b{
	public void displayb(){
		System.out.println("not ok");
	}
}


interface c implements a, b {
	
}


public class inter{
	public static void main(String[] args){
		b obj = new b();
		obj.displayb();
		obj.displayb(); 
	}
}

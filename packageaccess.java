import pack.*;
public class packageaccess{
	public static void main(String[] args){
		pack.a obj = new pack.a();
		obj.msg();
	}
}

/*
create a folder as "pack" . in which create a file named as a.java
a.java >
package packagename;
public class filename{
	public void functionname(){
		//execution
	}
}

come out of the folder and create a new file to access named as "access.java" and write the code in 
access.java>
import foldernamewhichpackageispresent.*;
public class filename{
	public static void main(String[] args){
		packagefoldername.packagefilename obj = new packagefoldername.packagefilename();
		obj.functionname();
	}
}

then compile both file and then execute the access.java file
*/ 

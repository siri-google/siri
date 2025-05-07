import java.util.*;
public class palnum{
	public static void main(String[] args){
	  Scanner scanner = new Scanner(System.in);
	  System.out.print("Enter Number To Check :");
	  int num=scanner.nextInt();
	  int reverse =0;
	  int original =num;
	  while (num>0){
		  int remainder = num%10;
		  reverse=(reverse *10) + remainder;
		  num = num /10;
	  }
	  
	  if(original== reverse){
		  System.out.println(+original+" is Palindrome");
	  }
	  else{
	  	System.out.println(+original+ " is Not Palindrome");
	  }
	
	}
}

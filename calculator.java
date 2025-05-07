import java.util.*;
public class calculator{
	public static void main(String[] args){
		int a,b,c;
		int result;
		int choice;
		Scanner cin = new Scanner(System.in);
		
		
		do{
			System.out.println("Calculator\n1.Add\n2.Subtract\n3.Multiply\n4.Divide\n5.Modulus\n6.Custom Power\n7.cube\n8.Exit");
			System.out.println("Enter Your Choice :");
			choice =cin.nextInt();
				
			switch(choice){
			
				case 1:
					System.out.println("Enter First Number :");
					a =cin.nextInt();
					System.out.println("Enter Second Number :");
					b =cin.nextInt();
					result = a+b;
					System.out.println("Result Of Addition : " +result);
				break;
			
				case 2:			
					System.out.println("Enter First Number :");
					a =cin.nextInt();
					System.out.println("Enter Second Number :");
					b =cin.nextInt();
					result = a-b;
					System.out.println("Result Of Subtraction : " +result);
				break;
			
				case 3:
					System.out.println("Enter First Number :");
					a =cin.nextInt();
					System.out.println("Enter Second Number :");
					b =cin.nextInt();
					result = a*b;
					System.out.println("Result Of Multiplication : " +result);
				break;
			
				case 4:
					System.out.println("Enter First Number :");
					a =cin.nextInt();
					System.out.println("Enter Second Number :");
					b =cin.nextInt();
					result = a/b;
					System.out.println("Result Of Division : " +result);
				break;
			
				case 5:
					System.out.println("Enter First Number :");
			
					a =cin.nextInt();
					System.out.println("Enter Second Number :");
					b =cin.nextInt();
					result = a%b;
					System.out.println("Remainder Of Modulus : " +result);
				break;
			
				case 6:
					result = 0;
					System.out.println("Enter Number :");
					a =cin.nextInt();
					System.out.println("Enter Power Number :");
					b =cin.nextInt();
					System.out.println("Result Of Power : " + Math.pow(a,b));
				break;
			
				case 7:
					System.out.println("Enter Number for Cube :");
					a =cin.nextInt();
					System.out.println("Result Of Power : " + Math.pow(a,3));
				break;
			
				default: 
					System.out.println("Enter Valid Choice!...");
			}
				
		}while(choice!=8);
		
	}
}

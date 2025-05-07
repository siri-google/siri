import java.util.*;
public class prime{
	public static void main(String[] args){
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter Number To Check : ");
		int num  = scanner.nextInt();
		int flag =0;
		for(int i =2;i<num;i++){
			if(num%1==0 && num%num==0 && num%i!=0){
				flag =1;
				break;
			}
		}
		if(flag==1){
			System.out.println("Number : "+num+" is Prime");
		}
		else if (flag ==0){
			System.out.prinln("test");
		}
		else{
			System.out.println("Number : "+num+" is Not Prime");
		}
		scanner.close();
	}
}

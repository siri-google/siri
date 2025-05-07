import java.util.*;
public class array{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int[] arr = new int[5];
		
		for(int i =0;i<5;i++){
			System.out.print("Enter "+i+ " th Element : ");
			arr[i] =scanner.nextInt();
		}
		for(int j=0;j<5;j++){
			System.out.println("Element at "+j+" Position is : "+arr[j]);;
		}
		
	}
}

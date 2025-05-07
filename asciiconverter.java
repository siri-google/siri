import java.util.*;
//using scanner , string methods , and typecasting
public class asciiconverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = scanner.nextLine();
		System.out.print("String In ASCII :");
        
        for(int i = 0; i < str.length(); i++) {
            System.out.print((int)str.charAt(i) + " ");
        }
        
		System.out.println("\nLength Of String : "+str.length());
		System.out.println("String In UpperCase: "+str.toUpperCase());
		System.out.println("String In UpperCase: "+str.toLowerCase());
		
        scanner.close();
    }
}


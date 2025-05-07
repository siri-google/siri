public class sumeven{
	public static void main(String[] args){
		int sumEven=0;
		for(int i =0;i<=100;i++){
			if(i%2==0){
				sumEven = sumEven+i;
			}
		}
		System.out.println("Sum Of 1 To 100 Even Numbers :" +sumEven);
		
		//sum of odd
		int sumOdd = 0;
		for(int i =0;i<=100;i++){
			if(i%2==1){
				sumOdd = sumOdd+i;
			}
		}
		System.out.println("Sum Of 1 To 100 Even Numbers :" +sumOdd);
	}
	
	
}

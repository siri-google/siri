public class sumprogram{
	public static void main(String[] args){
	int num =24634,sum=0,rem=0;
		while(num>0){
			rem = num %10;
			sum=sum+rem;
			num = num %10;
		}
		System.out.println("NUM :"+num +"SUM :"+sum+"Rem :"+rem);
	}
}

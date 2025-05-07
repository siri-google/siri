import java.lang.Math;
public class pkg{
	public static void main(String[] args){
		int a = 5 , b=2;
		double c;
		int[] d = {1,2,3,4,5,6};
		String[] names ={"abc","def","ghi"};
		c = Math.pow(a,b);
		System.out.println(c);
		System.out.println(Math.sqrt(3));
		System.out.println(Math.cbrt(9));
		
		//random number generate
		int randomNumber = (int) (Math.random() * 100) + 1;
        System.out.println("Random number between 1 and 100 = " +randomNumber);
	//min and max value 
	
        System.out.println("Maximum of 5 and 2 = " + Math.max(a, b));
        System.out.println("Minimum of 5 and 2 = " + Math.min(a, b));
        
        System.out.println("Minimum value in the array for 2 nd and 5 th position = " + Math.min(d[5],d[2]));
        // degree to radian
        int radius = 45 ;
        double radian = Math.toRadians(radius);
        System.out.println(radius+" Degree to Radian : "+radian);
        //array 
        System.out.println("Length Of Array : "+d.length);
        System.out.print("String Elements Are : ");
        for(int i =0;i< names.length;i++){
        	System.out.print(names[i]+" ");
        }
	}
}

//write a function which takes variable no of int numbers as an argument and return the sum of these argument as an output
public class Vararg {

	public static int sum(int...a) {
		
		int sum=0;
		for(int i=0; i<a.length;i++) 
		{
			sum=sum+a[i];
		}
		System.out.println("Sum of "+a.length +" is " +sum);
	
	
	return 0;
	}
     public static void main(String[] args) {
		// TODO Auto-generated method stub
         sum(10,20,30,40);
	}

}

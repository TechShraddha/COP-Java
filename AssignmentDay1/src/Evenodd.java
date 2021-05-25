import java.util.Scanner;

public class Evenodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,num;  //declare variable i,num
		int oddSum=0,evenSum=0;
		//declare and initialize variables oddSum,evensum
		Scanner scan=new Scanner(System.in);
		//create a scanner object for input
		System.out.print("Enter the number for num: \n");
		num=scan.nextInt();//reads num1 from user
		for(i=1; i<=num; i++){  
		if(i%2==0) 
		    evenSum=evenSum+i;
		else
		    oddSum=oddSum+i;
		}
		System.out.println("Sum of all odd numbers are: "+oddSum);
		System.out.println("Sum of all even numbers are: "+evenSum);
	}

}

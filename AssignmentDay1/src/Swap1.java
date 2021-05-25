import java.util.Scanner;

public class Swap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int no1=10;
 int no2=20;
 int t;
 Scanner sc =new Scanner(System.in);
 

 
 System.out.println("Before Swapping");
 System.out.println("num1:"+no1);
 System.out.println("num2:"+no2);
 
 t=no1;
 no1=no2;
 no2=t;
 
 System.out.println("After Swapping");
 System.out.println("num1:"+no1);
 System.out.println("num2:"+no2);
 
	}

}

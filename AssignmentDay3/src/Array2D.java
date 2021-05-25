//write a java program to accept 2D array element. Display all elements.

import java.util.Scanner;



public class Array2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] arr=new  int[3][3];
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter array element");
		for (int i=0 ;i<3; i++) 
		{
			for(int j=0; j<3 ;j++) 
			{
				arr[i][j]=sc.nextInt();//accept array
			}
		}
		for (int i=0 ;i<3; i++) 
		{
			for(int j=0; j<3 ;j++) 
			{
				System.out.print(arr[i][j]+ " ");//printing array
			}
			System.out.println();//going to next line
		}
		

	}

}

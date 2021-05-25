import java.util.Arrays;
import java.util.Scanner;

public class ArrayAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr;//declare array
		int no ,sum=0;
		int choice;
		boolean flag= true;
		 Scanner sc= new Scanner(System.in);
		 
		 System.out.println("Enter size");
	     int size =sc.nextInt();//accept size from user
	     arr=new int[size];//initialize
		 
		 System.out.println("----Array Operation----");
		 System.out.println("1:Read Array");
		 System.out.println("2:Show Element In Array");
		 System.out.println("3:Search Element In Array");
		 System.out.println("4:Sum of Array");
		 System.out.println("5:Sort Array");
		 System.out.println("6:Exit");
		 
		
		 while(flag!=false) {
			 System.out.println("Enter Choice");
			 choice=sc.nextInt();
			 
			
			switch (choice) {
			 case 1: 
				 System.out.println("Enter element");
			     //read array
			     for( int i=0;i<arr.length;i++) {
			    	 
			    	 arr[i]=sc.nextInt();
			     }
			         break;
			 case 2:
				 System.out.println("Enter Element");
				  
				// for (int i=0; i<arr.length; i++) {
					 
				//	 System.out.println(arr[i]);
				 //}
				 
				 
				 for (int i:arr) {
					 
					 System.out.println(i);
					 
				  }
				 break;
			 case 3:
				 System.out.println("Enter the no to search");
				 no=sc.nextInt();
				 
				 for(int i=0; i<arr.length; i++)
				 {
					 
					 if(arr[i]==no)
					 {
						 System.out.println("no present at index:"+i);
					 }
				 }
				 
				 
				 break;
			 case 4:for(int i=0;i<arr.length ;i++) 
		         	 {
				 
			             sum=sum+arr[i];	 
				      }
			          System.out.println("sum="+sum);
			 
			 
			// for each loop
			 /*for(int i:arr) {//integer in array
				 sum=sum+i;
				
			 }
			 System.out.println("sum="+sum);*/
			 
				 break;
			 case 5:
				 Arrays.sort(arr);//arrays class in java.util
				 System.out.println("----------After Sort-------- ");
				 
				 for(int i:arr) {
					 System.out.println(i);;
					  }
				 break;
			 case 6:
				 flag=false;
				 break;
				 default:
					 break;
			 }
		 }
	}

}

import java.util.Scanner;
public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] arrs=new int[5];
		Scanner sc=new Scanner (System.in);
		
		
		System.out.println("Accept array element");
		for(int i=0 ;i<arrs.length; i++)//accept array from users
		{
			arrs[i]=sc.nextInt();
		}
		
		System.out.println("Original Array are");//read array
		
		for(int i=0;i<arrs.length;i++)
		{
			System.out.print(arrs[i]+ " ");
		}
		
		System.out.println("Reversed Array are");//reverse order array
		
		
		for(int i=arrs.length-1; i>=0; i--) {
			System.out.print(arrs[i]+ " ");
		}
	}

}

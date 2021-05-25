import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr= new int[5];
		arr[0]=11;
		arr[1]=12;
		arr[2]=13;
		arr[3]=14;
		arr[4]=15;
		for (int i=0; i<5 ;i++)
		{
			System.out.println(arr[i]);//array element always retrive index only
		}
		System.out.println("---------");
		
		
		String[] names= {"radha","sham ","meera" ,"neha","ram"};//equivalent to arr[0]=radha like
				
		for (int i=0; i<names.length ;i++)
		{
			System.out.println(names[i]);
		}
		
		
		System.out.println("---------");
		int[] arrs= new int[5];//accept array from users
		Scanner sc= new Scanner(System.in);//read array
		for (int i=0; i<arrs.length ;i++)
		{
			arrs[i]=sc.nextInt();
		}
		
		
		System.out.println("---------");
		
		for (int i=0; i<arrs.length ;i++)
		{
			System.out.println(arrs[i]);
		}
		
		
		//for each loop use for coolection
		//for (int i:arrs)//for each int in array
		//{
			//System.out.println(i);}
		
	}
	}


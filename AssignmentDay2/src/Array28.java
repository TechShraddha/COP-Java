import java.util.Scanner;

public class Array28 {

	
		
		
		public static void main(String[] args) 
		{
			int index;
			boolean flag=true;
			System.out.println("Enter size of array.");
			Scanner sc = new Scanner(System.in);
		    int num = sc.nextInt();
			int[]arr = new int[num];
			System.out.println("Enter Elements array");
			for(int i=0;i<arr.length;i++)
			{
				arr[i]= sc.nextInt();
			}
			System.out.println("Enter no whose index to search.");
			index=sc.nextInt();
			for(int i=0;i<arr.length;i++)
			{
			     if(index==arr[i])
				{
				    index=i;
					System.out.println(index);
					flag=false;
				    break;
				}
			      else 
			    {
		        flag=true;
				System.out.println("No not exist");
				break;
			     }		
		}
		}

	}



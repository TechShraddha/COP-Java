import java.util.Scanner;

public class allarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,num,min,max;
		double avg,total=0.0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array: ");
		num= sc.nextInt();
		System.out.println("Elements of array");

		int array[]= new int[num];

		for(i=0;i<num;i++)
		{
			array[i]=sc.nextInt();
		}
		sc.close();
		for(i=0;i<num;i++)
		{
			total= total+array[i];
		}
		min=max=array[0];
		for(i=0;i<num;i++)
		{
			if(min>array[i])
				min=array[i];
			if(max<array[i])
				max=array[i];
		}
		avg= total/num;
		System.out.println("Sum of all nos is: "+total);
		System.out.println("Average of all nos is: "+avg);
		System.out.println("Minimum no in array is: "+min);
		System.out.println("Maximum no in array is: "+max);
		}
		

	}




import java.util.Scanner;

public class armstrongno
{
public static void main(String[] args) 
{

	int r,n,sum=0,temp;
	System.out.println("Enter any number.");
	Scanner sc  = new Scanner(System.in);
	n = sc.nextInt();
	sc.close();
	temp=n;
	while(n>0)
	{
		r = n%10;
		sum = sum+(r*r*r);
		n = n/10;
	}
	if(temp==sum)
	{
		System.out.println("Entered no "+temp+" is Armstrong number");
	}
	else
		System.out.println("Entered no "+temp+" is not Armstrong numbercc");
}
}




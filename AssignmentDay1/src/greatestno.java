import java.util.Scanner;

public class greatestno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		

			int a,b,c;
			System.out.println("Enter any 3 nos.");
			Scanner sc = new Scanner(System.in);
			a = sc.nextInt();
			b = sc.nextInt();
			c = sc.nextInt();
			sc.close();
			if(a>b && a>c)
			{
				System.out.println("Maximum is"+a);
			}
			else if(b>a)
			{
				System.out.println("Maximum is "+b);
			}
			else
			{
				System.out.println("Maximum is "+c);
			}
		}

	}



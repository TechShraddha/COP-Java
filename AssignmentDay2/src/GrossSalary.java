import java.util.Scanner;

public class GrossSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int basic;
		double hra=0,da=0,gross=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your basic salary:");
		basic = sc.nextInt();
		if(basic<=10000)
		{
			hra = basic*0.2;
			da = basic*0.8;
		}
		else if(basic>10000 && basic<=20000)
		{
			hra = basic*0.25;
			da = basic*0.9;
		}
		else if(basic>20000)
		{
			hra = basic*0.3;
			da = basic*0.95;
		}
		sc.close();
		gross = basic+hra+da;
		System.out.println("The gross salary of employee is: "+gross); 
		}
		

	}



import java.util.Scanner;
public class Customer {
	
	private String  name;
	private String email;
	private int age;
	private double creditlimit;


	public Customer(String name, String email, int age, double creditlimit)
	{
		
		this.name = name;
		this.email = email;
		this.age = age;
		this.creditlimit = creditlimit;
	}


	public Customer() {
		System.out.println("Name:Riya");
		System.out.println("Email:riya@gmail.com");
		System.out.println("Age:25");
		System.out.println("Creditlimit:10000");
		
		
	}


	public void acceptCustomer() 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Name:");
		name=sc.next();
		
		System.out.println("Email:");
		email=sc.next();
		
		System.out.println("Age:");
		age=sc.nextInt();
		
		System.out.println("Creditlimit:");
		creditlimit=sc.nextDouble();
	}


	public void setCreditlimit(double creditlimit) {
		this.creditlimit = creditlimit;
	}

	public double getCreditlimit() {
		return creditlimit;
	}


	public void displayCustomer() 
	{
		
		System.out.println("Name:"+name);
		System.out.println("Email:"+email);
		System.out.println("Age:"+age);
		System.out.println("Creditlimit:"+creditlimit);
		
	}
	}



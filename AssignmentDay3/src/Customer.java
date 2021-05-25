import java.util.Scanner;

//8: Create a java application for the following.
// Create a Customer class , with data members (all private : tight encapsulation)
//name(String),email(String),age(int).
//Supply a parameterized constructor to accept all details from user.
//Supply an argument less  constructor to init default name to "Riya" , email to "riya@gmail.com",age=25.
//Write a method displayCustomer to display customer details.
public class Customer
{

	private String name;
	private String email;
	private int age;
	
	public  void acceptInfo()
	{
	Scanner sc=new Scanner(System.in);
	 System.out.println("Name:");
	 name=sc.next();
	 
	 System.out.println("Email:");
	 email=sc.next();
	 
	 System.out.println("Age:");
	 age=sc.nextInt();
	
	}
	
	public Customer(String name,String email,int age) 
	{
		System.out.println("----invoking parameterized constructor--");
	this.name=name;
	this.email=email;
	this.age=age;
	
	
	}
	public void displayInfo() 
	{
	System.out.println("Name:"+name);
	System.out.println("Email:"+email);
	System.out.println("Age:"+age);
	
	}
}

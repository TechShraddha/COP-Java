import java.util.Scanner;

public class Customer2 {
private String  name;
private String email;
private int age;
private double creditlimit;
 

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

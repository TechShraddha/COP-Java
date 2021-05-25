import java.util.Scanner;

public class Employee

{
private int empid;
private String name;
private double Basicsalary;
private double HRA;
private double Medical;
private double PF;
private double PT;
private double Netsalary;
private double Grosssalary;


public void AcceptEmployee() 
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Empid:");
	empid=sc.nextInt();
	System.out.println("Name:");
	name=sc.next();
	System.out.println("Basicsalary:");
	Basicsalary=sc.nextDouble();
	//System.out.println("HRA:");
	//HRA=sc.nextDouble();
	System.out.println("Medical:");
     Medical=sc.nextDouble();
	
	HRA=0.5 * Basicsalary;
	PF=0.12* Basicsalary;
	PT=200;
	Grosssalary=Basicsalary + HRA+ Medical;
	Netsalary=Grosssalary -(PT+PF);
}


public void DisplayEmployee() 
{
	System.out.println("Empid:"+empid);
	System.out.println("Name:"+name);
	System.out.println("Basicsalary:"+Basicsalary);
	System.out.println("HRA:"+HRA);
	System.out.println("Medical:"+Medical);
	System.out.println("PF:"+PF);
	System.out.println("PT:"+PT);
	System.out.println("Netsalary:"+Netsalary);
	System.out.println("Grosssalary:"+Grosssalary);
}

}
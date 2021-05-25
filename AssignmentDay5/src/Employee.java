import java.util.Scanner;

public class Employee {


	private int empid;//hide from outside world
	private String name;//private are accessible inside class
	private String add;
	
	private double salary;//member variable/fields/attributes
	
	
	private Scanner sc=new Scanner(System.in);
	
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAdd() {
		return add;
	}
	public void setAdd(String add) {
		this.add = add;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	public void acceptInfo() {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter id:");
		setEmpid(sc.nextInt());
		System.out.println("Enter name:");
		setName(sc.next());
		System.out.println("Enter salary:");
		setSalary(sc.nextDouble());
		System.out.println("Enter address:");
		setAdd(sc.next());
		
		}
	public void displayInfo()
	{
		
		System.out.println("id:"+getEmpid());
		System.out.println("Name="+getName());
		System.out.println("Salary="+getSalary());
		System.out.println("Address="+getAdd());
	}
}

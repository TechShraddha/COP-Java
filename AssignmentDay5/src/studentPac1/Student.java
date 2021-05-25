package studentPac1;

import java.util.Scanner;

public class Student {
public int rollno;
protected String name;
private String grade;
int marks;//default
	
	
	public void AcceptInfo() 
	{
		Scanner sc=new Scanner (System.in);
System.out.println("Rollno:");
rollno=sc.nextInt();
	
System.out.println("Name:");
name=sc.next();
System.out.println("Grade:");
grade=sc.next();
System.out.println("marks:");
marks=sc.nextInt();
	}
	
	
	public void DisplayInfo() 
	
	{
		System.out.println("Rollno:"+rollno);
		
			
		System.out.println("Name:"+name);
	
		System.out.println("Grade:"+grade);
	
		System.out.println("marks:"+marks);
		
    }
}
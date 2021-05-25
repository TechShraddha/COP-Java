import java.util.Scanner;

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc =new Scanner(System.in);
System.out.println("Enter the no of employees :");
int n =sc.nextInt();
Employee[] emp =new Employee[n];
 
 for (int i=0 ;i<emp.length; i++) 
 {
    emp[i]=new Employee();
    System.out.println("");
    System.out.println("Enter Employee details :");
    emp[i].acceptInfo();
	}
 for (int i=0 ;i<emp.length; i++) 
 {
    
    System.out.println("--------------------------------");
    System.out.println("Employee"+(i+1)+" ");
    System.out.println("");
    emp[i].displayInfo();
	}
 
 System.out.println("-------------------------");
 System.out.println("Employees with 20000+ salary....");
 for (int i=0 ;i<emp.length; i++) 
 {
    if(emp[i].getSalary()>20000) 
    {
    System.out.println(emp[i].getEmpid()+"\t" +emp[i].getName());
    
    System.out.println("");
    
	}
 
 

 }
 sc.close();
}
}
import java.util.Scanner;

public class TestCustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer cus1=new Customer();
		System.out.println("\n");
		
		
		
		Customer cus2=new Customer("sachin","abc@gmail.com",25,25000.0);
		System.out.println("\n");
		
		
		
		Customer cus3=new Customer("palash","xyz@gmail.com",26,29000.0);
		
		cus2.displayCustomer();
		cus3.setCreditlimit(33000);
		
		
	}

}

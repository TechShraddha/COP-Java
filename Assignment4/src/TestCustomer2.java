import java.util.Scanner;

public class TestCustomer2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Customer2 cus1=new Customer2();
		cus1.acceptCustomer();
		cus1.displayCustomer();
		
		Customer2 cus2=new Customer2();
		
		cus2.acceptCustomer();
		System.out.println("Enter new Creditlimit");
		Scanner sc=new Scanner(System.in);
		double c=sc.nextDouble();
		cus2.setCreditlimit(c);
		cus2.displayCustomer();
		System.out.println("Updated Creditlimit:" +cus2.getCreditlimit());
	}

}

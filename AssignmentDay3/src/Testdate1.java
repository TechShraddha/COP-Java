import java.util.Scanner;

public class Testdate1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Date1 sc=new Date1();
		sc.acceptDate1();
		sc.displayDate1();
		
		
		
		Date1 sb1=new Date1();

		Scanner ab=new Scanner (System.in);
		System.out.println("Enter new Date :");
	      int d=ab.nextInt();
	      sb1.setDay(d);
	      
	      String d2=ab.next();
	     sb1.setMonth(d2);
	     
	      int y=ab.nextInt();
	      sb1.setYear(y);
	      
	      
	      System.out.println("Updated date is :" +sb1.getDay()+"   "+sb1.getMonth()+"   "+sb1.getYear());
	}

}

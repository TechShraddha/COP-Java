import java.util.Scanner;

public class Testdate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SampleDate da1=new SampleDate();
		//da1.acceptDate();
		da1.displayDate();
		
		
		
		SampleDate da2=new SampleDate(25 ,"Jun" ,2019);
		//da2.acceptDate();
		da2.displayDate();
		
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter new Date :");
	      int d=sc.nextInt();
	      da2.setDay(d);
	      da2.getDay();
	      String d2=sc.next();
	      da2.getMonth();
	      da2.setMonth(d2);
	      int y=sc.nextInt();
	      da2.setYear(y);
	      da2.getYear();
	      
	      System.out.println("Updated date is :" +da2.getDay()+"   "+da2.getMonth()+"   "+da2.getYear());
	      
		
		
	}

}

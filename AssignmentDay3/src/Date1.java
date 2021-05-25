import java.util.Scanner;

//9:Create Date class with  data members day,month,year.create getter setter for data members.writ display function to display date.
public class Date1 {

	
	private int day;
	private String month;
	private int year;
	
	
	public void acceptDate1() {
	
	 Scanner sc =new Scanner(System.in);
	  
	 System.out.println("Day:");
	 day=sc.nextInt();
	 
	 System.out.println("Month:");
	 month=sc.next();
	 
	 System.out.println("Year:");
	 year=sc.nextInt();
	}
		
	



	public int getDay() {
		return day;
	}



	public void setDay(int day) {
		this.day = day;
	}

	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}


	public void displayDate1() { 
		 
		 System.out.println("Day:"+day);
		 System.out.println("Month:"+month); 
		 System.out.println("Year:"+year);
		
		}
}

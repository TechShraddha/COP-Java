import java.util.Scanner;


	public class SampleDate {


		private int day;
		private String month;
		private int year;
		
		
		public void acceptDate() {
		
		 Scanner sc =new Scanner(System.in);
		 
		 
		 System.out.println("Day:");
		 day=sc.nextInt();
		 
		 System.out.println("Month:");
		 month=sc.next();
		 
		 System.out.println("Year:");
		 year=sc.nextInt();
		}
		
		public SampleDate()
		{
				System.out.println("----invoking default constructor--");
				 
		}
			
			
		public SampleDate(int  day, String month, int year)
		{
			
			
			this();
			System.out.println("----invoking parameterized constructor--");	
			this.day = day;
			this.month = month;
			this.year = year;
		}

		public int getYear() {
				return year;
			}

			public void setYear(int year) {
				this.year = year;
			}

		public String getMonth() {
				return month;
			}

			public void setMonth(String month) {
				this.month = month;
			}

		

		public int getDay() {
				return day;
			}

			public void setDay(int day) {
				this.day = day;
			}

		public void displayDate() { 
			 System.out.println("Day:"+day);
			 System.out.println("Month:"+month); 
			 System.out.println("Year:"+year);
			
			}
	}



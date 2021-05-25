
public class FunctionOverloading {

	public static void add(int a, int b){
		System.out.println("Add="+(a+b));
	}
	
	
	public static void add(double d1, int b) {		
		System.out.println("Add="+(d1+b));
	}
	
	public static void add(int a,int b, int c) {
		System.out.println("Add="+(a+b+c));
	}
	
	
	public static void add(String a, String b) {
		System.out.println("Add="+(a+"  "+b));
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	int	a=20,b=50;
	double d1=50.00;
	
	add(30 ,50);
	add(a,b);
	add(d1,b);
	add("Shraddha","Akshay");
	add(a,b,a);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}

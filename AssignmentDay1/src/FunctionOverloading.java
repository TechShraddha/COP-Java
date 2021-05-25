
public class FunctionOverloading {

	
	//function same but different signature is called function overloading
	public static void add() {
		
		System.out.println("adding");
		
	}
	 public static void add(int i ,int j ) {
		
		System.out.println("Add="+(i+j));
		
	}

    public static void add(int i ,int j ,int k) {
	
	System.out.println("Add="+(i+j+k));
	
   }
      public static void add(double i,int j) {
	
	System.out.println("Add="+(i+j));
	
     }

      public static void add(String i, String j) {
    		
    		System.out.println("Add="+(i+" "+j));
    		
    	     }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int a=20 ,b=30;
    double d1=34.67;
	//add();//no parameter
     add(10 ,40);
     add(a ,b, a);
     add(d1 ,a);
     add("hellow","shraddha");
     //add(a ,d1);//compile time error
     
     
	
	}

}

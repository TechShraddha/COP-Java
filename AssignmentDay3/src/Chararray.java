//7:Write a java program to convert char array into String.
public class Chararray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Method 1: Using String object
	      char[] ch = {'g', 'o', 'o', 'd', ' ', 'm', 'o', 'r', 'n', 'i', 'n', 'g'};
	      String str = new String(ch);
	      System.out.println(str);
	 
	      // Method 2: Using valueOf method
	      String str2 = String.valueOf(ch);
	      System.out.println(str2);
	   }



	}



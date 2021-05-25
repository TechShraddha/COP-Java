//Write a function to accept array of string.Display all elements in uppercase
public class String1array {

	
	public static void acceptArray(String[] names) {
		
		for (int i=0 ;i< names.length; i++)
		{
			System.out.println(names[i].toUpperCase());
			
		}
	}
	
		
	public static void main(String[] args)
	{
		
		String[] arr= {"shraddha" ,"ram ","sham" };
		acceptArray(arr);
		

	}

}

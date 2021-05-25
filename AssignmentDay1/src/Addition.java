import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int  No1, No2;
      int result;
      
       Scanner sc=new Scanner (System.in);
      
       System.out.println("Enter No1");
       No1 =sc.nextInt();
       
       System.out.println("Enter No2");
       No2 =sc.nextInt();
       
       result=No1+No2;
       System.out.println("Addition:"+result);
       
       
	}

}

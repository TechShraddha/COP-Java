import java.util.Scanner;





public class MenuDri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int choice=0;
		 
		 boolean flag=true;
		 Scanner sc=new Scanner(System.in);
		 
		System.out.println("Enter the choice for purchase it:");
			System.out.println("1:Pen");
			System.out.println("2:Pencil");
			System.out.println("3:NoteBook");
			System.out.println("4:Bottle");
			System.out.println("5:ColorBox");
			System.out.println("6:Thank you");
			
			while (flag!=false)
				{
			System.out.println("Enter choice:");
			int choice1=sc.nextInt();//assignment
			switch (choice1)
			{
			case 1:int total1=0;
			System.out.println("Enter the no of Pen");
			int numpen=sc.nextInt();
			for(int i=0;i<numpen;i++) {
				total1+=10;
			}
			System.out.println("total amt="+total1);
			break;
			case 2:int total2=0;
			System.out.println("Enter the no of Pencil");
			int numpencil=sc.nextInt();
			for(int i=0;i<numpencil;i++) {
				total2+=5;
			}
			System.out.println("total amt="+total2);
			break;
			case 3:int total3=0;
			System.out.println("Enter the no of NoteBook");
			int numnotebook=sc.nextInt();
			for(int i=0;i<numnotebook;i++) {
				total3+=20;
			}
			System.out.println("total amt="+total3);
			break;
			case 4:int total4=0;
			System.out.println("Enter the no of Bottle");
			int numbottle=sc.nextInt();
			for(int i=0;i<numbottle;i++) {
				total4+=30;
			}
			System.out.println("total amt="+total4);
			break;
			case 5:int total5=0;
			System.out.println("Enter the no of ColorBox");
			int numcolourbox=sc.nextInt();
			for(int i=0;i<numcolourbox;i++) {
				total5+=50;
			}
			System.out.println("total amt="+total5);
			break;
			case 6: flag=false;
			break;
			default:
				break;
			}
				}
			
			sc.close();
				

				}

	}


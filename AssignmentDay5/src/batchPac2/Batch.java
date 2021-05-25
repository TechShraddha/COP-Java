package batchPac2;

import java.util.Scanner;

public class Batch {
	private String bat;
	private int year;
	public void acceptInfo()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your batch:");
		bat = sc.next();
		System.out.println("Enter passing year:");
		year = sc.nextInt();
		sc.close();
	}
	public void displayInfo()
	{
		System.out.println("Batch: "+bat);
		System.out.println("Year of passing: "+year);
	}

	
	
	
    }


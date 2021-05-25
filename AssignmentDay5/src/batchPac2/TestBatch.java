package batchPac2;

import studentPac1.Student;

public class TestBatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student d=new Student();
        //public accessible in outside package also 
		//d.name="Ram";//protected not accessible outside the package it is accessible in otside package but in derived class
		//s.grade="A"//its a private ....it cannot access outside the class
		//d.marks=450;//its default ....it is private outside the class
		
		Batch b1 = new Batch();
		d.AcceptInfo();
		b1.acceptInfo();
		d.DisplayInfo();
		b1.displayInfo();		

	}

}

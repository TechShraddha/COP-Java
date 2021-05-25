package studentPac1;

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student s=new Student();
s.rollno=90;
s.name="Ram";//outside the class but in same pakage=protected
//s.grade="A"//its a private ....it cannot access outside the class
s.marks=450;//
s.AcceptInfo();
s.DisplayInfo();
	}

}

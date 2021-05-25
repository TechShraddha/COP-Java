
public class Interest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int p=20000;
 float r=6;
 int n=3;
 System.out.println("Principle amount is:"+p);
	System.out.println("rate of interest is:"+r);
	System.out.println("for number of year:"+n);
	float s=r/100;
	System.out.println("rate of interest per year is:"+s);
	
	float k=1+(s/n);
	
	System.out.println("Compound interest is"+p*Math.pow(k,n*s));}

}

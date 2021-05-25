
public class Series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 50, i = 1, sum = 0;

        while(i <= num)
        {
            sum += i;
            i++;
        }

        System.out.println("Sum = " + sum);

	}

}
/*for(int i = 1; i <= num; ++i) /sum of series 1+2+3+---+n
{
    // sum = sum + i;
    sum += i;
}

System.out.println("Sum = " + sum);*/
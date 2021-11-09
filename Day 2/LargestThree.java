/*
Greatest of the Three numbers
*/
import java.util.Scanner;
class LargestThree
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter three numbers: ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int large=LargestNumber(a,b,c);
		System.out.print("Largest is = "+large);
		
	}
	static int LargestNumber(int a, int b, int c)
	{

		if(a>=b && a>=c)
		{
			return a;
		}
		else if(b>=a && b>=c)
		{
			return b;
		}
		else
		{
			return c;
		}
	}
}

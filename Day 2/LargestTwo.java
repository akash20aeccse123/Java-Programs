
/*
Greatest of two numbers:
*/
import java.util.Scanner;
class LargestTwo
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter First number: ");
		int a=sc.nextInt();
		System.out.print("Enter Second Number: ");
		int b=sc.nextInt();
		int ans=LargestNumber(a,b);
		System.out.print("Largst Number is = "+ans);

	}
	static int LargestNumber(int first, int second)
	{
		if(first>second)
		{
			return first;
		}
		else
		{
			return second;
		}
	}
}

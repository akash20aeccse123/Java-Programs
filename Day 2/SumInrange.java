/*
Sum of numbers in a given range
*/
import java.util.Scanner;
class SumInrange
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Starting value: ");
		int start=sc.nextInt();
		System.out.print("Enter Ending Value: ");
		int end=sc.nextInt();
		int ans=RangeSum(start,end);
		System.out.print("Sum is = "+ans);
	}
	static int RangeSum(int s, int e)
	{
		int summ=0;
		for(int i=s;i<=e;i++)
		{
			summ=summ+i;
		}
		return summ;
	}
}
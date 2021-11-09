/*
program to print sum of  n natural numbers
*/
import java.util.Scanner;
class SumN
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number: ");
		int n=sc.nextInt();
		int ans=SumofN(n);
		System.out.print("Sum is = "+ans);
	}
	static int SumofN(int num)
	{
		int sum=0;
		for(int i=1;i<=num;i++)
		{
			sum=sum+i;
		}
		return sum;
	}
}

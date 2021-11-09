/*
Sum of digits of a number:
*/
import java.util.Scanner;
class DigitsSum
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number: ");
		int num=sc.nextInt();
		int ans=SumDig(num);
		System.out.print("Sum is = "+ans);
	}
	static int SumDig(int n)
	{
		int sum=0;
		int rem=0;
		while(n!=0)
		{
			rem=n%10;
			sum=sum+rem;
			n=n/10;
		}
		return sum;
	}
}

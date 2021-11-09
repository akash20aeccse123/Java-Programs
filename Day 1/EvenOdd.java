/*
Program to check whether a number is Even or odd
*/
import java.util.Scanner;
class EvenOdd
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number to check: ");
		int num=sc.nextInt();
		CheckEvenOdd(num);
	}
	static void CheckEvenOdd(int n)
	{
		if(n%2==0)
		{
			System.out.print("Even Number");
		}
		else
		{
			System.out.print("Odd Number");
		}
	}
}

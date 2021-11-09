/*
Program to Check a Number is Positive or negative
*/
import java.util.Scanner;
class CheckPos
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number to check: ");
		int n=sc.nextInt();
		isPositive(n);
	}
	static void isPositive(int num)
	{
		if(num>0)
		{
			System.out.print("Positive Number");
		}
		else
		{
			System.out.print("Negative Number");
		}
	}
}
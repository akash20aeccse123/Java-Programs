/*
Leap year or not:
*/
import java.util.Scanner;
class CheckLeapYear
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter year to check: ");
		int y=sc.nextInt();
		Leapyear(y);
	}
	static void Leapyear(int y)
	{
		if(y%4==0 && y%100!=0 || y%400==0)
		{
			System.out.print("Year is Leap Year");
		}
		else
		{
			System.out.print("Not a Leap Year");
		}
	}
}

/*
Palindrome number:
*/
import java.util.Scanner;
class PalindromeNum
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number: ");
		int num=sc.nextInt();
		isPalinDrome(num);
	}
	static void isPalinDrome(int num)
	{
		int rem=0;
		int rev=0;
		int currentNumber=num;

		while(num!=0)
		{
			rem=num%10;
			rev=(10*rev)+rem;
			num=num/10;
		}
		if(rev==currentNumber)
		{
			System.out.print("Palindrome number");
		}
		else
		{
			System.out.print("Not Palindrome");
		}

	}
}


/*
Prime number:
*/
import java.util.Scanner;
class PrimeNumber
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number to check: ");
		int num=sc.nextInt();
		isPrime(num);

	}
	static void isPrime(int num)
	{
		int count=0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.print("Prime Number");
		}
		else
		{
			System.out.print("Not a Prime Number");
		}
	}
}

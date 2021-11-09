
/*
Prime number within a given range:
*/
import java.util.Scanner;
class PrimeNum
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter start value: ");
		int start=sc.nextInt();
		System.out.print("Enter end value: ");
		int end=sc.nextInt();
		isPrime(start, end);
		
	}
	static void isPrime(int start, int end)
	{
		for(int i=start; i<=end; i++)
		{
			int counter=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					counter++;
				}
			}
			if(counter==2)
			{
				System.out.print(i+" ");
			}
		}
	}
}

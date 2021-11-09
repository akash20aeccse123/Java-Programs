/*
Reverse of a number :
*/
import java.util.Scanner;
class ReverseNum
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number: ");
		int num=sc.nextInt();
		int ans=NumReverse(num);
		System.out.print(ans);
	}
	static int NumReverse(int num)
	{
		int rem=0;
		int rev=0;

		while(num!=0)
		{
			rem=num%10;
			rev=(10*rev)+rem;
			num=num/10;
		}
		return rev;
	}
}

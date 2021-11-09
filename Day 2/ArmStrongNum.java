/*
Armstrong number 
*/
import java.util.*;
class ArmStrongNum
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number to check: ");
		int num=sc.nextInt();
		sc.close();
		isArmStrong(num);
	}
	static void isArmStrong(int num)
	{
		int currentNum=num;
		int rem=0;
		int cube=0;
		int sum=0;
		while(num!=0)
		{
			rem=num%10;
			cube=(rem*rem*rem);
			sum=cube+sum;
			num=num/10;

		}
		if(sum==currentNum)
		{
			System.out.print("Armstrong Number");
		}
		else{
			System.out.print("Not an Armstrong Number");
		}
	}
}
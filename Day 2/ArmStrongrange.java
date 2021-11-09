/*
Armstrong number in a given range :
*/
import java.util.Scanner;

public class ArmStrongrange {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter starting value: ");
        int start=sc.nextInt();
        System.out.println("Enter ending value: ");
        int end=sc.nextInt();
        sc.close();
        isArmStrong(start, end);
    }
    static void isArmStrong(int start, int end)
    {
        for(int i=start;i<=end;i++)
        {
            int num=i;
            int currentnum=i;
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
            if(sum==currentnum)
            {
                System.out.println(i+" ");
            }
        }
    }
    
}

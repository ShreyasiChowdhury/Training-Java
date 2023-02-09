import java.util.Scanner;
import java.lang.Math;
public class qstn14
{
    public static boolean checkArmstrong(int num)
    {
        int temp=num;
        int dig=0,sum=0;
        while(num!=0)
        {
            dig++;
            num/=10;
        }
        num=temp;
        while(num!=0)
        {
            sum+=Math.pow(num%10,dig);
            num/=10;
        }
        if(sum==temp)
            return true;
        else
            return false;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter lower limit:");
        int a=sc.nextInt();
        System.out.println("Enter upper limit:");
        int b=sc.nextInt();
        System.out.println("Armstrong number between "+a+" and "+b+" are:");
        for(int i=a;i<=b;i++)
        {
            if(checkArmstrong(i))
                System.out.print(i+", ");
        }
        System.out.println();
    }
}
import java.util.Scanner;
import java.lang.Math;
public class qstn13
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int num=sc.nextInt();
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
            System.out.println(temp+" is an Armstrong Number");
        else
            System.out.println(temp+" is not an Armstrong Number");
    }
}
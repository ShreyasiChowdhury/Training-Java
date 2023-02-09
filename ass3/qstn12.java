import java.util.Scanner;
public class qstn12
{
    public static boolean checkPrime(int n)
    {
        if(n==0)
            return false;
        if(n==1 || n==2 || n==3)
        {
            return true;
        }
        for(int i=2; i<n; i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter lower limit:");
        int a=sc.nextInt();
        System.out.println("Enter upper limit:");
        int b=sc.nextInt();
        System.out.println("Prime number between "+a+" and "+b+" are:");
        for(int i=a;i<=b;i++)
        {
            if(checkPrime(i))
                System.out.print(i+", ");
        }
        System.out.println();
    }
}
import java.util.Scanner;
public class qstn20
{
    public static int gcd(int a,int b)
    {
        if(a==b)
            return a;
        if(a>b)
            return gcd(a-b,b);
        else
            return gcd(a,b-a);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("GCD of "+a+" and "+b+" is: "+gcd(a,b));
    }
}
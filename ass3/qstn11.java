import java.util.Scanner;
public class qstn11
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
        System.out.println("LCM of "+a+" and "+b+" is: "+gcd(a,b));
        int lcm=(a*b)/gcd(a,b);
        System.out.println("LCM of "+a+" and "+b+" is: "+lcm);
    }
}
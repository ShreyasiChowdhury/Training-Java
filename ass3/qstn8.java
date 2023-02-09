import java.util.Scanner;
public class qstn8
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int n=sc.nextInt();
        if(n<=0)
        {
            System.out.println(n+" is Undefined");
            System.exit(0);
        }
        if(n==1 || n==2 || n==3)
        {
            System.out.println(n+" is Prime Number");
            System.exit(0);
        }
        for(int i=2; i<n; i++)
        {
            if(n%i==0)
            {
                System.out.println(n+" is not Prime Number");
                System.exit(0);
            }
        }
        System.out.println(n+" is Prime Number");
    }
}
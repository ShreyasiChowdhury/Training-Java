import java.util.Scanner;
public class qstn9
{
    public static boolean checkPrime(int num)
    {
        for(int i=2;i*i<=num;i++)
        {
            if(num%i==0)
                return false;
        }
        return true;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter range:");
        int n=sc.nextInt();
        int i=0,j=1,sum=0;
        System.out.println("First "+n+" primes are:");
        while(i<n)
        {
            j++;
            if(checkPrime(j))
            {
                System.out.print(j+", ");
                sum+=j;
                i++;
            }
        }
        System.out.println("\nSum: "+sum);
    }
}
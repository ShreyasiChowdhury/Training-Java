import java.util.Scanner;
public class qstn17
{
    public static boolean checkPrime(int num)
    {
        if(num<=0)
            return false;
        else
        {
            for(int i=2;i*i<=num;i++)
            {
                if(num%i==0)
                    return false;
            }
        }
        return true;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers:");
        int num=sc.nextInt();
        if(checkPrime(num)==true && checkPrime(num-2)==true)
            System.out.println(num+" can be expressed as sum of 2 and "+(num-2));
        else
            System.out.println(num+" can not be expressed");
    }
}
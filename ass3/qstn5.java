import java.util.Scanner;
public class qstn5
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int num=sc.nextInt();
        int dig=0;
        while(num!=0)
        {
            dig++;
            num/=10;
        }
        System.out.println("Result is: "+dig);
    }
}
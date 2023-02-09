// AMM, COO, EQQ, ...
import java.util.Scanner;
public class qstn3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter range:");
        int n=sc.nextInt();
        char ch='A';
        for(int i=1;i<=n;i++)
        {
            System.out.print(ch+""+(char)(ch+12)+""+(char)(ch+12)+", ");
            ch++;
            if(i%12==0)
            {
                ch='A';
            }
        }
    }
}
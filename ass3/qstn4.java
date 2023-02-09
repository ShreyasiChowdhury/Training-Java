// ABA, BCB, CDC, DED, ...
import java.util.Scanner;
public class qstn4
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter range:");
        int n=sc.nextInt();
        char ch='A';
        for(int i=1;i<=n;i++)
        {
            System.out.print(ch+""+(char)(ch+1)+""+ch+", ");
            ch++;
            if(i%25==0)
            {
                ch='A';
            }
        }
    }
}
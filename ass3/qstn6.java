import java.util.Scanner;
public class qstn6
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int num=sc.nextInt();
        int rev=0,rem=0,count=0;
        while(num!=0)
        {
            rem=num%10;
            rev=rev*10+rem;
            num/=10;
            count++;
        }
        String str=String.valueOf(rev);
        int len=str.length();
        String nstr="";
        if(len!=count)
        {
            for(int i=0;i<count-len;i++)
            {
                nstr+='0';
            }
            nstr=nstr.concat(str);
            System.out.println("Result is: "+nstr);
            System.exit(0);
        }
        System.out.println("Result is: "+rev);
    }
}
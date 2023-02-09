import java.util.Scanner;
public class qstn7
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        String str=sc.next();
        String nstr="";
        for(int i=str.length()-1;i>=0;i--)
        {
            nstr=nstr+str.charAt(i);
        }
        if(str.equals(nstr))
            System.out.println(str+" is Palindrome Number");
        else
            System.out.println(str+" is not Palindrome Number");
    }
}
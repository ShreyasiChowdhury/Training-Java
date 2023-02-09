public class qstn10
{
    public static void main(String[] args)
    {
        String str=args[0];
        char ch='A';
        for(int i=0;i<str.length();i++)
        {
            System.out.print(ch+""+str.charAt(i)+", ");
            ch++;
        }
    }
}
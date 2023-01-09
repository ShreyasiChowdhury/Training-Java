//1, 2, 4, 7, 11
import java.util.Scanner;
class qstn8
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter range:");
		int n=sc.nextInt();
		int x=1,temp=0;
		for(int i=1;i<=n;i++)
		{
			x=x+temp;
			System.out.print(x+", ");
			temp++;
		}
	}
}

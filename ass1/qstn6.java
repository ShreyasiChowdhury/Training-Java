//1, 2, 4, 8, 16, 32, 64
import java.util.Scanner;
class qstn6
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter range:");
		int n=sc.nextInt();
		int x=1;
		for(int i=1;i<=n;i++)
		{
			System.out.print(x+", ");
			x=x*2;
		}
	}
}

//1, 1, 5, 5, 9, 9, 13, 13
import java.util.Scanner;
class qstn9
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter range:");
		int n=sc.nextInt();
		int x=1,y=1;
		for(int i=1;i<=n;i++)
		{
			if(i%2!=0)
			{
				System.out.print(x+", ");
				x=x+4;
			}
			else
			{
				System.out.print(y+", ");
				y=y+4;
			}
		}
	}
}

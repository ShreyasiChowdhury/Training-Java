import java.util.Scanner;
public class qstn2
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter row number:");
		int n=sc.nextInt();
		int x=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i<=n)
				{
					System.out.print(x+"\t");
				}
				else
				{
					System.out.print("\t");
				}
			}
			x++;
			System.out.println();
		}
	}
}

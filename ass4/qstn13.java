import java.util.Scanner;
public class qstn13
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter row number:");
		int n=sc.nextInt();
		int x=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=2*n-1;j++)
			{
				if(j>=i && j<=2*n-i)
				{
					System.out.print(x+"\t");
					x++;
				}
				else
				{
					System.out.print("\t");
				}
			}
			System.out.println();
		}
	}
}

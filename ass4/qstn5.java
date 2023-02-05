import java.util.Scanner;
public class qstn5
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter row number:");
		int n=sc.nextInt();
		int x=1,k;
		for(int i=1;i<=n;i++)
		{
			k=1;
			for(int j=1;j<=2*n-1;j++)
			{
				if(j>=n-i+1 && j<=n+i-1 && k==1)
				{
					k=0;
					System.out.print(x+"\t");
				}
				else
				{
					k=1;
					System.out.print("\t");
				}
			}
			x++;
			System.out.println();
		}
	}
}

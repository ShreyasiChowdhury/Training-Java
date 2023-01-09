//7, 10, 8, 11, 9, 12,

import java.util.Scanner;
class qstn7
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter range:");
		int n=sc.nextInt();
		int x=7,y=10,i=1;
		for(i=1;i<=n;i++)
		{
			if(i%2!=0)
			{
				System.out.print(x+", ");
				x=x+1;
			}
			else
			{
				System.out.print(y+", ");
				y=y+1;
			}
		}
	}
}

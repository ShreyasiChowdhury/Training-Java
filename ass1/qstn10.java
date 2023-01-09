//21, 9, 21, 11, 21, 13, 21

import java.util.Scanner;
class qstn10
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter range:");
		int n=sc.nextInt();
		int x=21,y=9;
		for(int i=1;i<=n;i++)
		{
			if(i%2!=0)
			{
				System.out.print(x+", ");
			}
			else
			{
				System.out.print(y+", ");
				y=y+2;
			}
		}
	}
}

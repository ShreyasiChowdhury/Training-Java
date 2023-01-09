//0,0,2,1,4,2,6,3,8,4

import java.util.Scanner;
class qstn1
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter range:");
		int n=sc.nextInt();
		int x=0,y=0,i=1;
		for(i=1;i<=n;i++)
		{
			if(i%2!=0)
			{
				System.out.print(x+", ");
				x=x+2;
			}
			else
			{
				System.out.print(y+", ");
				y=y+1;
			}
		}
	}
}

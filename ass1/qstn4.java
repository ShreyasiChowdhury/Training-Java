//1, 2, 2, 4, 8, 32, 256

import java.util.Scanner;
class qstn4
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter range:");
		int n=sc.nextInt();
		int a=1,b=2,c=1;
		System.out.print("1, 2, ");
		for(int i=1;i<n-1;i++)
		{
			c=a*b;
			a=b;
			b=c;
			System.out.print(c+", ");
		}
	}
}

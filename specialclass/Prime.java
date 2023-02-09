package com.company;
import java.util.Scanner;
public class Prime
{
    public static boolean checkPrime(int num)
    {
        for(int i=2;i*i<=num;i++)
        {
            if(num%i==0)
                return false;
        }
        return true;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter position:");
        int n=sc.nextInt();
        int i=0,j=1;
        System.out.println(n+"th prime number is:");
        while(i<n)
        {
            j++;
            if(checkPrime(j))
            {
                if(i==n-1)
                    System.out.print(j);
                i++;
            }
        }
    }
}
package com.company;
import java.util.ArrayList;
import java.util.Scanner;

public class qstn4
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        ArrayList<String> al=new ArrayList<>();
        System.out.println("Enter column of matrix:");
        int m=sc.nextInt();
        System.out.println("Enter row of matrix:");
        int n=sc.nextInt();
        System.out.println("Enter elements:");
        for(int i=0;i<m*n;i++)
        {
            al.add(sc.next());
        }
        System.out.println("Enter alphabet to be searched:");
        String key=sc.next();
        int row=0,col=0,loc=0,k=0;
        boolean flag=false;
        System.out.println("\nThe matrix:");
        for(String str: al)
        {
            System.out.print(str+"\t");
            k++;
            if(k%m==0)
                System.out.println();
        }
        for(int i=0;i<m*n;i++)
        {
            if(al.get(i).equals(key))
            {
                flag=true;
                col=i%m;
                row=(i-col)/m;
                loc=i;
                break;
            }
        }
        if(!flag)
        {
            System.out.println("\nAlphabet not Found");
            System.exit(0);
        }
        System.out.println("\nOutput:");
        for(int i=row*m;i<loc;i++)
        {
            System.out.print(al.get(i)+" ");
        }
        for(int i=col;i<loc;i=i+m)
        {
            System.out.print(al.get(i)+" ");
        }
    }
}

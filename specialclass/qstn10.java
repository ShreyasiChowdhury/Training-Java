package com.company;
import java.util.Scanner;
public class qstn10
{
    public static void convert(int num)
    {
        int[] values={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] letters={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        StringBuilder roman=new StringBuilder();
        for(int i=0;i<values.length;i++)
        {
            while(num>=values[i])
            {
                num=num-values[i];
                roman.append(letters[i]);
            }
        }
        System.out.println("Roman Numeral: "+roman.toString());
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter integer:");
        int num=sc.nextInt();
        convert(num);
    }
}
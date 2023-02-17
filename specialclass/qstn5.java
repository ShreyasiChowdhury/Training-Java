package com.company;
import java.util.*;
public class qstn5
{
    public static void main(String[] args)
    {
        ArrayList<String> al=new ArrayList<>();
        al.add("Madam");
        al.add("ABCD");
        al.add("radar");
        al.add("efgh");
        al.add("ABBA");
        ArrayList<String> withPalindrome=new ArrayList<>();
        ArrayList<String> withoutPalindrome=new ArrayList<>();
        for(String str: al)
        {
            StringBuilder sb=new StringBuilder(str);
            sb.reverse();
            String str1=new String(sb);
            if(str1.equalsIgnoreCase(str))
            {
                withPalindrome.add(str);
            }
            else
            {
                withoutPalindrome.add(str);
            }
        }
        System.out.println("Palindrome words are:");
        System.out.println(withPalindrome);
        System.out.println("Non palindrome words are:");
        System.out.println(withoutPalindrome);
    }
}
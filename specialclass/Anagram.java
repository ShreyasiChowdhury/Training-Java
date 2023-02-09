package com.company;
import java.util.*;
public class Anagram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first string:");
        String str1=sc.nextLine();
        int n1=str1.length();
        char[] ch1=str1.toUpperCase().toCharArray();
        System.out.println("Enter second string:");
        String str2=sc.nextLine();
        int n2= str2.length();
        char[] ch2=str2.toUpperCase().toCharArray();
        if(n1!=n2)
        {
            System.out.println(str1+" and "+str2+" are not Anagrams");
            System.exit(0);
        }
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        for(int i=0;i<n1;i++)
        {
            if(ch1[i]!=ch2[i])
            {
                System.out.println(str1+" and "+str2+" are not Anagrams");
                System.exit(0);
            }
        }
        System.out.println(str1+" and "+str2+" are Anagrams");
    }
}

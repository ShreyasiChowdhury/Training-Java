package com.company;
import java.util.*;
public class Cable {
    public static void materialType(String str) {
        if(str.equalsIgnoreCase("copper"))
            System.out.println("CoaxialCable");
        else if(str.equalsIgnoreCase("glass"))
            System.out.println("FibreOpticCable");
        else
            System.out.println("Wrong input");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter material type:");
        String str=sc.next();
        materialType(str);
    }
}

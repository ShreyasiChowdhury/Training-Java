package com.company;
import java.util.*;
class Treasure
{
    String name;
    int weight,price;
    Treasure(String name,int weight,int price)
    {
        this.name=name;
        this.weight=weight;
        this.price=price;
    }
}
public class qstn8 {
    public static void main(String[] args) {
        Treasure t1 = new Treasure("gold", 50, 1000);
        Treasure t2 = new Treasure("silver", 10, 800);
        Treasure t3 = new Treasure("platinum", 400, 1500);
        Treasure t4 = new Treasure("bronze", 500, 1200);
        Treasure t5 = new Treasure("iron", 200, 2000);
        ArrayList<Treasure> al = new ArrayList<>();
        al.add(t1);
        al.add(t2);
        al.add(t3);
        al.add(t4);
        al.add(t5);
        al.trimToSize();
        for(Treasure treasure:al)
        {
            System.out.println(treasure.name+" "+treasure.weight+" "+treasure.price);
        }
    }
}
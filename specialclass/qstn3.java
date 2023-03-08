package com.company;
import java.util.LinkedList;
class Hello
{
    String name,sname;
    Hello(String name,String sname)
    {
        this.name=name;
        this.sname=sname;
    }
}
public class qstn3
{
    public static void reverseLinkedList(LinkedList<Hello> ll)
    {
        for(int i=0;i<ll.size()/2;i++)
        {
            Hello obj=ll.get(i);
            ll.set(i,ll.get(ll.size()-i-1));
            ll.set(ll.size()-1-i,obj);
        }
    }
    public static void print(LinkedList<Hello> ll)
    {
        for(Hello person:ll)
        {
            System.out.println(person.name+" "+person.sname);
        }
    }
    public static void main(String[] args)
    {
        Hello p1 = new Hello("Shreyasi", "Chowdhury");
        Hello p2 = new Hello("Nilayan", "Samanta");
        Hello p3 = new Hello("Monidipa", "Ghoshal");
        Hello p4 = new Hello("Debajyoti", "Roy");
        LinkedList<Hello> ll = new LinkedList<>();
        ll.add(p1);
        ll.add(p2);
        ll.add(p3);
        ll.add(p4);
        System.out.println("Before Reversal:");
        print(ll);
        reverseLinkedList(ll);
        System.out.println("\nAfter Reversal:");
        print(ll);
    }
}

//LinkedList<Hello>
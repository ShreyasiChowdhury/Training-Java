package com.company;

public class Main {

    public static void main(String[] args) {
        AxisBank a=new AxisBank();
        System.out.println(a.getSavingInterestRate(4));
        System.out.println(a.getFDInterestRate(8.5));
        SBIBank s=new SBIBank();
        System.out.println(s.getSavingInterestRate(6));
        System.out.println(s.getFDInterestRate(9));
    }
}

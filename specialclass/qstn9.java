package com.company;
abstract class ReserveBank
{
    abstract double getSavingInterestRate();
    abstract double getFDInterestRate();
}
class AxisBank extends ReserveBank
{
    double srate=4;
    double fdrate=8.5;
    double p;
    int t;
    double sans,fdans;
    AxisBank(double p,int t)
    {
        this.p=p;
        this.t=t;
    }
    public double getSavingInterestRate()
    {
        sans=(p*srate*t)/100;
        return sans+p;
    }
    public double getFDInterestRate()
    {
        fdans=(p*fdrate*t)/100;
        return fdans+p;
    }
}
class SBIBank extends ReserveBank
{
    double srate=6;
    double fdrate=9;
    double p;
    int t;
    double sans,fdans;
    SBIBank(double p,int t)
    {
        this.p=p;
        this.t=t;
    }
    public double getSavingInterestRate()
    {
        sans=(p*srate*t)/100;
        return sans+p;
    }
    public double getFDInterestRate()
    {
        fdans=(p*fdrate*t)/100;
        return fdans+p;
    }
}
public class qstn9
{
    public static void main(String[] args)
    {
        AxisBank a=new AxisBank(100,2);
        SBIBank s=new SBIBank(100,2);
        ReserveBank r1=new SBIBank(200,4);
        ReserveBank r2=new AxisBank(200,4);
        System.out.println("Axis Bank Savings Amount: "+a.getSavingInterestRate());
        System.out.println("Axis Bank FD Amount: "+a.getFDInterestRate());
        System.out.println("SBI Bank Savings Amount: "+s.getSavingInterestRate());
        System.out.println("SBI Bank FD Amount: "+s.getFDInterestRate());
    }
}
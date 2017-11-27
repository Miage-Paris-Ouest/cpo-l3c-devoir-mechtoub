package model.impl;

import java.util.UUID;
import java.lang.StringBuilder;

import model.dec.CompteManip;


public final class CompteCourant extends Compte implements CompteManip
{


    private float ceiling;
    
    public CompteCourant (String owner, double initalBalance)
    {
        super(owner, initalBalance);
        //System.out.println ("Plafond automatique : 100€");
        this.ceiling =  100f;
    }

    public CompteCourant (String owner, double initalBalance, float ceiling)
    {
        super(owner, initalBalance);
        this.ceiling =  ceiling;
    }

    public CompteCourant (String owner)
    {
        super(owner);
        this.ceiling =  100f;
    }

    public CompteCourant (String owner, float ceiling)
    {
        super(owner);
        this.ceiling =  ceiling;
    }

    @Override
    public double withdraw(double amount) throws InsufficientBalanceException
    { 
        double previous = this.getBalance();


            this.setBalance(previous - amount);
            return this.getBalance();
    }

    @Override
    public double deposit(double amount)
    {
        double previous = this.getBalance();
        this.setBalance(previous + amount);
        return this.getBalance();
    }

}

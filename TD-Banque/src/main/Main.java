package main;



import model.dec.CompteManip;
import model.fact.CompteFactory;


public final class Main
{



    public static void main (String[] args)  {



        
            CompteFactory cf = new CompteFactory();
        
            CompteManip c1 = cf.createCompteCourant("John Doe", 50);
            CompteManip c2 = cf.createCompteCourant("Jack Bauer");
            CompteManip c3 = cf.createCompteEpargne("Johnny Doc", -0.6f);
    
            double amount = 1900.0d;


            c1.deposit(100.0d);
            double retrait = c1.withdraw(amount);
            double newSolde = c2.deposit(100000.0d);


            c3.deposit(100.0d);
            c3.withdraw(55.0d);


        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

    }
}
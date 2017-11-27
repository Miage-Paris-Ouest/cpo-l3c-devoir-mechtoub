package model.dec;

public interface CompteItf
{
	String getOwner();

    String getNum();

    double getBalance();

    void setBalance(double nouvelleBalance);

    double deposit(double montant);
}

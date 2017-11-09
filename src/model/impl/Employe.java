package model.impl;
public class Employe{
  String nom ;
  double salaire_base ;
  int nb_heure ;

  public Employe(String nom,double salaire_base,int nb_heure)
  {
    throw NombreHeureException
    {
        if (nb_heure<13 || nb_heure>60)
        {throw new NombreHeureException();
        }else
          {
            this.nom=nom;
            this.salaire_base=salaire_base;
            this.nb_heure=nb_heure;
          }
    }
  }
   public String getnom()
   {
     return "le nom de l'Employe : "+this.nom;
   }
   public double getsalaire_base()
   {
      return this.salaire_base;
   }

   public int getnbheure()
   {
     return this.nb_heure;
   }

   public double getsalaire_hebdo()
   {
     if (this.nb_heure<=40)
     {
       return  this.salaire_base*this.nb_heure;
     }else
     {
       return (this.salaire_base*this.nb_heure*1.5);
     }

   }

public void setnom(String nom)
{
  this.nom=nom;
}
  public void setsalaire(float salaire_base)
  {
    this.salaire_base=salaire_base;
  }
  public void setnb_heure(int nb_heure)
  {
    this.nb_heure=nb_heure;
  }

  @Override
  public String toString()
  {
    return "L'Employe "+getnom()+" travaille "+getnbheure()+" par semaine et son salaire hebdomadaire est de "+getsalaire_hebdo();

  }


}

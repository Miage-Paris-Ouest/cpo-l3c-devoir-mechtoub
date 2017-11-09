public class SalleCinema {
  private String film ;
  public  int nbPlaces ;
  private  float tarif ;
  private  int nbPlacesVendues;


  public SalleCinema(String film , int nbPlaces , float tarif)
    {
        this.film=film;
        this.nbPlaces=nbPlaces;
        this.tarif=tarif;
        this.nbPlacesVendues=0;

    }

    public String getfilm()
    {
        return("le film projeté est : "+this.film);

    }
    public int getnbPlace()
    {
      return ("La capacité de cette salle est de : "+this.nbPlaces);

    }

    public float gettarif()
    {

      return ("Le prix d'un billet d'entrée est de : "+this.tarif);
    }

    public int getnbPlaceVendus()
      {
        return("le nombre de places vendues est de : "+this.nbPlacesVendues);

      }

      public void setfilm(String film)
      {
          this.film=film;

      }

      public void setnbPlace(int nbPlaces)
      {
        this.nbPlaces=nbPlaces;

      }

      public void settarif()
      {

        this.tarif=tarif;
      }

      public void setnbPlaceVendus( int nbPlaces)
        {
          this.nbPlacesVendues=nbPlacesVendues;

        }

        public void  settarif(float tarif)
        {

          this.tarif=tarif;
        }

  public int  vendrePlace()
  {

    this.nbPlacesVendues++;

  }

public float tauxRemplissage()
  {
    return (this.nbPlacesVendues/this.nbPlaces);

  }

  public float chiffreAffaires()
  {
    return(this.nbPlacesVendues*this.tarif);

  }
   public boolean estpleine()
   {
      if (this.nbPlacesVendues<this.nbPlaces)
        return false ;
        else return true;
   }

   public int nbPlacesDisponibles()
   {
      return this.nbPlaces-this.nbPlacesVendues;

   }

  @override
  public String toString()
  {
    return ("Film projete    :"+this.getfilm()+"\nTarif   :"+this.gettarif()+"\n Nombre   :"+this.nbPlaces+"\nTaux remplissage    :"+this.tauxRemplissage()+
    "\nChiffre d'affaires   :"+this.chiffreAffaires());

  }




}

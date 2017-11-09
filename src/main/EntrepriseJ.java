package EntrepriseJ;
import model.impl.Employe;
import model.exceptions.NombreHeureException;
public  class EntrepriseJ
{

public static void main(String[] args)
{
  try {
        Employe John = new Employe("John",7.5,35);
        System.out.println(John);
      } catch(NombreHeureException e ){}



}

}

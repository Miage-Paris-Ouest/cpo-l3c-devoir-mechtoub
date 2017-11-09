package model.exceptions;

class NombreHeureException extends Exception
{
  public NombreHeureException()
  {
    System.out.println("nombre d'heures inferieur a 13 ou superieur a 60 ");
  }

}

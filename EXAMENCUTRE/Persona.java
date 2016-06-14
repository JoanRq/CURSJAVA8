package modelo;

import java.util.ArrayList;

public class Persona {
  private String dni;
  private String nom;
  private String adreça;
  
  public Persona(String dni, String nom, String adreça) throws IllegalArgumentException {
    if(dni == null || nom == null || adreça == null ) {
      throw new IllegalArgumentException("Paràmetros no vàlids");
    }
    this.dni = dni;
    this.nom = nom;
    this.adreça = adreça;
    
  }
  
  public String getDni() { return this.dni;}
  
  public String getNom() { return this.nom;}
  
  public String getAdreça() { return this.adreça;}

  
  public void setDni(String dni) throws IllegalArgumentException  {
    if(dni == null ) {
      throw new IllegalArgumentException("DNI incorrecte");
    }    
    this.dni = dni;
  }
  
  public void setNom(String nom) throws IllegalArgumentException{ 
    if( nom == null) {
      throw new IllegalArgumentException("Nom incorrecte");
    }
    this.nom=nom;
  }
  
  public void setAdreça(String adreça) throws IllegalArgumentException { 
    if(adreça == null ) {
      throw new IllegalArgumentException("Adreça invàlida");
    }
    this.adreça=adreça;
  }
  
  
}
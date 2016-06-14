package modelo;

import modelo.Paper;

public class Actor extends Persona{
  Paper paper;
  
  
  public Actor(String dni, String nom, String adreça, Paper paper) throws IllegalArgumentException {
    super(dni, nom, adreça);
    if ( paper == null ) {
      throw new IllegalArgumentException("Paremetres incorrectes");      
    }
    this.paper = paper;
  }
  public Paper getPaper() { 
    return this.paper;
  }
 
  public void setPaper(Paper paper) throws IllegalArgumentException { 
    if ( paper == null ) {
      throw new IllegalArgumentException("Paremetres incorrectes");      
    }
    this.paper = paper;
  }
 
}

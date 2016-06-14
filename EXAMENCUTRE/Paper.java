package modelo;

public class Paper {    // afegit perque compili
  private String paper; // HAURIA DE SER UNA ARRAYlIST DELS 
                        // PAPERS DE LA REPRESENTACIO (SEGONS EL MEU MODEL)
  
  public Paper(String paper) throws IllegalArgumentException {
    if(paper == null ) {
      throw new IllegalArgumentException("Paràmetros no vàlids");
    }
    this.paper = paper;
    
  }
  
  public String getNom() { 
    return this.paper;
  }
  
  public void setNom(String paper) throws IllegalArgumentException { 
    if( paper == null) {
      throw new IllegalArgumentException("Nom incorrecte");
    }
    this.paper=paper;
  }
  
}

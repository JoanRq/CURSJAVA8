package modelo;

import java.util.ArrayList;

public class Persona {
  // Atributos
  protected String nombre;
  protected String telf;
  
  // Resultado de la normalización
  private ArrayList<Cena> cenasParticipante;
  private ArrayList<Cena> cenasOrganizador;

  // Métodos
  public Persona(String nombre, String telf) throws Exception {
    if (nombre == null || telf == null) {
      throw new Exception();
    }
    
    this.nombre = nombre;
    this.telf = telf;
    
    cenasParticipante = new ArrayList<>();
    cenasOrganizador = new ArrayList<>();
  }
  
  public String getNombre() {
    return nombre;
  }
  
  public void addCenaOrga(Cena cena) throws Exception {
    if (cena == null) {
      throw new Exception();
    }
    
    cenasOrganizador.add(cena);
  }
   
  public void addCenaPart(Cena cena) throws Exception {
    if (cena == null) {
      throw new Exception();
    }
    
    cenasParticipante.add(cena);
  }
  
  public String toString() {
    return "Nombre: " + nombre + ", telf: " + telf;
  }  
}
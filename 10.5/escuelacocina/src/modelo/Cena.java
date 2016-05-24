package modelo;

import java.util.HashSet;

public class Cena {
  // Atributos
  private int num;
  private String restaurante;
  
  // Resultado de la normalización
  private HashSet<Persona> participantes;
  private Persona organizador;
  
  // Métodos
  /**
   * Constructor de Cena
   */
  public Cena(int num, String restaurante, Persona organizador)
      throws Exception {
    if (restaurante == null || organizador == null) {
      throw new Exception();
    }    
    
    this.num = num;
    this.restaurante = restaurante;
    
    participantes = new HashSet<>();
    participantes.add(organizador);
    
    this.organizador = organizador;
  }
  
  public void addParticipante(Persona participante) throws Exception {
    if (participante == null) {
      throw new Exception();
    }
    
    participantes.add(participante);
  }
  
  public String toString() {
    return "Cena num: " + num + ", rest: " + restaurante
        + "orga: " + organizador.getNombre();
  }
}
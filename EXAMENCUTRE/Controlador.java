package controlador;

import modelo.Actor;
import modelo.Paper;
import modelo.Persona;

import java.util.HashMap;


public class Controlador {
  public HashMap<String, Actor> actors = new HashMap<>();
  public HashMap<String, Paper> papers = new HashMap<>();
  
  public void addActor(String dni, String nom, String adreça, String paper) throws IllegalArgumentException {
    try {
      Paper paperActor = this.papers.get(paper);
      if (paperActor == null) {
        throw new IllegalArgumentException("Paper desconegut");
      }
      Actor actorNou = new Actor(dni, nom, adreça, paperActor);
      Actor tmp=this.actors.get(dni);
      if (tmp!=null) {
        throw new IllegalArgumentException("Actor repetit");
      }
      this.actors.put(dni,actorNou);
    } catch (IllegalArgumentException excepcio){
      System.err.println("Paràmetre incorrecte "+excepcio.getMessage());
    } catch (Exception excepcio){
      System.err.println("Error "+excepcio.getMessage());
    }
    
      
      
    
    
    
  }
  
}
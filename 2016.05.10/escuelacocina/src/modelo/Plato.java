package modelo;

import java.util.ArrayList;

public class Plato {
  // Atributos
  private String nombre;
  
  // Resultado de la normalización
  private Curso curso;
  private ArrayList<Elaboracion> elaboraciones;
  private Plato preRequisito;  // El pre-requisito puede ser null
  
  // Métodos
  /**
   * Constructor de Plato
   */
  public Plato(String nombre, Curso curso) throws Exception {
    if (nombre == null || curso == null) {
      throw new Exception();
    }
    
    this.nombre = nombre;
    this.curso = curso;
    elaboraciones = new ArrayList<>();
  }
  
  public Curso getCurso() {
    return curso;
  }
  
  public void addRequisito(Plato plato) throws Exception {
    if (preRequisito != null || plato == null || plato.curso != this.curso) {
      throw new Exception();
    }
    
    preRequisito = plato;
  }
  
  public void addElaboracion(Elaboracion elaboracion) throws Exception {
    if (elaboracion == null) {
      throw new Exception();
    }
    
    elaboraciones.add(elaboracion);
  }
}

















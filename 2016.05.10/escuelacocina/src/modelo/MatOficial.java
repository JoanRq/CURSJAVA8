package modelo;

import java.util.ArrayList;

public class MatOficial extends Matricula {
  // Atributos
  // Resultado de la normalización
  private ArrayList<Elaboracion> elaboraciones;

  // Métodos
  /**
   * Constructor Matrícula Oficial
   */
  public MatOficial(Curso curso, MesAnyo mes, Alumno alumno) throws Exception {
    super(curso, mes, alumno);
    
    elaboraciones = new ArrayList<>();
  }
  
  public int numElaboraciones() {
    return elaboraciones.size();
  }
  
  public void addElaboracion(Elaboracion e) throws Exception {
    if (elaboraciones.size() >= 20) {
      throw new Exception();
    }
    
    elaboraciones.add(e);
  }
}
package modelo;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * Esta clase define un curso de cocina en el dominio de nuestra aplicación
 */
public class Curso {
  // Atributos
  private String titulo;  // El título del curso, identificador
  private float precio;   // En €
  private float horas;    // Las horas del curso
  
  // Procedente de la normalización
  private ArrayList<Matricula> matriculas;  // Todas las matrículas de este
                                            // curso
  private HashSet<Plato> platos;          // Los platos que se elaborarán
  
  // Métodos
  /**
   * Constructor del curso, lanza excepcion en caso de violación de restricción
   */
  public Curso(String titulo, float precio, float horas) throws Exception {
    // Comprobaciones previas - restricciones de clase
    if (titulo == null || titulo.trim().equals("")
        || precio < 0 || horas <= 0 || horas > 40) {
      throw new Exception();
    }
  
    this.titulo = titulo;
    this.precio = precio;
    this.horas = horas;
    
    matriculas = new ArrayList<>();
    platos = new HashSet<>();
  }
  
  /**
   * addMatricula nos permite añadir matrículas a este curso.
   */
  public void addMatricula(Matricula matricula) throws Exception {
    // Sanity checks
    if (matricula == null) {
      throw new Exception();
    }
    
    matriculas.add(matricula);
  }
  
  /**
   * addPlato nos permite añadir matrículas a este curso.
   */
  public void addPlato(Plato plato) throws Exception {
    // Sanity checks
    if (plato == null) {
      throw new Exception();
    }
    
    platos.add(plato);
  }
  
  public float getHoras() {
    return horas;
  }
  
  public String getTitulo() {
    return titulo;
  }
  
  public String toString() {
    return "Titulo: " + titulo + ", precio: " + precio + " EUR, horas: "
        + horas;
  }
}

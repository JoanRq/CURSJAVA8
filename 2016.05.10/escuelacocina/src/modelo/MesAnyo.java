package modelo;

import java.time.LocalDate;
import java.util.ArrayList;

public class MesAnyo {
  // Atributos
  private LocalDate fecha;  // Este es el mes y anyo
  
  // Resultado de la normalización
  private ArrayList<Matricula> matriculas;
  
  // Métodos
  /**
   * Constructor a partir del mes y el anyo, el dia lo fijamos a 1
   */
  public MesAnyo(int mes, int anyo) {
    this.fecha = LocalDate.of(anyo, mes, 1);
    
    matriculas = new ArrayList<>();
  }
  
  public void addMatricula(Matricula matricula) throws Exception {
    if (matricula == null) {
      throw new Exception();
    }
    
    matriculas.add(matricula);
  }
  
  public int getMes() {
    return fecha.getMonthValue();
  }
  
  public int getAnyo() {
    return fecha.getYear();
  }
  
  public String toString() {
    return "Mes: " + fecha.getMonth() + ", anyo: " + fecha.getYear();
  }
}
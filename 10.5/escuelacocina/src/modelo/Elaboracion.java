package modelo;

import java.time.LocalDate;

public class Elaboracion {
  // Atributos
  public enum Valoracion {
    BAJA, MEDIA, ALTA;
  }

  private Valoracion valoracion;
  
  // Resultado de la normalización
  private Plato plato;
  private int dia;
  private MatOficial matricula;
  
  // Métodos
  /**
   * Constructor de Elaboración
   */
  public Elaboracion(Plato plato, int dia, MatOficial matricula)
      throws Exception {
    
    if (plato == null || matricula == null
        || plato.getCurso() != matricula.getCurso()) {
      throw new Exception();
    }
        
    int mes = matricula.getMesAnyo().getMes();
    int anyo = matricula.getMesAnyo().getAnyo();
    LocalDate.of(anyo, mes, dia);
    
    if (matricula.numElaboraciones() >= 20) {
      throw new Exception();
    }
    
    this.dia = dia;
  }
  
  public void setValoracion(Valoracion val) {
    valoracion = val;
  }
}
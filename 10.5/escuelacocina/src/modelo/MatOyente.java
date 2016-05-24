package modelo;

public class MatOyente extends Matricula {
  // Atributos
  private float descuento;

  // Métodos
  /**
   * Constructor de Matrícula Oyente
   */
  public MatOyente(Curso curso, MesAnyo mes, Alumno alumno, float descuento)
      throws Exception {
    super(curso, mes, alumno);
    
    if (descuento < 0 || descuento > 100) {
      throw new Exception();
    }

    this.descuento = descuento;
  }
}
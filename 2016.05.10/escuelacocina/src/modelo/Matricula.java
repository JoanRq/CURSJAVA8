package modelo;

public abstract class Matricula {
  // Atributos
  private float asistencia;
  
  // Resultado de la normalización
  private Curso curso;
  private MesAnyo mes;
  private Alumno alumno;

  // Métodos
  public Matricula(Curso curso, MesAnyo mes, Alumno alumno) throws Exception {
    if (curso == null || mes == null || alumno == null) {
      throw new Exception();
    }
    
    this.curso = curso;
    this.mes = mes;
    this.alumno = alumno;
  }
  
  public Curso getCurso() {
    return curso;
  }
  
  public MesAnyo getMesAnyo() {
    return mes;
  }
  
  public void sumarAsistencia(float horas) throws Exception {
    if (asistencia + horas > curso.getHoras()) {
      throw new Exception();
    }
    
    this.asistencia += horas;
  }
}
package modelo;

import java.util.ArrayList;

public class Alumno extends Persona {
  // Atributos
  private int anyoNac;
  
  // Resultado de la normalización
  private ArrayList<Matricula> matriculas;
  
  // Métodos
  public Alumno(String nombre, String telf, int anyoNac) throws Exception {
    super(nombre, telf);
    
    this.anyoNac = anyoNac;
    
    matriculas = new ArrayList<>();
  }
  
  public void addMatricula(Matricula matricula) throws Exception {
    if (matricula == null) {
      throw new Exception();
    }
    
    matriculas.add(matricula);
  }
  
  public String toString() {
    return "Nombre: " + nombre + ", telf: " + telf + ", anyo nac: " + anyoNac;
  }  
}
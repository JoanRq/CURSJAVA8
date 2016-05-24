package controlador;

import modelo.Alumno;
import modelo.Curso;
import modelo.Elaboracion;
import modelo.Matricula;
import modelo.MatOficial;
import modelo.MatOyente;
import modelo.MesAnyo;
import modelo.Plato;

import java.util.ArrayList;
import java.util.HashMap;

public class Escuela {
  
  // Atributos
  private HashMap<String, Curso> cursos;
  private HashMap<String, Alumno> alumnos;
  private HashMap<String, Matricula> matriculas;
  private HashMap<String, Plato> platos;
  private HashMap<String, Elaboracion> elaboraciones;
  
  // Métodos
  public Escuela() {
    cursos = new HashMap<>();
    alumnos = new HashMap<>();
    matriculas = new HashMap<>();
    platos = new HashMap<>();
    elaboraciones = new HashMap<>();
  }
  
  /**
   * addMatricula: oyente si es false, se ignora el descuento.
   */
  public void addMatricula(String curso, String alumno, int mes, int anyo,
      boolean oyente, float descuento) throws Exception {
    // 1. Buscar el curso
    Curso c = buscarCurso(curso);
    
    // 2. Buscar el alumno
    Alumno a = buscarAlumno(alumno);
    
    // 3. Crear el MesAnyo a partir del mes y el anyo
    MesAnyo ma = new MesAnyo(mes, anyo);
    
    // 4. Crear la Matricula
    Matricula m = oyente ? new MatOyente(c, ma, a, descuento)
        : new MatOficial(c, ma, a);
    
    // 5. Enlazar la nueva matrícula al dominio
    c.addMatricula(m);
    ma.addMatricula(m);
    a.addMatricula(m);

    // 6. Añadirla a la base de datos de matrículas
    matriculas.put(curso + "|" + mes + "|" + anyo + "|" + alumno, m);
  }
  
  public void addElaboracion(String nomPlato, int dia, int mes, int anyo,
      String nomAlumno) throws Exception {
    
    // 1. Localizar el plato
    Plato p = buscarPlato(nomPlato);
    
    // 2. Pillar el curso del plato
    Curso c = p.getCurso();
    
    // 3. Obtener la matrícula
    Matricula m = buscarMatricula(c.getTitulo(), mes, anyo, nomAlumno);
    
    // 4. ¿Es matrícula oficial?
    if ((m instanceof MatOficial) == false) {
      throw new Exception();
    }

    // 5. Localizar el alumno
    Alumno a = buscarAlumno(nomAlumno);
    
    ////// Comprobar multiplicidades en Elaboración 
    
    // 6. Crear elaboracion
    MatOficial mo = (MatOficial) m;
    Elaboracion e = new Elaboracion(p, dia, mo);
    
    // 7. Conectarla con el modelo
    mo.addElaboracion(e);
    p.addElaboracion(e);
    
    // 8. Añadir a la base de datos de elaboraciones
    elaboraciones.put(nomPlato + "|" + dia + "|" + mes + "|" + anyo + "|"
      + nomAlumno, e);
  }
  
  public Matricula buscarMatricula(String nomCurso, int mes, int anyo,
      String alumno) throws Exception {
    Matricula m = matriculas.get(nomCurso + "|" + mes + "|" + anyo + "|"
        + alumno);
        
    if (m == null) {
      throw new Exception();
    }
    
    return m;
  }
  
  public Curso buscarCurso(String titulo) throws Exception {
    Curso c = cursos.get(titulo);
    if (c == null) {
      throw new Exception();
    }
    return c;
  }
  
  public Alumno buscarAlumno(String nombre) throws Exception {
    Alumno a = alumnos.get(nombre);
    if (a == null) {
      throw new Exception();
    }
    return a;
  }
  
  public Plato buscarPlato(String nombre) throws Exception {
    Plato p = platos.get(nombre);
    if (p == null) {
      throw new Exception();
    }
    return p;
  }
  
  public void addAlumno(String nombre, String telf, int anyo)
      throws Exception {
    alumnos.put(nombre, new Alumno(nombre, telf, anyo));
  }

  public void addCurso(String titulo, float precio, float horas)
      throws Exception {
    cursos.put(titulo, new Curso(titulo, precio, horas));
  }
  
  public void addPlato(String nombre, String nombreCurso)
      throws Exception {
    // 1. Busco el curso a ver si existe
    Curso c = buscarCurso(nombreCurso);
    
    // 2. Asegurarme que el plato no existe ya
    Plato p = platos.get(nombre);
    if (p != null) {
      throw new Exception();
    }
    
    // 3. Crear el plato
    Plato p2 = new Plato(nombre, c);
    
    // 4. Añado el plato a la base de datos de platos
    platos.put(nombre, p2);
  }  
}

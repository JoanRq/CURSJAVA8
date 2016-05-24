package vista;

import controlador.Escuela;
import java.util.Scanner;

public class Vista {
  // Atributos
  private Escuela escuela;
  private Scanner entrada;
  
  // Métodos
  public Vista() {
    escuela = new Escuela();
    entrada = new Scanner(System.in);
  }
  
  public void pedirAlumno() {
    boolean error = true;
    while (error) {
      try {
        System.out.print("Introduce un nombre de alumno: ");
        String nombre = entrada.nextLine();
        System.out.print("Introduce su teléfono: ");
        String telefono = entrada.nextLine();
        System.out.print("Introduce el año de nacimiento: ");
        int anyo = Integer.parseInt(entrada.nextLine());
    
        escuela.addAlumno(nombre, telefono, anyo);
        error = false;
      } catch (Exception e) {
        System.err.println("Los parametros no son correctos\n");
      }
    }
  }
  
  public void pedirCurso() {
    boolean error = true;
    while (error) {
      try {
        System.out.print("Introduce un nombre de curso: ");
        String nombre = entrada.nextLine();
        System.out.print("Introduce precio del curso: ");
        float precio = Float.parseFloat(entrada.nextLine());
        System.out.print("Introduce las horas del curso: ");
        float horas = Float.parseFloat(entrada.nextLine());
    
        escuela.addCurso(nombre, precio, horas);
        error = false;
      } catch (Exception e) {
        System.err.println("Los parametros no son correctos\n");
      }
    }
  }
  
  public void pedirMatricula() {
    boolean error = true;
    while (error) {
      try {
        System.out.print("Introduce el título del curso: ");
        String curso = entrada.nextLine();
        System.out.print("Introduce el nombre del alumno: ");
        String alumno = entrada.nextLine();
        System.out.print("Introduce el mes de la matrícula: ");
        int mes = Integer.parseInt(entrada.nextLine());
        System.out.print("Introduce el año de la matrícula: ");
        int anyo = Integer.parseInt(entrada.nextLine());
        System.out.print("Matrícula oyente? (s/n): ");
        boolean oyente = entrada.nextLine().charAt(0)=='s';
        float desc = 0;
        if (oyente) {
          System.out.print("Introduce el descuento: ");
          desc = Float.parseFloat(entrada.nextLine());          
        }
    
        escuela.addMatricula(curso, alumno, mes, anyo, oyente, desc);
        error = false;
      } catch (Exception e) {
        System.err.println("Los parametros no son correctos\n");
      }
    }
  }
  
  public void menu() {
        
    while (true) {
      try {
        System.out.println();
        System.out.println("1. Dar de alta cursos");
        System.out.println("2. Dar de alta alumnos");
        System.out.println("3. Dar de alta matrículas");
        System.out.println("4. Salir");
        System.out.println();
        System.out.print("Introduce una opción: ");
        
        int opcion = Integer.parseInt(entrada.nextLine());
    
        switch (opcion) {
          case 1:
            pedirCurso();
            break;
          case 2:
            pedirAlumno();
            break;
          case 3:
            pedirMatricula();
            break;
          case 4:
            return;
          default:
            System.err.println("Opción no válida\n");
        }
      } catch (Exception e) {
        System.err.println("Introduce un número\n");
      }
    }
  }
  
  public static void main(String[] args) {
    Vista v = new Vista();
    v.menu();    
  }
}
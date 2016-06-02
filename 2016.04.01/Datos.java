import java.util.Scanner;

public class Datos {
  public static void main(String[] arg) {
    Scanner e = new Scanner(System.in);
	
    // Obtener el nombre
    System.out.print("Escribe tu nombre: ");
	  String nombre = e.next();

    // Obtener el apellido
	  System.out.print("Escribe tu apellido: ");
	  String apellido = e.next();

    // Obtener la edad
    int edad = obtenerEdad();
  
	  System.out.println("Nombre: " + nombre + 
	    " Apellido: " + apellido +
	    " Edad: " + edad);
      
  }
    
  static int obtenerEdad(Scanner e) {
    boolean estamal = false;
    int edad = 0;
    do {
      System.out.print("Escribe tu edad: ");

      try {
	      edad = e.nextInt();
        estamal = false;
      } catch(Exception ex) {
	      System.out.println("Tio escribe un num!");
        estamal = true;
        e.nextLine();
	    }
    } while (estamal);

    return edad;
  }

}
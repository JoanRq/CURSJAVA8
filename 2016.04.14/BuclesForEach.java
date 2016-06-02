// BUCLES
public class BuclesForEach {
  
  public static void main(String[] args) {

    final String[] nombres = new String[3];
    nombres[0] = "Andres";
    nombres[1] = "Lorena";
    nombres[2] = "Marcos";
    
    for (String nombre : nombres) {
      System.out.print(nombre + 
        (nombre == nombres[2] ? "" : ", "));
    }    
  }
}
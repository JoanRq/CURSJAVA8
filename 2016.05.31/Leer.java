import java.io.File;
import java.util.Scanner;

public class Leer {
  public static void main(String[] args) throws Exception {
    Scanner s = new Scanner(new File("hola.txt"));
    
    String linea = s.nextLine();
    
    System.out.println(linea);
  }
}
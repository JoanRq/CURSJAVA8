import java.io.File;
import java.io.PrintWriter;

public class Escribir {
  public static void main(String[] args) throws Exception {
    PrintWriter pw = new PrintWriter(
      new File("datos.txt"));
  
    pw.println("Hola esto es una linea");
    pw.print("Ahora pero sin linea " + 20);
    
    //pw.close();
  }
}
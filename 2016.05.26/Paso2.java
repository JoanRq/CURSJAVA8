public class Paso2 {
  static String name;
  public static void main(String[] args) {
    name = "Andreu";
    habla(name);
    System.out.println(name);
  }
  
  public static void habla(String name) {
    Paso2.name = "Andres";
  }
}
// Andreu
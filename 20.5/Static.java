public class Static {
  private String nombre = "Clase estatica";
  
  public static void primero() { }
  public static void segundo() { }
  public void tercero() { 
    System.out.println(nombre);
  }
  public static void main(String args[]) {
    primero();
    segundo();
    Static s = new Static();
    s.tercero();
  }
}
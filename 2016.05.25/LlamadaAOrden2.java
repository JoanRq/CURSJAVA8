class Orden1 {
  private String nombre = "Lorena";
  
  { // inicializador de instancia
    System.out.println(nombre);
  }
  
  private static int CUENTA = 0;
  
  static { // inicializador estatico
    System.out.println(CUENTA);
  }
  
  static { // inicializador estatico
    CUENTA += 10; System.out.println(CUENTA);
  }
  
  public Orden1() {
    System.out.println("constructor");
  }
}

public class LlamadaAOrden1 {
  public static void main(String[] args) {
    Orden1 o = new Orden1();
  }
}
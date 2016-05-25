// 0
// main
// Lorena
// 10
// constructor
class Orden2 {
  private String nombre = "Lorena";
  
  { // inicializador de instancia
    System.out.println(nombre);
  }
  
  private static int CUENTA = 0;
  
  static { // inicializador estatico
    System.out.println(CUENTA);
  }
  
  {
    CUENTA += 10; System.out.println(CUENTA);
  }
  
  public Orden2() {
    System.out.println("constructor");
  }

  public static void main(String[] args) {
    System.out.println("main");
    Orden2 o = new Orden2();
  }
}

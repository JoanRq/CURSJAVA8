public class Inicializacion {
  private String nombre = "Andreu";
  
  public Inicializacion() {
    nombre = "Joan";
    System.out.println("Ejecuto el contructor");
  }

  {
    // 1. bloques "colgando"
    System.out.println("Bloque 1");
  }

  public static void main(String[] args) {
    System.out.println("En el main");
    Inicializacion init = new Inicializacion();
    //System.out.println(init.nombre);
  }

  {
    // 1. bloques "colgando"
    System.out.println("Bloque 2");
  }
}
public class Tiburón extends Pez {
  private int númDeHijos = 8;
  
  public Tiburón(int edad) {
    super();
    tamaño = 4;
  }
  
  public void mostrarDetalles() {
    System.out.print("Tiburón con edad: " + super.getEdad());
    System.out.print(" y " + super.tamaño + " metros");
    System.out.print(" con " + númDeHijos + " hijos.");
  }
  
  public static void main(String[] args) {
    new Tiburón(10).mostrarDetalles();
  }
}
public class Paso3 {
  public static void main(String[] args) {
    StringBuilder nombre = new StringBuilder();
    habla(nombre);
    System.out.println(nombre);
  }

  public static void habla(StringBuilder nombre) {
    nombre.append("Andreu");
  }
}

// Andreu
public class Inicializadores4 {
  public static int uno;
  public static final int dos;
  private static final int tres = 3;
  private static final int cuatro;
  
  static {
    uno = 1;
    dos = 2;
    tres = 3;  // NO COMPILA; ya inicializada
    dos = 4;   // NO COMPILA; inicializada en la l. 9
  }
}
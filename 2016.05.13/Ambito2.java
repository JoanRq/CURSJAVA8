public class Ambito2 {
  public static void main(String[] args) {
    String uno, dos;
    uno = new String("a");
    dos = new String("b");
    uno = dos;
    String tres = uno;
    uno = null;
  }
}
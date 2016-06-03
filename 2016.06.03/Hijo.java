public class Hijo extends Padre {
  protected static int longitud = 7;
  public void volarH() {
    System.out.println("Vuela el hijo: " + longitud);
  }
  
  public static void main(String[] args) {
    Hijo h = new Hijo();
    h.volarP();
    h.volarH();
  }
}

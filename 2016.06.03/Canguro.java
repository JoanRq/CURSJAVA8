public class Canguro extends Marsupial {
  public boolean esBípedo() {
    return true;
  }
  public void getDescripciónCanguro() {
    System.out.println("El canguro anda a dos patas: "
       + esBípedo());
  }
  public static void main(String[] args) {
    Canguro c = new Canguro();
    c.esBípedo(2);
    c.getDescripciónMarsupial();
    c.getDescripciónCanguro();
  }
}
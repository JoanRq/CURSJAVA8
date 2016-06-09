interface TieneCola { int getLongitudCola(); }
abstract class Puma implements TieneCola {
  protected int getLongitudCola() { return 4; }
}
public class Pantera extends Puma {
  public static void main(String[] args) {
    Puma puma = new Puma();
    System.out.println(puma.getLongitudCola());
  }
  
  public int getLongitudCola(int longitud) { return 2; }
}
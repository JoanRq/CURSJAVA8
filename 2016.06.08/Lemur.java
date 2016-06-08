public class Lemur extends Primate implements TieneCola {
  public boolean esColaCorta() {
    return false;
  }

  public int edad = 10;
  
  public static void main(String[] args) {
    Lemur lemur = new Lemur();
    System.out.println(lemur.edad);
    
    TieneCola tieneCola = lemur;
    System.out.println(tieneCola.esColaCorta());
    
    Primate p = lemur;
    System.out.println(p.tienePelo());
    
    // Gorila g = lemur;  // No se puede
    Object o = lemur;
    System.out.println(o.toString());
    
    Gorila g = new Gorila();
    Primate p2 = g;
    Lemur l = (Lemur) p2;
  }
}
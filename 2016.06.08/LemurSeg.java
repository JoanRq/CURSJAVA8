public class LemurSeg extends Primate implements TieneCola {
  public boolean esColaCorta() {
    return false;
  }

  public int edad = 10;
  
  public static void main(String[] args) {
    LemurSeg lemur = new LemurSeg();
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
    // LemurSeg l = (LemurSeg) g;   // això ni tant sols compila a la esquerra cal 
                              // que hi hagin antecessors als de la dreta
                              //  i en cas de tenir un antecessor tal com 
                              //  veiem en la linea anterior no cal ni tant sols castejar
                                      
    // LemurSeg l = (LemurSeg) p2;  // això compila pero en tems d'execució peta
  }
}
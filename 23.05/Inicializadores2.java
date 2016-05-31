import java.util.ArrayList;

public class Inicializadores2 {
  private static final ArrayList<String> v = new ArrayList<>();
  public static void main(String[] args) {
    Inicializadores2 i1 = new Inicializadores2();
    Inicializadores2 i2 = new Inicializadores2();

    i1.v.add("Carles");
    i2.v.add("Andres");
    
    for(String s: i1.v) {
      System.out.println(s);
    }
  }
}
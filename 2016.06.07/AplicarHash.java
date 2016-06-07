import java.util.HashMap;
import java.util.function.BiFunction;  // Com que hem explicitat la funcio ho necessitem

public class AplicarHash {
  public static void main(String[] args) {

    HashMap<String, Integer> edades = new HashMap<>();
    edades.put("Ventura", 35);
    edades.put("Marcos", 39);
  
    System.out.println(edades);
    edades.computeIfPresent("Marcos", (s, i) -> i + 10);
    edades.computeIfPresent("Ventura",
        new BiFunction<String, Integer, Integer>() {
          public Integer apply(String s, Integer i) {
            return i + 10;
          }
        });
    
    System.out.println(edades);
  }
}

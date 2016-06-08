import java.util.HashMap;
import java.util.function.BiFunction;

public class AplicarHash {
  public static void main(String[] args) {

    HashMap<String, Integer> edades = new HashMap<>();
    edades.put("Ventura", 35);
    edades.put("Marcos", 39);
  
    edades.computeIfPresent("Marcos", (s, i) -> i + 10);
    edades.computeIfPresent("Marcos",
        new BiFunction<String, Integer, Integer>() {
          public Integer apply(String s, Integer i) {
            return i + 10;
          }
        });
    
    System.out.println(edades);
  }
}

import java.util.HashMap;

public class Nulos {
  public static void main(String[] args) {
    HashMap<String,Integer> hs = new HashMap<>();
    hs.put(null, 2);
    
    System.out.println(hs.get(null));
  }
}
import java.util.function.Predicate;

public class Predicado {
  public static void main(String[] args) {
    Predicate<String> p = s -> s.startsWith("m");
    
    System.out.println(p.test("joan"));
  }
}
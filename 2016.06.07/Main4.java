import java.util.function.BiFunction;

public class Main4 {
  public static void main(String[] args) {
    BiFunction<Integer, Integer, Integer> s = (a, b) -> a + b ;

    System.out.println(s.apply(2, 3));
  }
}

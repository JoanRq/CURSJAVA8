import java.util.function.BiFunction;

/**
 * Created by poo2 on 07/06/2016.
 */
public class ExempleBifunction {
  public static void main(String[] args) {
    BiFunction<Integer, Integer, Integer> s = (a, b) -> a+b;   // epr tant ens estalviem la interficie Sumar
    System.out.println(s.apply(2,3));
  }
}

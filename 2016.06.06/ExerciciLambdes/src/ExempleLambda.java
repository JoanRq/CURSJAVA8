/**
 * Created by poo2 on 07/06/2016.
 */
public class ExempleLambda {
  public static void main(String[] args) {
    Sumar s = (a, b) -> a + b;

    System.out.println(s.suma(2, 3));

  }
}

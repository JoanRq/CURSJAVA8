public class Main3 {
  public static void main(String[] args) {
    Sumar s = (a, b) -> a + b;              // aixi es tal com quedaria amb la operacio
                                            // lambda, necessitem encara Sumar.java
    System.out.println(s.suma(2, 3));       // per evitar Suma.java farem servir la BiFunction (main4)
  }
}
import java.io.IOException;

public class Excepciones {
  public static void main(String[] args) {
    try {
      System.out.println("trabajar duro");
    } catch (StackOverflowError e) {
    } catch (RuntimeException e) {
    }
  }
}
public class Errores {
  public static void main(String[] args) {
  
    try {
      f1();
    } catch(StackOverflowError soe) {
      System.out.println("HOLA QUE TAL");
    }

  }

  static Exception f1() throws String {
    f1();
    return new Exception();
  }
}
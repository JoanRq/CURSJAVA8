public class Main2 {
  public static void main(String[] args) {
    Sumar s = new Sumar() {
      public int suma(int a, int b) {
        return a + b;
      }
    };
    
    System.out.println(s.suma(2, 3));
  }
}

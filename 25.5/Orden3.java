public class Orden3 {
  static { sumar(2); }
  
  static void sumar(int num) { System.out.print(num + " "); }
  public Orden3() {
    sumar(5);
  }
  
  { sumar(6); }
  
  static { new Orden3(); }
  
  { sumar(8); }

  static { sumar(4); }
  
  public static void main(String[] args) { }
}
public class Main2 {
  public static void main(String[] args) {  // "compactem" una mica...
    Sumar s = new Sumar() {                 // de fet el que fem es posar
      public int suma(int a, int b) {       //  tot en una funcio que definim
        return a + b;                       // no queda gaire "compactat" 
      }                                     // pero es explicatiu de Main3
    };
    
    System.out.println(s.suma(2, 3));
  }
}

public class Opuesto {
  public static void main(String[] args) {
    System.out.println(opuesto(7));
    System.out.println(suma(2,3));
  }
  
  public static int opuesto(int a) {
    return -a;
  }

  public static int suma(int a, int b) {
    return a+b;
  }
  
  public static int sumaDeOpuesto(int a) {
    int op = opuesto(a);
    int s  = suma(a, op);
    return s;
  }
  
  private static int opuestoDeSuma(int a, int b) {
    int s = suma(a, b);
    int op = opuesto(s);
    return op;
  }
}
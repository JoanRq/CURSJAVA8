public class Varargs {
  public static void main(String[] args) {
    f1("s1", "s2", "d4");
    suma(2, 3);
    suma(2, 2, 2);
    System.out.println(suma());

    System.out.println(sumar(0, 3, 5, 7));
  }
  
  public static void f1(String... s) {
    System.out.println(s[1]);
  }
  
  public static int suma(int... s) {
    int sum = 0;
    for (int i = 0; i < s.length; i++) {
      sum += s[i];
    }
    return sum;
  }
  
  public static int sumar(int p, int... s) {
    return p >= s.length ? 0 : s[p] + sumar(p + 1, s);
  }
}
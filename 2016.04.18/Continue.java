public class Continue {
  public static void main(String[] args) {
    PRIMER_BUCLE: for (int a = 1; a <= 4; a++) {
      for (char x = 'a'; x <= 'c'; x++) {
        if (a == 2 || x == 'b')
          continue;
        System.out.print(" " + a + x);
      }
    }
  }
}
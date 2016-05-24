public class nota {
  public static void main(String[] args) {
    int a = Integer.parseInt(args[0]);
    int e = Integer.parseInt(args[1]);
    float n = a - 0.333f *e;
    float d = n * 10 / 11;
    System.out.println(d);
  }
}
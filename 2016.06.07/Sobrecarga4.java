public class Sobrecarga4 {
  public static String volar(String s) {
    return "1";
  }

  public static String volar(String... s) {
    return "2";
  }
  /*
  public static String volar(Object o) {
    return "3";
  }
  */
  public static String volar(String s, String t) {
    return "4";
  }

  public static String volar(int l) {
    return "5";
  }
  
  public static String volar(long... l) {
    return "6";
  }
  
  public static void main(String[] args) {
    System.out.println(volar("a"));
    System.out.println(volar("a", "b"));
    System.out.println(volar("a", "b", "c"));
    System.out.println(volar(4));
    System.out.println(volar(4L));
  }
}
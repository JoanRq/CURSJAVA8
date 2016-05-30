public class Exc1 {
  public static void main(String[] args) throws Exception {
    String s = "";
    try {
      if (true) throw new Exception();
      s += "t";
    } catch(RuntimeException e) {
      s += "c";
    } finally {
      s += "f";
    }
    s += "a";
    System.out.println(s);
  }
}
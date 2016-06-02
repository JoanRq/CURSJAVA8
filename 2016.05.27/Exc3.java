public class Exc3 {
  public static void main(String[] args) {
    String res = "";
    String v = null;
    try {
      try {
        res += "antes";
        v.length();
      } catch(NullPointerException e) {
        res += "catch";
        throw new Exception();
      } finally {
        res += "finally";
        throw new RuntimeException();
      }
    } catch(RuntimeException e) {
      res += "hecho";
      throw e;
    } catch(Exception e) {
      res += "exc";
    }
    System.out.println(res);
  }
}
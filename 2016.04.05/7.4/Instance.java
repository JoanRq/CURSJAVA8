public class Instance {
  public static void main(String[] args) {
    String s1 = "hola";
    boolean b = s1 instanceof String;
    
    if (b) {
      System.out.println("Son del mismo tipo");
    }
  }
}

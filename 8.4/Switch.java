public class Switch {
  public static void main(String[] a) {
    final String m = "holatio";
    final String s = "tio";
    int id = 9;
    
    switch (a[0]) {
      case "Test":
        System.out.println("A");
        return;
      case m:
        System.out.println("B");
        throw new Exception();
      case s:
        System.out.println("C");
        break;
    }
    
    System.out.println("D");
  }
}
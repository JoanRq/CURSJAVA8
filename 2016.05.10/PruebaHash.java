public class PruebaHash {
  public static void main(String[] args) {
    StringBuilder sb1 = new StringBuilder();
    sb1.append("bla");
    StringBuilder sb2 = new StringBuilder();
    sb2.append("bla");
    
    StringBuilder sb3 = sb2;
    
    System.out.println(sb1.hashCode());
    System.out.println(sb2.hashCode());
    System.out.println(sb3.hashCode());
  }
}
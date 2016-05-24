public class Sobrecarga2 {
  public void volar(int[] longitudes) { }
  //public void volar(int... longitudes) { } // no compila

  public static void volar(int a) {}
  public static void volar(Integer a) {}
  
  public static void main(String[] args) {
    volar(new Integer(2));
  }
}
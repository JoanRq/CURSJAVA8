public class Paso4 {
  
  public static void main(String[] args) {
    int[] original = new int[] { 1, 2 };
    intercambio(original);
    System.out.println(original[0]);
    System.out.println(original[1]);
  }

  public static void intercambio(int[] original) {
    int tmp = original[0];
    original[0] = original[1];
    original[1] = tmp;
  }
}
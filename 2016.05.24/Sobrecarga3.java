public class Sobrecarga3 {
  public void volar(String s) {
    System.out.print("string ");
  }
/*
  public void volar(Object o) {
    System.out.print("object ");
  }
  */
  public static void main(String[] args) {
    Sobrecarga3 s3 = new Sobrecarga3();
    s3.volar("test");
    s3.volar(56);
  }
}
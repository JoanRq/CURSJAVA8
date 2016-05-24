public class Variables {
  private void f1(int suma, int... nums) {
  }

  private void suma(Integer res, int... nums) {
    for(int n: nums) {
      res += n;
    }
    System.out.println(res);
  }
  
  public static void main(String[] args) {
    Variables v1 = new Variables();
    //System.out.println(v1.suma(1, 2, 3, 4, 5));
    Integer i = new Integer(0);
    v1.suma(i, 1, 2, 3);
    System.out.println(i);
  }
}
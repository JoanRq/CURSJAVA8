public class Relacionales {
  public static void main(String[] args) {
    int x = 10, y = 20, z = 10;
  /*
    System.out.println(x < y);  // 1.
    System.out.println(x <= y); // 2.
    System.out.println(x >= y); // 3.
    System.out.println(x > z);  // 4.
    System.out.println(x = y);  // 5.
  */
    
    
    
    y = 20;    
    boolean b = false || (y++ < 20);
    System.out.println(b);      // 6.
    System.out.println(y);      // 6.1

    y = 20;    
    boolean bb = false && (y++ < 20);
    System.out.println(bb);     // 6.2
    System.out.println(y);      // 6.3

  /*     
    boolean b2 = true == 3;
    System.out.println(b2);     // 7.
  
    boolean b3 = false != "Jirafa";
    System.out.println(b3);     // 8.
    */
    /*
    long l1 = 4L;
    int i2 = 2;
    boolean b4 = l1 == i2;
    System.out.println(b4);     // 9.
*/
    boolean b4 = false;
    boolean b5 = b4 = true;    
    System.out.println(b4);     // 10.    
    System.out.println(b5);     // 10.
    
    
  }
}
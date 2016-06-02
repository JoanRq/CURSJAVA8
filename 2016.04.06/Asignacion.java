public class Asignacion {
  public static void main(String[] args) {
    /*
    int x = 1;                    // 1.
    int y = (int) 1.9999;         // 2.
    short z = (short) 1921222;    // 3.
    int z1 = (int) 0x1f;          // 4.
    long t = 123495293499934423L; // 5.

    short s1 = 10;
    short s2 = 3;
    short s3 = (short) (s1 * s2);
    System.out.println(s3);    
    
    // Compuestos
    
    int c1 = 2, c2 = 3;
    c1 = c1 * c2;
    c1 *= c2;
   
    long x = 10;
    int y = 5;
    y *= x;
*/
    long x = 5;
    long y = (x = 3);    
    System.out.println(x);
    System.out.println(y);

        
  }
}
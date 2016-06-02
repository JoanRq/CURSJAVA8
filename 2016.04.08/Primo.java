public class Primo {
  public static void main(String[] args) {
    for(long i=2; i<100; i++)
      if (esPrimo(i)) System.out.println(i);
  }

  public static boolean esPrimo(long l) {
    for(long i=2; i<=l/2; i++)
      if (l%i == 0) return false;      
    
    return true;
  }
}
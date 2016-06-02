public class Sobrecarga {
  public void volar(int numkm) { }
  public void volar(short numkm) { }
  public boolean volar() { return true; }
  void volar(int numkm, short numcm) { }
  public void volar(short numkm, int numcm) throws Exception { }
  
  // public int volar(int numkm) { return 2; } // no COMPILA
  // public static void volar(int n) { } // No compila
  
  public static void main(String[] args) {
    Sobrecarga s = new Sobrecarga();
    s.volar(2);
    s.volar((short) 2);
    s.volar();
    s.volar(2, (short) 2);
    s.volar((short) 3, 2);    
  }
}
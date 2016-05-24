public class BuclesAnidados {
  public static void main(String[] args) {
    int[][] ajedrez = new int[8][8];
    ajedrez[5][4] = 1234589;
    
    int longitud = longitudMasLarga(ajedrez);
    
    for (int i=0; i<8; i++) {
      for (int j=0; j<8; j++) {
        System.out.println(i + " " + j
            + ": " + ajedrez[i][j]);
      }
    }
  }
  
  public static int longitudMasLarga(int[][] ajedrez) {
    
  }
}
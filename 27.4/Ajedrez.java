public class Ajedrez {

  public static void main(String[] args) {
    char[][][] t = new char[][][] {
      {
        { 'T', 'C', 'A' },
        { 'T', 'C', 'A' },
        { 'T', 'C', 'A' }
      }, {
        { 'T', 'C', 'A' },
        { 'T', 'C', 'A' },
        { 'T', 'C', 'A' }
      }, {
        { 'T', 'C', 'A' },
        { 'T', 'C', 'A' },
        { 'T', 'C', 'A' }
      };
  }
  
  public static void mover(int x0, int y0, int x1, int y1) {
    // 1. copiar el tablero antiguo en el nuevo 
    //    copiar hist_tablero[(i+1)%10] = hist_tablero[i]
    
    // 2. Muevo ficha
    //   2.1 compruebo que en x0, y0 hay un peon
    //   2.2 compruebo que x0 == x1, y1 == y0 +1
    //   2.3 hist_tablero[i][x1][y1] = hist    
    
  }  
  
  
  
  
  
  
  
  
  
  
  
  
  
}
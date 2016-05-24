public class Multis {
  public static void main(String[] args) {
    int[][] var;
    int var2[][];
    int[] var3[];
    int[] var4[], var5[][];
    var = new int[3][2];
    
    int[][][] cubo = new int[3][3][3];
    
    int[][] tamanyoDist = {{1, 4}, {3}, {9,8,7}};
   
    int[][] tablero = new int[4][];
    tablero[0] = new int[3];
    tablero[1] = new int[3];
    tablero[2] = new int[3];    
    tablero[3] = new int[3];
    
    for (int i=0; i < cubo.length; i++) {
      for (int j=0; j < cubo[i].length; j++) {
        for (int z=0; z < cubo[i][j].length; z++) {
          System.out.println(cubo[i][j][z] + " ");
        }
      }
    }
  }
}
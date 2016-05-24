public class Rotar {
  public static void main(String[] args) {
    int[][] im = new int[][] {
      { 1, 2, 3, 4, 5},
      { 6, 7, 8, 9, 10},
      { 11, 12, 13, 14, 15},
      { 16, 17, 18, 19, 20},
      { 21, 22, 23, 24, 25}      
    };
    
    imprimir(im);
    int[][] r = rotarv1(im);
    imprimir(r);
  }
  
  public static int[][] rotarv1(int[][] imagen) { 
    int[][] res = new int[imagen.length][imagen[0].length];
    
    for (int i1 = 0; i1 < imagen.length; i1++) {
      for (int j1 = 0; j1 < imagen[i1].length; j1++) {
        res[j1][imagen.length - 1 - i1] = imagen[i1][j1];
      }
    }
    
    return res;
  }
  
  public static void rotarv2(int[][] imagen) {
    
  }
  
  
  
  
  
  
  public static void imprimir(int[][] imagen) {
    for (int i = 0; i < imagen.length; i++) {
      for (int j = 0; j < imagen[i].length; j++) {
        System.out.print(imagen[i][j] + " ");
      }
      System.out.println();
    }
    System.out.println();
  }
}
/*  public static int[][] rotarv1 (int[][] imagen){
    int res[][] =new int[imagen.length][imagen[0].length];
      
      for (int i=0; i<imagen.length; i++) {
        for (int j=0; j<imagen[i].length; j++){             
          res[j][imagen.length - 1 - i] = imagen[i][j];     
        }
      }
    return res;
  }
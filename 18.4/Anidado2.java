public class Anidado2 {
  public static void main(String[] args) {
    int[][] arrayBi = {{5,2,1,3},{3,9,8,9},{5,7,12,7}};
    BUCLE_EXT: for (int j=0; j<arrayBi.length; j++) {
      BUCLE_INT: for (int i=0; i<arrayBi[j].length; i++) {
        if (arrayBi[j][i] == 3) {
          continue BUCLE_INT;
        }
        System.out.print(arrayBi[j][i] + "\t");
      }
      System.out.println();
    }
  } 
}
public class MatrículaOficial extends Matrícula {
  protected static int longitud = 7;
  public void volarH() {
    System.out.println("Vuela el hijo: " + longitud);
  }
  
  public void caminar() {
    
  }
  
  public static void main(String[] args) {
    MatrículaOficial h = new MatrículaOficial();
    h.volarP();
    h.volarH();
  }
}

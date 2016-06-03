public abstract class Matrícula {
  protected static int longitud = 4;
  public void volarP() {
    System.out.println("Vuela el padre: " + longitud);
  }
  
  public abstract void caminar() {}
}

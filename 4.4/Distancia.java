public class Distancia {
  public static void main(String[] args) {
    System.out.println(dist(2.0, 6.0, 3.0, 6.0, 4.0, 4.0));
  }
  
  /*
   * Función que calcula la distancia entre 2 puntos,
   * en 3D.
   */
  public static double dist(double x1, double x2,
                            double y1, double y2,
                            double z1, double z2) {
  
    double a = x2 - x1;
    double b = y2 - y1;
    double c = z2 - z1;
    return Math.sqrt(a*a + b*b + c*c);
  }
}
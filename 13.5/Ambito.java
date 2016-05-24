public class Ambito {
  public static void main(String[] args) {
    {
      Plato p2;
      {
        Plato p = new Plato();
        System.out.println(p.color);
        p2 = p;
      }
      
      System.out.println(p.color);
    }
  }
}
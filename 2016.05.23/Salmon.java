public class Salmon {
  int cuantos;
  public void Salmon() {
    cuantos = 4;
  }
  /*
  public Salmon() {
    cuantos = 6;
  }*/
  public static void main(String[] args) {
    Salmon s = new Salmon();
    s.Salmon();
    System.out.println(s.cuantos);
  }
}
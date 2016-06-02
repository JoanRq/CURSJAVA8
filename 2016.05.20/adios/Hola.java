package adios;
public class Hola {
  protected String ruido = "bla";
  protected void HacerRuido() {
    System.out.println(ruido);
  }
  private void masRuido() {
    HacerRuido();
  }
}
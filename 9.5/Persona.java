
public class Persona {
  protected String nombre;
  protected String telf;
  private ArrayList<Cenas> come;
  public Persona(String nombre, String telf) {
    this.nombre = nombre;
    this.telf = telf;
    come = new ArrayList<>();
  }
}
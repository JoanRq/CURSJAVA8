
public class Alumno extends Persona {
  private int anyoNacimiento;
  public Alumno(String nombre, String telf, int anyNac) {
    super(nombre, telf);
    anyoNacimiento = anyNac;
  }
}
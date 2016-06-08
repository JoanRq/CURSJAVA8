public class Periquito extends Pajaro {
  public String getNombre() {
    return "Periquito";
  }
  public int getEdad() {
    return 2;
  }
  public static void main(String[] args) {
    Pajaro paj = new Periquito();
    paj.mostrarInfo();
  }
}
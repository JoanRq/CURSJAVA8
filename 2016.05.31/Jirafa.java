
public class Jirafa extends Animal {
  public Jirafa(int edad) {
    super(5);
    this.edad = edad;
  }
  
  public void platos() {
    edad = 4;
    System.out.println("Tirar platos");
  }
  public static void main(String[] args) {
    Jirafa j = new Jirafa(4);
    j.setEdad(25);
  }
}

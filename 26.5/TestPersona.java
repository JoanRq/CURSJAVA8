class Persona {
  private int edad;
  private boolean alto;

  private boolean juega;
  private String nombre;
  
  public boolean getJuega() {  // es isJuega()
    return juega;
  }

  public String getNombre() {
    return nombre;
  }
  
  public void updateNombre(String n) {
    nombre = n;
  }
  
  public void setnombre(String n) {
    nombre = n;
  }
  
  public int getEdad() {
    return edad;
  }
  
  public void setEdad(int edad) {
    this.edad = edad;
  }
  
  public void setAlto(boolean alto) {
    this.alto = alto;
  }
  
  public boolean isAlto() {
    return alto;
  }
}

public class TestPersona {
  public static void main(String[] args) {
    Persona joan = new Persona();
    
    //joan.edad = 19;
  }
}
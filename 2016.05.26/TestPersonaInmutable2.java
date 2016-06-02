class PersonaInmutable2 {
  private StringBuilder nombre;
  
  public PersonaInmutable2(StringBuilder n) {
    nombre = n;
  }
}

public class TestPersonaInmutable2 {
  public static void main(String[] args) {
    StringBuilder sb = new StringBuilder();
    PersonaInmutable2 p = new PersonaInmutable2(sb);
    
    sb.append("hola");
  }
}
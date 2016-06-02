public class Cliente {
  // Atributos
  private String nombre;
  private String dni;
  private String email;
  public ArrayList<PaqueteViaje> contrata;
  
  // Metodos
  // Constructor
  public Cliente(String nombre, String dni, String email,
      PaqueteViaje paquete) {

    this.nombre = nombre;
    this.dni = dni;
    this.email = email;
    
    contrata = new ArrayList<>();

    contrata.add(paquete);
  }
}
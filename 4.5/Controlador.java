public class Controlador {
  public static void main(String[] args) {
    Cliente lorena = 
        new Cliente("Lorena", "24564455C", "hola@quetal.com", pq);
    
    
    ////////////////////////////////////////////////
    
    
    lorena.nombre = "Lorena";
    lorena.dni = "24564455C";
    lorena.email = "hola@quetal.com";
    lorena.contrata = new ArrayList<>();
    
    PaqueteViaje pq = new PaqueteViaje();
    lorena.contrata.add(pq);
    
    
  }
}
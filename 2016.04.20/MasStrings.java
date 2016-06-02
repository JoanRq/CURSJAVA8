public class MetodosStrings {
  public static void main(String[] args) {
    String s = "1";
    s = s + "2";
    s += "3";
    
    System.out.println(s.length()); // nos muestra cuantas posiciones tiene el String.
    System.out.println(s.charAt(3)); // muestra el valor en esa posición del String. Si la posició no existe, lanza una excepción (error)
    System.out.println(s.indexOf(2)); // Busca este char y nos muestra su posición dentro del String y si no lo encuentra, no peta, da un '-1'. Tmb puedes pasar un String y te dice en que posición empieza. 
    System.out.println(s.substring(1, 3)); // Declarada la variable 'String s = "Hola que tal"'. El resultado de esta linea sería mostra por pantalla : 'ol'. El primer número apunta al índice y el segundo muestra la letra que en la posición n-1.  
    System.out.println(s.toLowerCase()); // Pasa todo el String a letras minúsculas.
    System.out.println(s.toUpperCase()); // Pasa  todo el String a mayúsculas.
    System.out.println(s.indexOf(2).toUpperCase); // Se pueden concatenear métodos y no da error.
    System.out.println(s.equals("hola")); ó System.out.println("hola".equals(s)); // Compara char por char dos Strings. Ambas expresiones son correctas y evaluan igual.
    System.out.println(s.equalsIgnoreCase("HoLa QuE tAL")); // compara los chars sin tener encuenta si está en mayúsculas o minúsculas.
    System.out.println(s.startsWith("Hola")); // Devuelve true or false, dependiendo si empieza o no por el String que pasas.    
    System.out.println(s.endsWith("Hola")); // Misma función que el método anterior, pero mira si el final del String coincide con el que pasamos.
    System.out.println(s.contains("Hola")); // Mira si el String declarado contiene el String que le pasamos.
    System.out.println(s = s.replace("Hola", "hola")); // Reeemplaza la parte del String declarado que indicamos por el que le pasamos en segundo lugar.
                                                       // Se indica s=s pq el String declarado es inmutable, así que le tenemos que asignar el cambio y guardarlo en la misma direcció de memoria. Sino se guarda en otro lugar inaccesible y por supuesto no lo muestra.
    System.out.println(s.trim()); // Elimina todos los espacios del String declarado.                                                   
  }
}
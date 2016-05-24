public class Plato {
  // atributos
  public int color;

  // metodos
  
  public int getColor() {
    return color;
  }
  
  // metodos estáticos
  public static int getColores() {
    return 5;
  }

  public static void main(String[] args) {
    Plato platoRojo = new Plato();
    
    platoRojo.color = 3;
    
    System.out.println(platoRojo.getColores());
    
    System.out.println(Plato.getColores());
  }
}












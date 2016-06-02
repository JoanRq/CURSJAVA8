public class Color {
  // Atributos
  public int color;
  public static int otroColor;
  public ArrayList<String> as;
  
  public static void main(String[] args) {
    Color rojo = new Color();
    rojo.color = 2;
    otroColor = 4;
    
    Color azul = new Color();    
    azul.color = 3;
    otroColor = 5;
    
    System.out.println(rojo.color);
    System.out.println(rojo.otroColor);
    System.out.println(azul.color);
    System.out.println(azul.otroColor);
  }

}
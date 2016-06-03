public class Orden1 {
    { System.out.println("linea2"); }
    private String nombre = "Lorena";
    { System.out.println("linea3"); }
    { System.out.println(nombre);}
    private static int CUENTA = 0;
    { System.out.println("linea7"); }
    static { CUENTA += 10; }
    static { System.out.println(CUENTA); }
    public Orden1(){ System.out.println("Constructor"); }
    public static void main(String[] args){ 
      //Orden1 o = new Orden1(); 
      } 
}

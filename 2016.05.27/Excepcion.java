public class Excepcion {
  public static void main(String[] args) {
    Excepcion exc = new Excepcion();
    try {
      exc.b(args);    
    } catch (Exception e) {
      System.out.println("Falla en main");
    }
  }
  
  void b(String[] args) throws Exception {
    try {
      //System.exit(3);
      if (args.length == 0) return;
      c(args);
    } catch (RuntimeException e) {
      System.out.println("Falla en b");
      throw new Exception();
    } catch (Exception e) {
      System.out.println("Falla e");
    } finally {
      System.out.println("SE EJECUTA SIEMPRE");
    }
    
    System.out.println("Hola");
  }
  
  void c(String[] args) {
    System.out.println(args[1]);
  }
}
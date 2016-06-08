import java.util.function.Predicate;               // Això si entra :-)

public class PredicadoSeg {                        // reanomenat per que el Zeus es un trasto i me'l canviarà
  public static void main(String[] args) {
    Predicate<String> p = s -> s.startsWith("m");  // Si fossin varies linies caldria englobar el "predicat"
                                                   // entre claus i retornar el valor amb un return  
    System.out.println(p.test("joan"));
  }
}
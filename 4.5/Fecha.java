import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Scanner;

public class Fecha {
  public static void main(String[] args) {
    
    Scanner entrada = new Scanner(System.in);  
    
    System.out.print("Pon una fecha (DD/MM/AAAA): ");
    String fecha = entrada.next();
    ///////////////////
    DateTimeFormatter dtf = DateTimeFormatter
        .ofPattern("dd/MM/yyyy");

    LocalDate ld1 = LocalDate.parse(fecha, dtf);
  /////////////////////////
    System.out.println(ld1.getDayOfWeek());
  
    DateTimeFormatter sem = DateTimeFormatter
        .ofPattern("EEEE");

    System.out.println("Dia de la semana: " + ld1.format(sem));
  }
}
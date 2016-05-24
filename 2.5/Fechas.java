import java.time.*;
import java.time.format.*;

public class Fechas {
  public static void main(String[] args) {
    System.out.println(LocalDate.now());
    System.out.println(LocalTime.now());
    System.out.println(LocalDateTime.now());
    
    LocalDate ld = LocalDate.of(2015, 2, 28);
    System.out.println(ld);
    
    LocalTime lt = LocalTime.of(2, 15, 59, 200000000);
    System.out.println(lt);
    
    LocalDateTime ldt = LocalDateTime.of(2016, 1, 20, 2, 15, 59);
    LocalDateTime ldt2 = LocalDateTime.of(ld, lt);
    
    ld = ld.plusDays(2);
    System.out.println(ld);
    ld = ld.plusWeeks(1);
    ld = ld.plusMonths(3);
    ld = ld.plusYears(4);
    System.out.println(ld);
    
    ld = ld.minusYears(3).minusWeeks(3).minusMonths(4);
    System.out.println(ld);
    
    lt = lt.plusHours(2).minusMinutes(4).plusSeconds(3);
    System.out.println(lt);
    
    ldt = ldt.plusMinutes(4);
    System.out.println(ldt);
    
    System.out.println(ldt.isAfter(ldt2));
    
    System.out.println(ld.toEpochDay()); // FECHA UNIX

    Period p = Period.ofMonths(1);    
    Period anualmente = Period.ofYears(1);
    
    ld = ld.plus(p);
    // lt = lt.plus(p);  NO se puede sumar un mes a una hora
    
    System.out.println(ld.getYear());
    System.out.println(ld.getMonth());
    System.out.println(ld.getDayOfWeek());
    System.out.println(ld.getDayOfYear());
    System.out.println(ld.getDayOfMonth());    
    
    System.out.println(ld.format(DateTimeFormatter.BASIC_ISO_DATE));
    System.out.println(ldt.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));

    // Imprimimos fecha y hora segun formato local (España)
    DateTimeFormatter dtf = DateTimeFormatter
        .ofLocalizedDateTime(FormatStyle.SHORT);
    DateTimeFormatter dd = DateTimeFormatter
        .ofLocalizedDate(FormatStyle.SHORT);
        
    System.out.println(ldt.format(dtf));
    System.out.println(ld.format(dd));
    
    // Formateador personalizado
    DateTimeFormatter dtfp = DateTimeFormatter.ofPattern(
        "dd, yyyy, hh:mm");
    System.out.println(ldt.format(dtfp));
        
    // AL REVES
    String hora = "12:59";
    DateTimeFormatter dtfp2 = DateTimeFormatter.ofPattern(
        "hh:mm");
    LocalTime ldt3 = LocalTime.parse(hora);
    System.out.println(ldt3);
  }
}
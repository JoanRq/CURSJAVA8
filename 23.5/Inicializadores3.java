public class Inicializadores3 {
  private final static int SEGUNDOS_POR_HORA;
   
  static {
    int segundosPorMinuto = 60;
    int minutosPorHora = 60;
    SEGUNDOS_POR_HORA = segundosPorMinuto * minutosPorHora;
  }
}

public class DireccionIP {
  public static void main(String[] args) {
    System.out.println(ip2str(ints2ip(192,168,0,4)));
    
    System.out.println(
      ip2str(
        net(ints2ip(192,168,0,4),
            ints2ip(255,255,255,0))
      )
    );
    
    System.out.println(
      ip2str(
        broad(ints2ip(192,168,0,4),
              ints2ip(255,255,255,0))
      )
    );
    
    System.out.println(
      mascValida(ints2ip(255,255,255,254))
    );
    
    System.out.println(ints2ip(255,255,255,254));
  }
  
  /*
   * Pasa 4 ints (ej. 192.168.0.4) a 1 solo int
   * (la dirección IP)
   */
  public static int ints2ip(int i1, int i2,
                            int i3, int i4) {

    int a = i1 << 24;
    int b = i2 << 16;
    int c = i3 << 8;
    int d = i4;

    return a | b | c | d;    
  }
  
  /*
   * Pasa un int (ip) a String (ej "192.168.0.4")
   */
  public static String ip2str(int ip) {
    int i1 = ip >>> 24;
    int i2 = ip >>> 16 & 0xff;
    int i3 = ip >>> 8 & 0xff;
    int i4 = ip & 0xff;
    
    return i1 + "." + i2 + "." + i3 + "." + i4;
  }

  public static int broad(int ip, int masc) {
    return ip | ~masc;    
  }
  
  public static int net(int ip, int masc) {
    return ip & masc;
  }

  public static int ipmax(int ip, int masc) {
    return broad(ip, masc) -1;
  }

  public static int ipmin(int ip, int masc) {
    return net(ip, masc) +1;
  }
  
  /*
   * Devuelve true si masc es una mascara valida
   */
  public static boolean mascValida(int masc) {
    //
    // Casos especiales, mascaras no válidas:
    //  255.255.255.255  = -1
    //  255.255.255.254  = -2
    //  0.0.0.0          = 0
    //
    if (masc >= -2 && masc <= 0)
      return false;
       
    return (~masc+1 & ~masc) == 0;
  }
}

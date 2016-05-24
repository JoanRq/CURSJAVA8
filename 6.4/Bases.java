public class Bases {
  public static void main(String[] args) {
    /*
    System.out.println(hexAInt('f'));
    System.out.println(hexAInt('g'));
    System.out.println(hexAInt('\u08a9'));
    */
    
    long[] l = new long[100];
    
    String hola = "hola";
    System.out.println( hola.charAt(3) );
    System.out.println( hola.length() );
  }
  
  public static int hexAInt(char hex) {
    if (hex == '0') return 0;
    if (hex == '1') return 1;
    if (hex == '2') return 2;
    if (hex == '3') return 3;
    if (hex == '4') return 4;
    if (hex == '5') return 5;
    if (hex == '6') return 6;
    if (hex == '7') return 7;
    if (hex == '8') return 8;
    if (hex == '9') return 9;
    if (hex == 'a') return 10;
    if (hex == 'b') return 11;
    if (hex == 'c') return 12;
    if (hex == 'd') return 13;
    if (hex == 'e') return 14;
    if (hex == 'f') return 15;
    return -1;
  }

  public static int hexAIntv2(char hex) {
    switch(hex) {
      case '0': return 0;
      case '1': return 1;
      case '2': return 2;
      case '3': return 3;
      case '4': return 4;
      case '5': return 5;
      case '6': return 6;
      case '7': return 7;
      case '8': return 8;
      case '9': return 9;
      case 'a': return 10;
      case 'b': return 11;
      case 'c': return 12;
      case 'd': return 13;
      case 'e': return 14;
      case 'f': return 15;
      default:  return -1;
    }
  }
  
  public static int hexAIntv3(char hex) {
    if (hex >= '0' && hex <= '9') return hex - '0';
    if (hex >= 'a' && hex <= 'f')
      return hex - 'a' + 10;
    return -1;
  }
  
  public static long hexAInt2(String str) {
    int c1 = hexAInt(str.charAt(0));
    int c2 = hexAInt(str.charAt(1));
    
    return c1*16 + c2;
  }

  public static long hexAInt3(String str) {
    // falta acabarla
    int c1 = hexAInt(str.charAt(0));
    int c2 = hexAInt(str.charAt(1));
    
    return c1*16 + c2;
  }
  
  public static long hex2int(String str) {
    if (str.length()>15) return -1;
    
    long resparcial = 0;
    for (int i=0; i<str.length(); i++) {
      resparcial = resparcial * 16 + hexAIntv3(str.charAt(i));
    }
    return resparcial;
  }
  
  public static String hex2intTOTAL(String str) {
    return "";
  }
}



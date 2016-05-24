public class ExStrBuild {
  public static void main(String[] args) {
    StringBuilder sb = new StringBuilder();
    StringBuilder sb1 = new StringBuilder("hola");
    String str = " examen";
    StringBuilder sb2 = new StringBuilder(str);
    StringBuilder sb3 = new StringBuilder(16);
    
    System.out.println(sb1.charAt(2));
    System.out.println(sb1.indexOf("a"));
    System.out.println(sb1.length());
    System.out.println(sb1.substring(2, 4));

    System.out.println(sb1.append(sb2));
    System.out.println(sb1);
    
    StringBuilder sb4 = new StringBuilder()
        .append(1).append('c');
    sb4.append("-").append(true);
    System.out.println(sb4);
    
    System.out.println(1 + 'c' + "-" + true);
    
    sb4.insert(3, "^");
    System.out.println(sb4);
    
    // no compila
    //StringBuilder sb5 = "tio como va";
    StringBuilder sb6 = new StringBuilder("hola");
    StringBuilder sb7 = new StringBuilder("hola");
    System.out.println(sb6.toString().equals(sb7.toString()));
    
    sb7.delete(2, 2);
    sb7.deleteCharAt(1);
    System.out.println(sb7);

    sb6.reverse();
    System.out.println(sb6);

    String s = sb6.toString();
    System.out.println(s);

    sb6.deleteCharAt(sb6.indexOf("h"));
    System.out.println(sb6);
   dsdf
  }
}
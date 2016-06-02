import java.util.Arrays;

public class UnosArrays {
  public static void main(String[] args) {
    int[] alumnos = new int[] {2, 3, 4};

    int[] sillas;
    int [] sillas2;
    int sillas3[];
    int sillas4 [];

    int[] a1, b1;
    int a2[], b2;
    
    String[] animales = { "Perro", "Jirafa",
      "Mastodonte" };
    String[] anim2 = animales;

    System.out.println(animales.equals(anim2));
    System.out.println(
      Arrays.toString(animales));
    
    String[] s1 = new String[3];
    s1[0] = new String("Hola");
    s1[1] = new String("Adios");
    s1[2] = new String("Buenos dias");

    String[] str = { "valor" };
    Object[] obj = str;
    String[] oStr = (String[]) obj;
    //obj[0] = new StringBuilder();
        
    //oStr[0] = new StringBuilder();
    
    System.out.println(str.length);
    System.out.println(oStr[0].length());
    
    str[str.length - 1] = "adios";
    for (int i = 0; i < str.length; i++)
      str[i] = "adios";
    
    Arrays.sort(animales);
    System.out.println(Arrays.toString(animales));
    
    int[] nums = { 10, 9, 100 };
    Arrays.sort(nums);
    System.out.println(Arrays.toString(nums));
    
    int[] nums2 = { 4, 7, 10, 15, 200, 215 };
    
    System.out.println(
        Arrays.binarySearch(nums2, 3));
        
    System.out.println(
      Arrays.binarySearch(animales, "Jirafa"));
  }
}


















//Definición del package al que pertenece nuestra clase
package es.pue.myapp.views;

//Definición de las clases a utilizar/importar
import es.pue.myapp.model.Location;
import es.pue.myapp.model.Color;
import es.pue.myapp.model.Student;

//DRIVER: Main Class
//Fully-Qualified Name: es.pue.myapp.views.Application
public class Application {
  
    public static void main(String[] args) {
    
        System.out.printf("Sistema operativo: %s %s %n", 
                          System.getProperty("os.name"),
                          System.getProperty("os.arch"));
        
        System.out.printf("Usuario: %s -> %s %n", 
                          System.getProperty("user.name"),
                          System.getProperty("user.home"));
                          
        Location loc1 = new Location();
        //Asignamos valores a su estado
        loc1.setLatitude(40.45306);
        loc1.setLongitude(-3.68835);
        //Consultamos su estado
        System.out.printf("loc1: %f ; %f %n",
                           loc1.getLatitude(),
                           loc1.getLongitude());
        
        Color co1 = new Color();
        //Asignamos valores a su estado
        co1.setRed(127);
        co1.setGreen(30);
        co1.setBlue(87);
        co1.setName("Burdeos");
        //Consultamos su estado
        System.out.printf("co1: rgb(%d,%d,%d) - %s %n",
                           co1.getRed(), co1.getGreen(),
                           co1.getBlue(), co1.getName());
        
        Student st1 = new Student();
        
                          
                          
        
    
    }
}
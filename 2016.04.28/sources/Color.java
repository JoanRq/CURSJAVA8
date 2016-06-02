//Definición del package al que pertenece nuestra clase
package es.pue.myapp.model;

//PLANTILLA QUE DEFINE UN NUEVO TIPO DE DATOS
//Fully-Qualified Name: es.pue.myapp.model.Color
public class Color {
  
   //ESTADO: ATRIBUTOS/CAMPOS
   // -> ¿Qué info me interesa almacenar para este tipo de datos?
   private String name;
   private int red;
   private int green;
   private int blue;
   
   //COMPORTAMIENTO: METODOS/OPERACIONES
   // -> ¿Qué le puedo pedir a este tipo datos?
   public String getName() {
      return this.name;
   }
   
   public int getRed() {
      return this.red;
   }
   
   public int getGreen() {
      return this.green;
   }
   
   public int getBlue() {
      return this.blue;
   }
   
   public void setName(String n) {
      this.name = n;
   }
   
   public void setRed(int r) {
      this.red = r;
   }
   
   public void setGreen(int g) {
      this.green = g;
   }
   
   public void setBlue(int b) {
      this.blue = b;
   }
  
  
  
}
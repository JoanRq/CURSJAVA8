//Definición del package al que pertenece nuestra clase
package es.pue.myapp.model;

//PLANTILLA QUE DEFINE UN NUEVO TIPO DE DATOS
//Fully-Qualified Name: es.pue.myapp.model.Location
public class Location {
  
   //ESTADO: ATRIBUTOS/CAMPOS
   // -> ¿Qué info me interesa almacenar para este tipo de datos?
   private double latitude;
   private double longitude;
   
   //COMPORTAMIENTO: METODOS/OPERACIONES
   // -> ¿Qué le puedo pedir a este tipo datos?
   
   public double getLatitude() {
      return this.latitude;
   }
   
   public double getLongitude() {
      return this.longitude;
   }
   
   public void setLatitude(double lat) {
      this.latitude = lat;
   }
   
   public void setLongitude(double lng) {
      this.longitude = lng;
   }
  
  
}
public class Serpiente extends Reptil {
  protected boolean tienePatas() {
    return false;
  }
  
  protected double getPeso() throws ExcepciónDeDatosInsuficientes {
    return 2;
  }
}
public interface Herbivoro {
  int cantidad = 10;
  public abstract void comerHierba();
  public default int masticar() {
    return 13;
  }
}
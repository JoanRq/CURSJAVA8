interface TieneExoesqueleto {
  abstract int getNumSecciones();
}

abstract class Insecto implements TieneExoesqueleto {
  abstract int getNumPatas();
}

public class Escarabajo extends Insecto {
  int getNumPatas() { return 6; }
}
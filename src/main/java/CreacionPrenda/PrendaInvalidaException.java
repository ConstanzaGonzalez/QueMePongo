package Prenda;

public class PrendaInvalidaException extends RuntimeException {
  public PrendaInvalidaException() {
    super();
  }
  public PrendaInvalidaException(String causa) {
    super("La prenda es invalida, falta alguna especificacion");
  }
}
